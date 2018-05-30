/**
 * https://projecteuler.net/problem=9
 *
 * PROBLEM 9:
 *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a^2 + b^2 = c^2
 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

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
		/*
		a = m^2 - n^2
		b = 2mn
		c = m^2 + n^2

		for all m, n E Z | m > n
		 */
		int a,b,c;
		for(int n = 3; n < 1000; n++){
			for(int m = n+1 ; m<1000;m++){
				a = (m*m) - (n*n);
				b = 2*m*n;
				c = (m*m) + (n*n);
				if(a+b+c == 1000) {
					System.out.println(a * b * c);
					break;
				}
			}
		}
	}
}
