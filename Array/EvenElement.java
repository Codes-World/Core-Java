import java.util.*;
import java.io.*;
public class EvenElement{
	public static void printEvenElement(int[] arr){
		for(int i : arr){
			if(i%2 == 0)
				System.out.print(i+" ");
		}
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
		
		printEvenElement(arrayElement);
	}
}
