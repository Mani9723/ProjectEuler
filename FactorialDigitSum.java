import java.util.stream.IntStream;

public class FactorialDigitSum
{
	public static void main(String[] args)
	{
		String num = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
		int[] array = new int[num.length()];

		for(int i = 0; i<num.length();i++){
			array[i] = Integer.parseInt(num.substring(i,i+1));
		}
		System.out.println(IntStream.of(array).sum());
	}
}
