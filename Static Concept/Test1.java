import java.util.*;
import java.io.*;

public class Test1{
	public static void main(String[] args){
		Farmer f1 = new Farmer();
		f1.input();
		f1.calculateSI();
		f1.dis();

		System.out.println();

		Farmer f2 = new Farmer();
		f2.input();
		f2.calculateSI();
		f2.dis();

		System.out.println();
		
		Farmer f3 = new Farmer();
		f3.input();
		f3.calculateSI();
		f3.dis();
	}
}

class Farmer{
	//instance variable
	float p, si, t;
	
	//static variable
	static float r;
	static{
		r = 2.5f;
	}
	
	//instance method
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of principle amount :: ");
		p = sc.nextFloat();

		System.out.print("Enter the value of time period :: ");
		t = sc.nextFloat();

		sc.close();
	}

	//instance method
	public void calculateSI(){
		si = (p*t*r)/100;
	}

	//instance method
	public void dis(){
		System.out.print("SI is :: "+si);
	}
}
