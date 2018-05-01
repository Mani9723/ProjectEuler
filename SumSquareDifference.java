import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://projecteuler.net/problem=6
 *
 * PROBLEM: 6
 *
 * Find the difference between the sum of the squares
 * of the first one hundred natural numbers and the square of the sum.
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/9/18
 */
public class SumSquareDifference
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the max to sum: ");
		int maxNum = keyboard.nextInt();
		int sum=0;
		double numbers = maxNum/2;

		numbers = (maxNum*((maxNum/2)+0.5));
		int sumSquare = (int)(Math.pow(numbers,2));

		for(int i =0;i<100;i++){
			sum+=(Math.pow((i+1),2));
		}
		System.out.println(sumSquare-sum);
	}
}