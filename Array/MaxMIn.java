import java.util.*;
public class MaxMin{
	public static int maxElement(int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int minElement(int[] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.print("\nEnter the element of the array: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		System.out.print("\nMaximum element of the array: "+maxElement(arr));
		System.out.print("\nMinimum element of the array: "+minElement(arr));
	}
}