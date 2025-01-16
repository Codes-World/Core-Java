import java.util.*;
import java.io.*;


public class InheritanceExp{
	public static void main(String[] args){
		Passenger p = new Passenger();
		Cargo c = new Cargo();
		Fighter f = new Fighter();

		p.takeOff();
		p.carryPassenger();
		p.flying();
		p.land();

		System.out.println();

		c.takeOff();
		c.carryCargo();
		c.flying();
		c.land();

		System.out.println();

		f.takeOff();
		f.carryWeapons();
		f.flying();
		f.land();
	}
}

class Plane{
	String engine;
	float fuel;
	int wheel;

	public void takeOff(){
		System.out.println("Plane TakeOff..");
	}

	public void flying(){
		System.out.println("Plane is flying..");
	}

	public void land(){
		System.out.println("Plane is landing..");
	}
}

class Passenger extends Plane{
	public void carryPassenger(){
		System.out.println("Carrying Passenger..");
	}
}

class Cargo extends Plane{
	public void carryCargo(){
		System.out.println("Carrying cargo..");
	}
}

class Fighter extends Plane{
	public void carryWeapons(){
		System.out.println("Carring weapons..");
	}
}