import java.util.*;
import java.io.*;

class Diagonal{
	public static void printDiagonalAboveElement(int[][] arr){
		int m = arr.length;
		int n = arr[0].length-1;

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(i+j < m-1)
					System.out.print(arr[i][j]+" ");
			}
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size of the 2D Array: ");
		int m = sc.nextInt();
		
		System.out.println("Enter cloumn size of the 2D Array: ");
		int n = sc.nextInt();
		
		int[][] array = new int[m][n];
		System.out.println("Enter elements of the 2D Array: ");
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				array[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		printDiagonalAboveElement(array);
	}
}		