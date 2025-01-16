import java.util.*;
import java.io.*;
public class Factorial{
	static int factorialNum(int n){
		int result;
		if(n == 1)
			return 1;
		else
			result = n * factorialNum(n-1);
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial: ");
		int num = sc.nextInt();
		
		int result = factorialNum(num);
		System.out.println("Factorial of "+num+" is "+result);
	}
}