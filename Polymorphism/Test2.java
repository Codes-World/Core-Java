import java.util.*;
import java.io.*;


public class Test2{
	public static void main(String[] args){
		Passenger p = new Passenger();
		Cargo c = new Cargo();
		Fighter f = new Fighter();

		Airport ref = new Airport();
		ref.allowPlane(p);
		System.out.println();

		ref.allowPlane(c);
		System.out.println();

		ref.allowPlane(f);
	}
}

class Plane{
	String engine;
	float fuel;
	int wheel;

	public void takeOff(){
		System.out.println("Plane TakeOff..");
	}

	public void carry(){
		System.out.println("Plane carry the goods, passengers and weapons..");
	}

	public void flying(){
		System.out.println("Plane is flying..");
	}

	public void land(){
		System.out.println("Plane is landing..");
	}
}

class Passenger extends Plane{
	@Override
	public void carry(){
		System.out.println("Carrying Passenger..");
	}
}

class Cargo extends Plane{
	@Override
	public void carry(){
		System.out.println("Carrying cargo..");
	}
}

class Fighter extends Plane{
	@Override
	public void carry(){
		System.out.println("Carring weapons..");
	}
}

//Helper
class Airport{
	public void allowPlane(Plane ref){
		System.out.println("Name of Object :: "+ref.getClass().getName());
		ref.takeOff();
		ref.flying();
		ref.land();
	}
}