/**
 * https://projecteuler.net/problem=5
 *
 * PROBLEM 5:
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
 * without any remainder.
 * What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20?
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/9/18
 */
public class SmallestMultiple
{
	public static void main(String[] args)
	{

		int n = 2520,i=20, value =0;
		boolean found = false;
		long startTime = System.currentTimeMillis();
		for(int j = n; j<Math.pow(n,3);j++) {
			for(int k = 0;k<20;k++) {
				if(j%(k+1)!=0) {
					break;
				}
				else if((k+1)==i) {
					found = true;
					break;
				}
			}
			if(found){
				value = j;
				break;
			}
		}
		System.out.println(value);
		long endTime = System.currentTimeMillis();
		endTime -= startTime;
		System.out.println("It took " + endTime + " seconds");

	}
}
