import java.util.*;
import java.io.*;
public class EvenIndicesElement{
	public static void printEvenIndicesElement(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i=i+2){
			sum = sum + arr[i];
		}
		System.out.print(sum);
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
		
		printEvenIndicesElement(arrayElement);
	}
}
