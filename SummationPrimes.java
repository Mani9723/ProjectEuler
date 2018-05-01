import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.Collections;

/**
 * https://projecteuler.net/problem=10
 *
 * PROBLEM 10:
 *
 * Find the sum of all primes below two million
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/11/18
 *
 */
public class SummationPrimes
{
	public static void main(String[] args)
	{
		long[] array = new long[10000000];
		long sum = 2l;
		array[0] = 2;
		for(int i = 3; i< 2000000;i+=2){
			if(isPrime(i)){
				array[i-2] = i;
				sum += array[i-2];
			}
		}
		System.out.println(sum);
	}
	private static boolean isPrime(int n) {
		if(n==2) return true;
		if(n%2==0) return false;
		for(int i = 3; i <= Math.sqrt(n); i+=2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
