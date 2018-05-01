import java.util.ArrayList;
import java.util.Collections;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		int tempProduct =0, largestPalindrome = 0;
		for(int i = 900;i<1000;i++){
			for(int j = 900;j<1000;j++){
				tempProduct = i*j;
				if(isPalindrome(tempProduct) &&largestPalindrome<tempProduct){
					largestPalindrome = tempProduct;
				}
				tempProduct = 0;
			}
		}
		System.out.println(largestPalindrome);
	}

	private static boolean isPalindrome(int n)
	{
		int reverseNumber =0, tempN =n;
		String number = Integer.toString(n), reverseString ="";
		for(int i = 0; i<number.length();i++)
		{
			reverseNumber = tempN%10;
			reverseString += Integer.toString(reverseNumber);
			tempN /=10;
		}
		if(Integer.parseInt(reverseString) == n){
			return true;
		}
		else
			return false;
	}
}
