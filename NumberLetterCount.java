import java.util.*;

/**
 * https://projecteuler.net/problem=17
 *
 * PROBLEM 17:
 *If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 *
 ************Try to use hash maps
 *
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/16/18
 */
public class NumberLetterCount
{
	static Scanner keyboard = new Scanner(System.in);
	private static HashMap<Integer,String> onesPlace = new HashMap<>();
	private static HashMap<Integer,String> teensPlace = new HashMap<>();
	private static HashMap<Integer,String> tensPlace = new HashMap<>();
	private static int total = 0;

	public static void main(String[] args)
	{
		String finalWord;
		ones();
		teens();
		ten();
		for(int i = 1; i<=1000;i++){
			String numWord = Integer.toString(i);
			if(numWord.length()<3){
				if(numWord.length()==1){
					finalWord = onesPlace.get(i);
				}
				else{
					if(i>10&&i<20){
						finalWord = teensPlace.get(i);
					}
					else if(i%10==0){
						finalWord = tensPlace.get(i/10);
					}
					else{
						finalWord = teensPlace.get(i/10) + "" + onesPlace.get(i%10);
					}
				}
			}
			else{
				if(i%100==0){
					if(i%10 == 0){
						finalWord = onesPlace.get(i/100) + "hundredand" + tensPlace.get(i/10);
					}
					else
						finalWord = onesPlace.get(i/100)+"Hundred";
				}
				else if (numWord.charAt(1)=='0'){
					finalWord = onesPlace.get(i/100) + "hundredand" +onesPlace.get(i%100);
				}
				else if (i % 100 > 10 && i % 100 < 20) {
					finalWord = onesPlace.get(i / 100) + "hundredand"
							+ teensPlace.get(i % 100);
				} else {
					finalWord = onesPlace.get(i / 100) + "hundredand"
							+ tensPlace.get((i % 100) / 10) + "" + onesPlace.get((i % 100) % 10);
				}
			}
			System.out.println(sum(finalWord.length()));
		}

		//String thousand = "OneThousand";
		//sum(thousand.length());
		System.out.println(total);
	}
	private static int sum(int num)
	{
		return total += num;
	}
	private static void ones()
	{
		onesPlace.put(1,"One");
		onesPlace.put(2,"Two");
		onesPlace.put(3,"Three");
		onesPlace.put(4,"Four");
		onesPlace.put(5,"Five");
		onesPlace.put(6,"Six");
		onesPlace.put(7,"Seven");
		onesPlace.put(8,"Eight");
		onesPlace.put(9,"Nine");
	}
	private static void teens()
	{
		teensPlace.put(10,"Ten");
		teensPlace.put(11,"Eleven");
		teensPlace.put(12,"Twelve");
		teensPlace.put(13,"Thirteen");
		teensPlace.put(14,"Fourteen");
		teensPlace.put(15,"Fifteen");
		teensPlace.put(16,"Sixteen");
		teensPlace.put(17,"Seventeen");
		teensPlace.put(18,"Eighteen");
		teensPlace.put(19,"Nineteen");
	}
	private static void ten()
	{
		tensPlace.put(1,"Ten");
		tensPlace.put(2, "Twenty");
		tensPlace.put(3, "Thirty");
		tensPlace.put(4, "Forty");
		tensPlace.put(5, "Fifty");
		tensPlace.put(6, "Sixty");
		tensPlace.put(7, "Seventy");
		tensPlace.put(8, "Eighty");
		tensPlace.put(9, "Ninety");
	}
	/*
	if(i<100){
	if(i<10){
		String numWord = onesPlace.get(i);
		sum(numWord.length());
	}
	else{
		if(i<20) {
			String finalWord = teensPlace.get(i);
			sum(finalWord.length());
		}
		else{
			int tempTen = i/10;
			int tempOne = i%10;
			String finalWord = tens.get(tempTen) +""+onesPlace.get(tempOne);
			sum(finalWord.length());
		}
	}
}
			else{
	int tempHundred = i/100;
	int tempTen = (i%100)/10;
	int tempOne = (i%100)%10;
	String finalWord = onesPlace.get(tempHundred)+"hundredand"
			+tens.get(tempTen)+""+onesPlace.get(tempOne);
	sum(finalWord.length());
}
*/
}
