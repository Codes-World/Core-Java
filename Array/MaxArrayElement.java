import java.util.*;
import java.io.*;
public class MaxArrayElement{
	public static void maxElement(int[] arr){
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			if(max < arr[i])
				max = arr[i];
		}
		System.out.print(max);
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
		
		maxElement(arrayElement);
	}
}
