import sun.awt.image.ImageWatched;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * For example, when the list is sorted into alphabetical order, COLIN,
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
public class NameScores
{
	public static void main(String[] args)
	{
		int sum = 0;
		String names[] = getNames().toLowerCase().replace("\"", "").split(",");
		Arrays.sort(names);
//		System.out.println(names[937]);
//		System.out.println(sumName(names[937])*938);
		long time = System.nanoTime();
		sum = getSumOfLetters(sum, names);
		System.out.println(System.nanoTime()-time);
		System.out.println(sum);
	}

	private static int getSumOfLetters(int sum, String[] names)
	{
		for(int i = 0; i<names.length;i++){
			sum += (i+1)*sumName(names[i]);
		}
		return sum;
	}

	private static int sumName(String name)
	{
		int sum = 0;
		for(int i = 0; i<name.length();i++){
			sum += name.charAt(i)-96;
		}
		return sum;
	}

	private static String getNames()
	{
		String names = "";
		try{
			names = new Scanner(new File("src\\p022_names.txt")).next();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return names;
	}
}
