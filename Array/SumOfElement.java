import java.util.*;

public class SumOfElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int len = sc.nextInt();

		int[] arr = new int[len];
		System.out.println("Enter the "+len+" elements in the array: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i : arr){
			sum += i;
		}
		System.out.print("\nSum of the element of the array: "+sum);
	}
}