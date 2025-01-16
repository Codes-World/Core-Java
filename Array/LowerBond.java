import java.util.*;
import java.io.*;

public class LowerBond{
	public static int findFirstOcurrence(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element: ");
		int element = sc.nextInt();
		
		int startIndex = 0;
		int lastIndex = arr.length;
		int mid;
		int result = -1;

		while(startIndex <= lastIndex){
			mid = startIndex + (lastIndex - startIndex)/2;
			if(arr[mid] == element){
				result = mid;
				lastIndex = mid-1;
			}
			else if(arr[mid] < element){
				startIndex = mid + 1;
			}
			else{
				lastIndex = mid - 1;
			}
		}
		return result;	
	}

	public static void main(String[] args){
		int[] arr = {2,4,7,7,9,9,9};
		int result = findFirstOcurrence(arr);
		if(result == -1)
			System.out.println("This element no found in the array");
		else
			System.out.println("First time occured in the array at index: "+result);
	}
}