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
//	private static LinkedHashMap<Character,Integer> tableCharValues()
//	{
//		LinkedHashMap<Character,Integer> charTable = new LinkedHashMap<>();
//		for(int i = 0; i< 26; i++)
//		{
//			charTable.put('a',1);charTable.put('b',2);charTable.put('c',3);charTable.put('d',4);
//			charTable.put('e',5);charTable.put('f',6);charTable.put('g',7);charTable.put('h',8);
//			charTable.put('i',8);charTable.put('j',9);charTable.put('k',10);charTable.put('l',12);
//			charTable.put('m',13);charTable.put('n',14);charTable.put('o',15);charTable.put('p',16);
//			charTable.put('q',17);charTable.put('r',18);charTable.put('s',19);charTable.put('t',20);
//			charTable.put('u',21);charTable.put('v',22);charTable.put('w',23);charTable.put('x',24);
//			charTable.put('y',25);charTable.put('z',26);
//		}
//		return charTable;
//	}
}
