import java.math.BigInteger;
import java.util.Random;

/**
 * https://projecteuler.net/problem=15
 *
 * PROBLEM 15:
 *
 * Starting in the top left corner of a 2×2 grid,
 * and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/14/18
 */
public class LatticePaths
{
	/**
	 * Plan:
	 * 1) Valid Moves: [row-1][col] down
	 * 2) Valid Moves: [row][col+1]  right
	 * 3) Start: (0,0)
	 * 4) Finish: (2,2) -> (20,20)
	 * 5) Create random choice between right and down
	 * 6) make a valid move boolean method
	 * 7) Use recursive backtracking
	 * 8)
	 *
	 *
	 * @param args
	 */
	static BigInteger n = new BigInteger("20");
	static BigInteger twice = new BigInteger("2");
	static BigInteger one = new BigInteger("1");
	static BigInteger number = n.multiply(twice);
	public static void main(String[] args)
	{
	//	int n = 20;
	//	int number = 2*n;
		BigInteger top = fact(number);

		BigInteger bottom = fact(n).pow(2);

		BigInteger path = (top.divide(bottom));

		System.out.println(path);
	}
	private static BigInteger fact(BigInteger n)
	{
		if(n.equals(0)) return one;
		else
			return (n.multiply(fact(n.subtract(one))));
			//return ((2*n)*fact((2*n)-1));
	}

}
