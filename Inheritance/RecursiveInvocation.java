import java.util.*;
import java.io.*;

public class RecursiveInvocation{
	RecursiveInvocation(int i){
		this();
	}
	
	RecursiveInvocation(){
		this(10);
	}

	public static void main(String[] args){
		RecursiveInvocation test = new RecursiveInvocation();
		System.out.println("Hello");
	}
} //Compile time error