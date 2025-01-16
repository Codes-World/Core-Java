import java.util.*;
import java.io.*;
public class SumOfNaturalNumber{
	public static int sumOfNaturalNumber(int n){
		int result = 0;
		if(n <= 1)
			return n;
		else{
			if(n%2 == 0)
				result = sumOfNaturalNumber(n-1) - n;
			else
				result = sumOfNaturalNumber(n-1) + n;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int result = sumOfNaturalNumber(n);
		System.out.println("Sum of digits are "+result);
	}
}