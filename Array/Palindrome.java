import java.util.*;
public class Palindrome{
	public static boolean checkPalindrome(int[] arr){
		/*Approch 1
		Time Complexity = O(n)
		Space Complexity = O(n)
		*/

		/*int n = arr.length;
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++){
			arr1[i] = arr[n-1-i];
		}
		for(int i = 0; i < n; i++){
			if(arr1[i] != arr[i]){
				return true;
			}
		}*/
		
		/*Approach 2
		Time Complexity = O(n)
		Space Complexity = O(1)
		*/

		int n = arr.length;
		int mid = n/2;
		
		for(int i = 0; i < mid; i++){
			if(arr[i] != arr[n-1-i])
				return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" element of the array: ");
		for(int i = 0; i < size; i++){
			 arr[i] = sc.nextInt();
		}
		boolean result = checkPalindrome(arr);
		if(result == false){
			System.out.println(Arrays.toString(arr)+" array is palindrome.");
		}
		else{
			System.out.println(Arrays.toString(arr)+" array is not palindrome.");
		}
	}
}