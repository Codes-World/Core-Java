import java.util.*;
import java.io.*;

public class SquareRoot{
	public static int squareRootNumber(int n){
		int startIndex = 0;
		int lastIndex = n;
		int mid;
		int result = 0;
		int square = 0;
		while(startIndex <= lastIndex){
			mid = startIndex + (lastIndex - startIndex)/2;
			square = mid*mid;
			if(square == n){
				return mid;
			}
			else if(square < n){
				result = mid;
				startIndex = mid + 1;
			}
			else{
				lastIndex = mid - 1;
			}
		}
		return result;	
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and find out the square root number or floor number: ");
		int num = sc.nextInt();
		int result = squareRootNumber(num);
		System.out.println("Square root number or floor number is: "+result);
	}
}