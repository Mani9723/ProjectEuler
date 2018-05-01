/**
 *https://projecteuler.net/problem=16
 *
 *
 * @author Mani SHah
 * @version 1.0
 * @since 2/15/18
 */

import java.math.BigInteger;

public class PowerDigitSum
{
	public static void main(String[] args)
	{
		BigInteger number = new BigInteger("2");
		BigInteger newNumber = number.pow(1000);
		String convert = newNumber.toString();
		long sum = 0L;
		for(int i = 0; i<convert.length();i++){
			sum += Long.parseLong(convert.substring(i,i+1));
		}
		System.out.println(sum);

	}
}
