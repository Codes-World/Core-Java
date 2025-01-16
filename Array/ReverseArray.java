import java.util.*;
public class ReverseArray{
	public static int[] checkReverse(int[] arr){
		
		/*Approach 1
		Time Complexity = O(n)
		Space Complexity = O(1)
		*/
		/*
		int n = arr.length;

		//Reverse element store int another array.	
		int[] arr1 = new int[n];
		
		for(int i = 0; i < n; i++){
			arr1[i] = arr[n-1-i];
		}
		return arr1;*/


		/*Approach 2
		Time Complexity = O(n)
		Space Complexity = O(1)
		*/
		
		int n = arr.length;
		int temp;
		int mid = n/2;
		for(int i = 0; i < mid; i++){
			temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		return arr; 
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the element: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements of the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		 System.out.println("Reverse array :"+Arrays.toString(checkReverse(arr)));
	}
}