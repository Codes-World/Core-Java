import java.util.*;
import java.io.*;
public class NthFibonacci{
	static int fabonacciSeries(int n){
		int result=0;
		if(n == 0 || n == 1)
			return n;
		else
			result = fabonacciSeries(n-1)+fabonacciSeries(n-2);
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial: ");
		int num = sc.nextInt();
		
		int result = fabonacciSeries(num);
		System.out.println("Fibonacci  Series of "+num+" is "+result);
	}
}