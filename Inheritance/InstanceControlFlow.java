import java.util.*;
import java.io.*;

public class InstanceControlFlow{
/* 1 */	public static void main(String[] args){
		Child c = new Child();
	}
}

class Parent{
	//instance variable
/* 1 */	int x = 10; /* 7 */

	//instance block
/* 2 */	{
		methodOne();/* 8 */
		System.out.println("Parent first instance block");
	}

	Parent(){ /* 11 */
		System.out.println("Parent class constructor..");
	}

	public static void main(String... args){
		Parent p = new Parent();
		System.out.println("Parent class main method..");
	}

	public void methodOne(){
		System.out.println(y); /* 9 */
	}
/* 3 */	int y = 20; /* 10 */
}

class Child extends Parent{
	//instance variable
/* 4 */	int i = 100; /* 12 */
	
	//instance block
/* 5 */	{
		methodTwo();/* 13 */
		System.out.println("Child first instance block");
	}

	//Constructor
	Child(){ /* 16 */
		System.out.println("Child class constructor..");
	}

	public static void main(String... args){
		Child c = new Child();
		System.out.println("Child class main method.."); /* 17 */
	}
	
	public void methodTwo(){
		System.out.println(j); /* 14 */
	}
/* 6 */	int j = 200; /* 15 */
}