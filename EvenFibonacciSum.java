import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=2
 *
 * PROBLEM 2:
 *
 * Simple problem to sum the even fibonacci sequence
 * Domain : {1 < x < 4,000,000}
 *
 * @author Mani Shah
 * @version 1.0
 */
public class EvenFibonacciSum
{
	private static ArrayList<Float> sum = new ArrayList<>();
	static int add=0;
	public static float fibonacci(int x){

		float[] sequence = new float[x];
		sequence[0] = 1;
		sequence[1] = 1;
		if (x > 1){
			for (int i = 2; i < x; i++){
				sequence[i] = sequence[i-1] + sequence[i-2];
			}
		}
		for (float z : sequence){
			if(z>4000000){
				System.exit(0);
			}
			if(z%2==0) {
				System.out.print("" + z + ",\n");
				add+=z;
				System.out.println(add);
			}
		}
		return sequence[x-1];
	}

	public static void main(String[] args)
	{
		fibonacci(100);

	}
}
