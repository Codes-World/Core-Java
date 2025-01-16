import java.util.*;
import java.io.*;
public class NumberPower{
	static long calNumberPower(int num, int power){
		long result=0;
		long finalResult = 0;
		if(power == 1)
			return num;
		else{
			result =(long)calNumberPower(num, power/2);
			finalResult = result * result;
			if(power%2 != 0)
				finalResult = num * finalResult;
		}
		return finalResult;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate power of the number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter power of the number: ");
		int power = sc.nextInt();

		long result = calNumberPower(num, power);
		System.out.println(num+" to the power of "+power+" is "+result);
	}
}