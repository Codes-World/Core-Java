import java.util.*;
import java.io.*;
public class PickFirstElement{
	public static int largestWithNeighbor(int[] arr){
		for(int i = 1; i < arr.length-1; i++){
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
				return i;
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array's Size: ");
		int size = sc.nextInt();
		
		int[] arrayElement = new int[size];
		System.out.println("Enter elements of the array: ");
		for(int i = 0; i < size; i++){
			arrayElement[i] = sc.nextInt();
		}
		int result = largestWithNeighbor(arrayElement);
		if(result != -1){
			System.out.print(arrayElement[result]+" is array element present at index "+result+" that is greater than its just left and just right neighbor.");
		}
		else
			System.out.print("No any first element found that is greater than its just left and just right neighbor.");
	}
}
