import java.util.*;
public class MissingNumber{
	public static int findMissingNumber(int[] arr){
		
		/*Approach 1
		Time Complexity = O(n)
		Space Complexity = O(1)
		*/
		/*int n = arr.length;
		int totalSum = n*(n+2)/2;
		int sumOfElement = 0;

		for(int i = 0; i < n; i++){
			sumOfElement += arr[i];
		}
		
		int missingElement = totalSum - sumOfElement;

		return missingElement;*/

		/*Approach 2
		Time Complexity = O();
		Space Complexity = O();
		*/
		
		int total = 1;
		int n = arr.length;
		for(int i = 2; i <= (n+1); i++){
			total += i;
			total -= arr[i-2];
		}
		return total;  
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

		 System.out.println("Missing Number in the array is:"+findMissingNumber(arr));
	}
}