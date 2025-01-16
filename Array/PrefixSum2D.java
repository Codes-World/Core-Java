import java.util.*;
//2-D Array
public class PrefixSum2D{
	public static void prefixSum(int[][] arr){
		int n = arr.length;
		int m = arr[0].length;
		
		for(int i = 0; i < n; i++){
			for(int j = 1; j < m; j++){
 				arr[i][j] = arr[i][j] + arr[i][j-1];
			}
		}

		for(int i = 1; i < n; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = arr[i][j] + arr[i-1][j];
			}
			System.out.println();
		}
	}

	public static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2){
		int sum = 0, up = 0, left = 0, repeatedRegion = 0;
		sum = arr[r2][c2];
		up = arr[r1-1][c2];
		left = arr[r2][c1-1];
		repeatedRegion = arr[r1-1][c1-1];
		int result = sum - up - left + repeatedRegion;
		return result;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows in the array: ");
		int size = sc.nextInt();

		System.out.println("Enter the no. of columns in the array: ");
		int size1 = sc.nextInt();

		int[][] arr = new int[size][size1];
		System.out.println("Enter elements of the 2-D array: ");
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size1; j++){
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for(var i : arr){
			System.out.println(Arrays.toString(i));
		}
		
		System.out.println("Watch the above Matrix, Enter the coordinates of row1 to column1 and row2 to column2 for the prefix sum");
		System.out.println("Enter the row1 coordinates: ");
		int r1 = sc.nextInt();

		System.out.println("Enter the column1 coordinates: ");
		int c1 = sc.nextInt();

		System.out.println("Enter the row2 coordinates: ");
		int r2 = sc.nextInt();

		System.out.println("Enter the column2 coordinates: ");
		int c2 = sc.nextInt();

		prefixSum(arr);
		int result = sumRegion(arr, r1, c1, r2, c2);
		System.out.println("The prefix sum "+r1+" "+c1+" and "+r2+" "+c2+" are: "+result);
	}
}