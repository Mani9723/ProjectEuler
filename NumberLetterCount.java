import java.util.*;

/**
 * https://projecteuler.net/problem=17
 *
 * PROBLEM 17:
 *If the numbers 1 to 5 are written out in words:
 * one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 *
 *
 * NOTE: Do not count spaces or hyphens.
 * For example, 342 (three hundred and forty-two) contains 23 letters and
 * 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 *
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/16/18
 */
public class NumberLetterCount
{
	private String[] onesArray = {"one","two","three","four","five","six","seven","eight","nine"};
	private String[] tensArray = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	private String hundred = "hundred";
	private String[] elevens = {"Eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private String and = "and";
	private int sumLetters;

	public NumberLetterCount()
	{
		sumLetters = onesArray[0].length()+"onethousand".length();
	}

	public int getTotal()
	{
		String currNum;
		int len;
		for(int i = 2; i<1000;i++){
			currNum = Integer.toString(i);
			len = currNum.length();
			if(len==1) sumLetters += handleSingleDigits(i);
			else if(len == 2) sumLetters += handleTwoDigits(i);
			else if(len == 3) sumLetters += handleThreeDigits(i);
		}
		return sumLetters;
	}

	private int handleSingleDigits(int index)
	{
		return onesArray[index-1].length();
	}

	private int handleTwoDigits(int index)
	{
		if(index % 10 == 0) return tensArray[(index/10) - 1].length();
		else if(index>10 && index <20) return elevens[(index%10) - 1].length();
		else return tensArray[(index/10)-1].length() + onesArray[(index%10) - 1].length();
	}

	private int handleThreeDigits(int index)
	{
		// 100,200...
		if(index % 100 == 0) return onesArray[(index/100) - 1].length() + hundred.length();

		// 101,201,909..
		else if(index % 100 > 0 && index % 100 < 10)
			return onesArray[(index/100) - 1].length()
					+ hundred.length() + and.length() + onesArray[(index%100)-1].length();
		//110,240...
		else if((index%100)%10==0) return onesArray[(index/100)-1].length() + hundred.length() + and.length()
				+ tensArray[((index%100)/10) -1].length();

		//111,316,917...
		else if(index % 100 >= 11 && index % 100 <20)
			return onesArray[(index/100)-1].length() + hundred.length()
					+ and.length() + elevens[((index%100)%10)-1].length();

		else return onesArray[(index/100)-1].length() + hundred.length() + and.length()
					+ tensArray[((index%100)/10)-1].length() + onesArray[((index%100)%10)-1].length();

	}


	public static void main(String[] args)
	{
		NumberLetterCount numberLetterCount = new NumberLetterCount();
		long start = System.currentTimeMillis();
		System.out.println(numberLetterCount.getTotal());
		System.out.println(System.currentTimeMillis()-start);
	}

}
