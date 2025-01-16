import java.util.*;
import java.io.*;

public class PrintAllSequence{
	//PrintSquence Mthod
	public static void printSequence(int[] arr, int index, ArrayList<Integer> tempArray){
		//Base Case
		if(index == arr.length){
			if(tempArray.size() > 0){
				System.out.print(" "+tempArray);
			}
		}
		
		//Recursive Call
		else{
			printSequence(arr, index+1, tempArray);
			tempArray.add(arr[index]);
			printSequence(arr, index+1, tempArray);
			tempArray.remove(tempArray.size()-1);
		}
	}
	
	//Main Method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the size of the array: ");
		int len = sc.nextInt();
		
		int[] array = new int[len];
		System.out.print("\nEnter array elements: ");
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		
		//Method Call
		printSequence(array, 0, new ArrayList<Integer>());
	}
}