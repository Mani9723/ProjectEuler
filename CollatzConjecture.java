import java.util.ArrayList;
import java.util.Collections;

/**
 * https://projecteuler.net/problem=14
 * PROBLEM 14:
 *
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem),
 * it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/14/18
 */
public class CollatzConjecture
{
	static int count = 0, largestCount = 0;
	public static void main(String[] args)
	{
		int specialNum = 0;
	//	ArrayList<Integer> chain = new ArrayList<>();
		long start = System.currentTimeMillis();
		for(int i = 13;i<10000000.;i+=2) {
			//System.out.println(i);
			collatzConjecture(i);
// 			if(largestCount<count) {
// 				largestCount = count;
// 				specialNum = i;
// 			}
			largestCount = Math.max(largestCount,count);
			if(largestCount<count) specialNum = 1;
			resetCount();
		}
	//	Collections.sort(chain);
		//System.out.println(specialNum + ": " +chain.get(chain.size()-1));
		System.out.println((specialNum + ": " + largestCount));
		System.out.println(System.currentTimeMillis() - start);
	}
	private static int collatzConjecture(long testValue)
	{
		++count;
		if(testValue == 1 || testValue ==0)
			return count;
		return testValue % 2 == 0 ? collatzConjecture(testValue /= 2) 
			: collatzConjecture(testValue*3 + 1);
// 		else if(testValue%2==0)
// 			return collatzConjecture(testValue /=2);
// 		else
// 			return collatzConjecture(testValue*3 + 1);
	}
	private static void resetCount()
	{
		count = 0;
	}
}
