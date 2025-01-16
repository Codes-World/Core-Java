import java.util.*;
import java.io.*;

public class BinarySearch{
	public static int binarySearch(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element: ");
		int element = sc.nextInt();
		
		int startIndex = 0;
		int lastIndex = arr.length;
		int mid;

		while(startIndex < lastIndex){
			mid = startIndex + (lastIndex - startIndex)/2;
			if(arr[mid] == element){
				return mid;
			}
			else if(arr[mid] < element){
				startIndex = mid + 1;
			}
			else{
				lastIndex = mid - 1;
			}
		}
		return 0;	
	}

	public static void main(String[] args){
		int[] arr = {2,4,6,12,14,16};
		int result = binarySearch(arr);
		System.out.println("Search element is: "+result);
	}
}