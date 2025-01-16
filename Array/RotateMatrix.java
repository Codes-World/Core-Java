import java.util.*;
public class RotateMatrix{
	public static void toRotate(int[][] arr){
		int n = arr.length;
		int m = arr[0].length;

		for(int i = 0; i < n; i++){
			for(int j = i; j < m; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for(int i = 0; i < n; i++){
			int leftIndex = 0;
 			int rightIndex = n-1;
			while(leftIndex < rightIndex){
				int temp = arr[i][leftIndex];
				arr[i][leftIndex] = arr[i][rightIndex];
				arr[i][rightIndex] = temp;
				leftIndex++;
				rightIndex--;
			}
		}
	}
	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5,6}};
		toRotate(arr);
		for(var i : arr){
			System.out.print(Arrays.toString(i)+"\n");
		}
	}
}