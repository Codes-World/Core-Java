import java.util.*;
//1-D Array
public class PrefixSum{
	public static void prefixSum(int[] arr){
		int n = arr.length;
		for(int i = 1; i < n; i++){
			arr[i] = arr[i] + arr[i-1];
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		prefixSum(arr);
		System.out.print(Arrays.toString(arr));
	}
}