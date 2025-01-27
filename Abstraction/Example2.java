import java.util.*;
import java.io.*;

public class Example2{
	public static void main(String[] args){
		//Creating a reference variable of Shape
		Shapee s;
		
		//Working with Square Object
		s = new Square();
		s.input();
		s.calcArea();
		s.disp(); //generic method

		System.out.println();

		//Working with Rectangle Object
		s = new Rectanglee();
		s.input();
		s.calcArea();
		s.disp(); //generic method

		System.out.println();

		//Working with Circle Object
		s = new Circle();
		s.input();
		s.calcArea();
		s.disp(); //generic method
	}
}


abstract class Shapee{
	public float area;

	//abstract methods
	public abstract void input();
	public abstract void calcArea();
	
	//Concrete methods
	public void disp(){
		System.out.println("Area is :: "+area);
	}
}

class Square extends Shapee{
	private float length;
	
	@Override
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length for square object :: ");
		length = sc.nextFloat();
	}
	
	@Override
	public void calcArea(){
		area = length*length;
	}
}

class Rectanglee extends Shapee{
	private float length;
	private float breadth;

	@Override
	public void input(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of Rectangle object:: ");
		length = sc.nextFloat();
		
		System.out.print("Enter the breadth of Rectanglee object:: ");
		breadth = sc.nextFloat();
	}

	@Override
	public void calcArea(){
		area = length*breadth;
	}
}

class Circle extends Shapee{
	private float radius;

	@Override
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circles:: ");
		radius = sc.nextFloat();
	}

	@Override
	public void calcArea(){
		area = 3.1414f * radius * radius;
	}
}