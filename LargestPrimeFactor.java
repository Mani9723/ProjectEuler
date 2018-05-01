import java.util.ArrayList;
import java.util.Collections;

/**
 * https://projecteuler.net/problem=3
 *
 * PROBLEM 3:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/7/17
 */
public class LargestPrimeFactor
{
	public static void main(String[] args)
	{
		ArrayList<Integer> value =new ArrayList<>();
		value.ensureCapacity(50);

		long number = 600851475143L;
	//	int number = 13195;
		for(int i =3;i<Math.sqrt(number);i+=2){
			if(number%i==0 && isPrime(i)){
				value.add(i);
			}
		}
		Collections.sort(value);
		System.out.println(value.get(value.size()-1));
	}
	private static boolean isPrime(int n)
	{
		if(n%2==0)
			return false;
		for(int i=3;i<Math.sqrt(n);i+=2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
