class Test{
	public static void main(String... args){
		//Constructing the object
		Student std1 = new Student("Aman", 22, 5.2f);
		
		//getting the value from instance variables;
		System.out.println("Name   is :: "+std1.name);
		System.out.println("Age    is :: "+std1.name);
		System.out.println("Height is :: "+std1.name);

		System.out.println();

		//Constructing the object
		Student std2 = new Student();
		
		//getting the value from instance variables;
		System.out.println("Name   is :: "+std2.name);
		System.out.println("Age    is :: "+std2.name);
		System.out.println("Height is :: "+std2.name);

		System.out.println();

		//Constructing the object
		Student std3 = new Student();
		
		//getting the value from instance variables;
		System.out.println("Name   is :: "+std3.name);
		System.out.println("Age    is :: "+std3.name);
		System.out.println("Height is :: "+std3.name);

		System.out.println();
	}
}

class Student{
	//instance variables
	String name;
	int age;
	float height;

	Student(String name, int age, float height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	Student(){
		name = "dhoni";
		age = 41;
		height = 5.6f;
	}
}

