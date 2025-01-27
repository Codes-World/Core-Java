import java.util.*;
import java.io.*;

public class Example4{
	public static void main(String[] args) {
		Person p;
		p = new Student("Aman",30,'M',10,57.5f);
		p.dispDetails();
	}
}

//Person class
abstract class Person{
	String name;
	int age;
	char gender;
	
	//Constructor
	Person(String name,int age, char gender){
		this.name =name;
		this.age = age;
		this.gender =gender;
	}
	public void dispDetails(){
		System.out.println("Name is :: "+name);
		System.out.println("Age is :: "+age);
		System.out.println("Gender is :: "+gender);
	}
}

//Concrete class
class Student extends Person{
	int sid;
	float avg;
	Student(String name,int age,char gender,int sid, float avg){
		super(name,age,gender);
		this.sid = sid;
		this.avg = avg;
	}
	public void dispDetails(){
		super.dispDetails();
		System.out.println("SID is :: "+sid);
		System.out.println("AVG is :: "+avg);
	}
}