import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=7
 *
 * PROBLEM 7:
 *  find the nth prime number
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/9/18
 */
public class nthPrime
{
	public static void main(String[] args)
	{
		ArrayList<Integer> primes = new ArrayList<>();
		ArrayList<Integer> actualPrimes = new ArrayList<>(0);
		int count =0, nth = 10000000, i =2;
		primes.add(2);
		long start = System.currentTimeMillis();

		while(count<nth){
			System.out.println(count);
			if(isPrime(i)){
				++count;
			}
			i++;
		}
		System.out.println(i-1);



		long end = System.currentTimeMillis();
		System.out.println("It took " + (end-start) + " milliseconds");

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


