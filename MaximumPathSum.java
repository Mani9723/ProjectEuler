import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumPathSum
{

	public static void main(String[] args)
	{
		int[][] matrix = readFile();
		System.out.println(getMaxPathSum(matrix));

	}

	private static int getMaxPathSum(int[][] matrix)
	{
		int sum = 0;
		int startRow = matrix.length - 2;

		for(int currRow = startRow; currRow >= 0; currRow --){
			for(int col = 0; col < matrix.length; col ++){
				if(matrix[currRow][col]==0) break;
				sum = matrix[currRow][col]
						+ Math.max(matrix[currRow+1][col],matrix[currRow+1][col+1]);
				matrix[currRow][col] = sum;
			}
		}
		return matrix[0][0];
	}

	private static int[][] readFile()
	{
		int[][] grid = new int[100][100];
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new File("src\\p067_triangle.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		int currCol = 0;
		while(inputStream.hasNextLine()){
			for(int row = 0; row< 100;row++){
				++currCol;
				for(int col = 0; col < currCol;col++){
						grid[row][col] = inputStream.nextInt();
				}
			}
		}
		System.out.println("Success!\nFile saved in a 15x15 matrix");
		inputStream.close();
		return grid;
	}


}
