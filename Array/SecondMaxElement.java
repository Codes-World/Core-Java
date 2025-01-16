import java.util.*;
import java.io.*;
public class SecondMaxElement{
	public static void secondMaxElement(int[] arr){
		Arrays.sort(arr);
		int len = arr.length;
		System.out.print(arr[len-2]);
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
		
		secondMaxElement(arrayElement);
	}
}
