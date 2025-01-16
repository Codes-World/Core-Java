import java.util.*;
import java.io.*;
public class SumOfDigits{
	public static int sumOfDigits(int n){
		int rem = 0;
		int sum = 0;
		if(n <= 0)
			return 0;
		else{
			rem = n%10;
			sum = rem + sumOfDigits(n/10);;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stairs: ");
		int n = sc.nextInt();

		int result = sumOfDigits(n);
		System.out.println("Sum of digits are "+result);
	}
}