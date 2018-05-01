/**
 * https://projecteuler.net/problem=9
 *
 * PROBLEM 9:
 *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 *
 ******So I just have to find  a,b,c where a<b<c and their sum =1000
 * *****the answer is the product.
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/11/18
 */
public class PythagoreanTriplets
{
	public static void main(String[] args)
	{
		int m=1;
		int finalSum = 1000;

		for(int i =0;i<10;i++){
			int a = 2*m;
			int b = (m*m) -1;
			int c = (m*m)+1;
			System.out.printf("%d\n%d\n%d\n\n",a,b,c);
			m++;
		}


	}
}
