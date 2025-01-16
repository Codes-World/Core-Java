import java.util.*;
import java.io.*;

public class Inheritance1{
	public static void main(String[] args){
		//Creating an object of Animal Type
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();

		//Invoking the behaviours of all 3 animals
		t.eat();
		t.sleep();
		t.breadthe();

		System.out.println();

		//Invoking the behaviours of all 3 animals
		d.eat();
		d.sleep();
		d.breadthe();

		System.out.println();

		//Invoking the behaviours of all 3 animals
		m.eat();
		m.sleep();
		m.breadthe();

	}
}

class Animal{
	public void eat(){
		System.out.println("Animal is eating..");
	}
	public void sleep(){
		System.out.println("Animal is sleeping..");
	}
	public void breadthe(){
		System.out.println("Animal is breadthe..");
	}
}

class Tiger extends Animal{
	//informing compiler about overridden method
	@Override
	public void eat(){
		System.out.println("Tiger hunts and eat..");
	}
}

class Deer extends Animal{
	//informing compiler about overridden method
	@Override
	public void eat(){
		System.out.println("Deer will graze and eat..");
	}
}

class Monkey extends Animal{
	//informing compiler about overridden method
	@Override
	public void eat(){
		System.out.println("Monkey steal and eat..");
	}
}