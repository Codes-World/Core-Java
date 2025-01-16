import java.util.*;
import java.io.*;

public class Print2DArray{
	public static void performOperations(int[][] arr){
		int m = arr.length;
		int n = arr[0].length;
		int posNumber = 0;
		int negNumber = 0;
		int oddNumber = 0;
		int evenNumber = 0;
		int noOfZero = 0;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(arr[i][j] > 0)
					posNumber++;
				if(arr[i][j] < 0)
					negNumber++;
				if(arr[i][j]%2 != 0)
					oddNumber++;
				if(arr[i][j]%2 == 0)
					evenNumber++;
				if(arr[i][j] == 0)
					noOfZero++;
			}
		}
		System.out.print("Number of Positive Numbers: "+posNumber);
		System.out.print("\nNumber of Negative Numbers: "+negNumber);
		System.out.print("\nNumber of Odd Numbers: "+oddNumber);
		System.out.print("\nNumber of Even Numbers: "+evenNumber);
		System.out.print("\nNumber of Zeros (0): "+noOfZero);
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
		performOperations(array);
	}
}		