/**
 * https://projecteuler.net/problem=11
 *
 * PROBLEM 11:
 *
 * Find the largest product created by four numbers in the grid in any consecutive direction
 *
 * *****
 *plan: look for 9's and start from there
 *      multiply four numbers to right, left, down, up, diagonal(r,l,u,d);
 * *****
 *
 * @author Mani Shah
 * @version 1.0
 * @since 2/11/18
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GridProduct
{
	static int[][] grid = new int[20][20];
	static boolean left =false,right = false, up = false, down = false;


	public static void main(String[] args)
	{
		long finalProduct = 0L;
		String gridFile = "C:\\Users\\Home\\Desktop\\Grid.txt";

		readFromFile(gridFile);
		printMatrix(grid);
		long start = System.currentTimeMillis();
		finalProduct = product(grid);
		System.out.println(finalProduct);
		System.out.println(System.currentTimeMillis() - start);
	}

	private static void readFromFile(String fileName)
	{
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new File(fileName));
		}
		catch (FileNotFoundException e){
			System.out.println("ERROR");
			System.exit(1);
		}
		while(inputStream.hasNextInt()){
			for(int row = 0; row< grid.length;row++){
				for(int col = 0; col <20;col++){
					grid[row][col] = inputStream.nextInt();
				}
			}
		}
		System.out.println("Success!\nFile saved in a 20x20 matrix");
		inputStream.close();
	}
	private static void printMatrix(int[][] matrix)
	{
		for(int row = 0; row<matrix.length; row ++){
			for(int col = 0; col<matrix.length;col++){
				System.out.format("%02d \t",matrix[row][col]);
			}
			System.out.println();
		}
	}
	private static long product(int[][] grid)
	{
		long product =0L;
		long largestProduct = 0L;

		for(int row = 3; row<grid.length-3;row++){
			for(int col = 3; col<grid.length-3;col++ ){
			//	if(grid[row][col]%10 == 9){
				product = storeInArray(grid,row,col);
				if(largestProduct<product){
					largestProduct = product;
				}
				product =0L;
			}
		}
		return largestProduct;
	}
	private static long storeInArray(int[][] matrix, int row, int col)
	{
		long[] productArray = new long[8];
		productArray[0] = right(matrix,row,col);
		productArray[1] = left(matrix,row,col);
		productArray[2] = up(matrix,row,col);
		productArray[3] = down(matrix,row,col);
		productArray[4] = diagonalNorthEast(matrix,row,col);
		productArray[5] = diagonalNorthWest(matrix,row,col);
		productArray[6] = diagonalSouthEast(matrix,row,col);
		productArray[7] = diagonalSouthWest(matrix,row,col);

		Arrays.sort(productArray);
		return productArray[productArray.length-1];
	}

	private static long right(int[][] matrix,int row, int col)
	{
		long product = 1L;
		for(int i = 0; i<4;i++){
			product *= matrix[row][col+i];
		}
		return product;
	}
	private static long left(int[][]matrix, int row, int col)
	{
		long product = 1L;
		for(int i = 0; i<4;i++){
			product *= matrix[row][col-i];
		}
		return product;
	}
	private static long up(int[][] matrix, int row, int col)
	{
		long product = 1L;
		for(int i = 0; i< 4; i++) {
			product *= matrix[row-i][col];
		}
		return product;
	}
	private static long down(int[][] matrix, int row, int col)
	{
		long product = 1L;
		for(int i = 0; i< 4; i++) {
			product *= matrix[row+i][col];
		}
		return product;
	}
	private static long diagonalSouthEast(int [][] matrix, int row, int col)
	{
		long product = 1L;
		for(int i = 0; i< 4; i++) {
			product *= matrix[row+i][col+i];
		}
		return product;
	}
	private static long diagonalNorthWest(int [][] matrix, int row, int col)
	{
		long product = 1L;
		for(int i = 0; i< 4; i++) {
			product *= matrix[row-i][col-i];
		}
		return product;
	}

	private static long diagonalNorthEast(int [][] matrix, int row, int col)
	{
		long product = 1L;
		for(int i = 0; i< 4; i++) {
			product *= matrix[row-i][col+i];
		}
		return product;
	}
	private static long diagonalSouthWest(int [][] matrix, int row, int col)
	{
		long product = 1L;
		for(int i = 0; i< 4; i++) {
			product *= matrix[row+i][col-i];
		}
		return product;
	}
}
