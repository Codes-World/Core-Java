import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args){
		Child c = new Child();
	}
}

class Parent{
	Parent(){
		System.out.println(this.hashCode());
	}
}

class Child extends Parent{
	Child(){
		System.out.println(this.hashCode());
	}
}