import java.util.ArrayList;

/**
 * www.projectEuler.net/problem=1
 *
 * PROBLEM 1:
 *    If we list all the natural numbers below 10 that are multiples of 3 or 5,
 *    we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *    Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Mani Shah
 * @version 1.0
 *
 */
public class MultiplesOThreeFive
{
	private ArrayList<Integer> multiples;
	private static final int THREE = 3;
	private static final int FIVE = 5;
	private int max,sum=0;

	/**
	 * Main Contrustor
	 * No parameters
	 * Initializes the ArrayList and the max value
	 */
	public MultiplesOThreeFive()
	{
		this.max = 0;
		multiples = new ArrayList<>();
	}
	/**
	 * Goes through the number within the given range
	 * Stores appropriate values in arraylist
	 * Sums the value at the same time.
	 * @param max
	 * int-Maximum value of the search
	 */
	private void findMultiples(int max)
	{
		this.max = max;
		for(int i = 1; i<this.max;i++){
			if(i%3 ==0 || i%5==0){
				storeArrayList(i);
				sum += i;
			}
		}
	}

	/**
	 * Simply stores a value to the arraylist
	 * @param value
	 * int
	 */
	private void storeArrayList(int value)
	{
		multiples.add(value);
	}

	/**
	 * Accesor for static variable sum
	 * @return sum
	 */
	public int getSum()
	{
		return sum;
	}
	/**
	 * Returns the pertinent information to the user
	 * @return final string
	 */
	public String toString()
	{
		return "The sum of the multiples is: " + getSum()
				+"\nThere are " + multiples.size() + " numbers that are multiples of 3 & 5"
				+ "\nThose natural numbers are: " + multiples;
	}

	public static void main(String[] args)
	{
		MultiplesOThreeFive num = new MultiplesOThreeFive();
		num.findMultiples(1000);
		System.out.println(num);
	}

}
