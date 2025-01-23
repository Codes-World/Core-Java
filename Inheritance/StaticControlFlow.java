import java.util.*;
import java.io.*;

public class StaticControlFlow{
	public static void main(String[] args) {}
}

class Base{
	//Static variable
/*1*/	static int i = 10; /*11*/
	
	//Static block
/*2*/	static{
		methodOne(); /*12*/
		System.out.println("base static block");
	}

/*3*/	public static void main(String... args){
		methodOne();
		System.out.println("Base main");
	}
/*4*/	static void methodOne(){
		System.out.println(j); /*13*/
	}
/*5*/	static int j = 20; /*14*/
}

class Derived extends Base{
/*6*/	static int x = 100; /*15*/
/*7*/	static{
		methodTwo(); /*16*/
		System.out.println("Derived static block");
	}
/*8*/	public static void main(String... args){
		methodTwo(); /*19*/
		System.out.println("Derived main"); /*20*/
	}
/*9*/	static void methodTwo(){
		System.out.println(y);/*17*/
	}
/*10*/	static int y = 200; /*18*/
}