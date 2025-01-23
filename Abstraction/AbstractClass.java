import java.util.*;
import java.io.*;

public class AbstractClass{
	public static void main(String[] args) {
		//Creating 3 objects of Plane Type
		Cargo c = new Cargo();
		Passenger p =new Passenger();
		Fighter f = new Fighter();
		
		//Taking the actions for all the 3 planes
		Airport a = new Airport();
		a.allowPlane(c);
		a.allowPlane(p);
		a.allowPlane(f);
	}
}


//Parent class normally should be abstract class with abstract methods.
abstract class Plane{
	//abstract methods : Method without implementation
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land();
	public abstract void carry();
}

//Child class
final class Passenger extends Plane{
	//Specific implementation
	@Override
	public void takeOff(){
		System.out.println("Passenger plane take off...");
	}
	@Override
	public void fly(){
		System.out.println("Passenger plane is flying...");
	}
	@Override
	public void land(){
		System.out.println("Passenger plane is landing...");
	}
	@Override
	public void carry(){
		System.out.println("Passenger plane is carrying passengers...");
	}
}

//Child class
final class Cargo extends Plane{
	//Specific implementation
	@Override
	public void takeOff(){
		System.out.println("Cargo plane is carrying...");
	}
	@Override
	public void fly(){
		System.out.println("Cargo plane is flying...");
	}
	@Override
	public void land(){
		System.out.println("Cargo plane is landing...");
	}
	@Override
	public void carry(){
		System.out.println("Cargo plane is carrying goods...");
	}
}

//Child class
final class Fighter extends Plane{
	//Specific implementation
	@Override
	public void takeOff(){
		System.out.println("Fighter plane is taking off...");
	}
	@Override
	public void fly(){
		System.out.println("Fighter plane is flying...");
	}
	@Override
	public void land(){
		System.out.println("Fighter plane is landing...");
	}
	@Override
	public void carry(){
		System.out.println("Fighter plane is carrying weapons..");
	}
}

//Helper class
final class Airport{
	/*MethodOverriding :TruePolymorphsim[1:M] => Loose Coupling
			  = new Cargo();
		Plane ref = new Passenger();
			  = new Fighter();
	*/
	public void allowPlane(Plane ref){
		System.out.println("Working with object called :: "+ref.getClass().getName());
		ref.takeOff();
		ref.carry();
		ref.fly();
		ref.land();
		System.out.println();
	}
}
