import java.util.*;
public class TransposeMatrix{
	public static int[][] toRotate(int[][] arr){
		int n = arr.length;
		int m = arr[0].length;
		int[][] arr1 = new int[m][n];

		for(int i = 0; i < n; i++){
			for(int j = 0, k = 0; j < m; j++,k++){
				arr1[k][i] = arr[i][j];
			}
		}

		return arr1;
	}
	public static void main(String[] args){
		int[][] arr = {{1,2},{4,5}};
		arr = toRotate(arr);
		for(var i : arr){
			System.out.print(Arrays.toString(i)+"\n");
		}
	}
}