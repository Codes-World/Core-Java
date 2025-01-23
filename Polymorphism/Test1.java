import java.util.*;
import java.io.*;

public class Test1{
	public static void main(String[] args){
		//Creating an object of Animal Type
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();

		Forest f = new Forest();
		//Invoking the behaviours of all 3 animals
		f.allowAnimal(t);
		System.out.println();

		f.allowAnimal(d);
		System.out.println();
	
		f.allowAnimal(m);
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

class Forest{
	//MethodOverriding :: LooseCoupling
	public void allowAnimal(Animal a){
		a.eat();
		a.sleep();
		a.breadthe();
	}
}