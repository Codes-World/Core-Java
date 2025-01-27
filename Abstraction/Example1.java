import java.util.*;
import java.io.*;

public class Example1{
	public static void main(String[] args){
		//Vehicle v = new Vehicle(); //instantiation of vehicle is not possible : abstract
		Vehicle v1 = new Bus();
		v1.infoAboutVehicle();
		System.out.println("No of wheels for Bus is :: "+v1.getNoOfWheels());

		Vehicle v2 = new Auto();
		v2.infoAboutVehicle();
		System.out.println("NO of wheels for Auto is :: "+v2.getNoOfWheels());
	}
}

abstract class Vehicle{
	//abstract method
	public abstract int getNoOfWheels();
	
	//Concrete method
	public void infoAboutVehicle(){
		System.out.println("Generic informatiom");
	}
}

class Bus extends Vehicle{
	@Override
	public int getNoOfWheels(){
		return 7;
	}

	@Override
	public void infoAboutVehicle(){
		System.out.println("Volvo bus...");
	}
}

class Auto extends Vehicle{
	@Override
	public int getNoOfWheels(){
		return 3;
	}

	@Override
	public void infoAboutVehicle(){
		System.out.println("Uber Auto...");
	}
}