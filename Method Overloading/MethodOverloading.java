public class MethodOverloading{
	public static void main(String[] args) {
		Tiger1 t = new Tiger1();
		Deer1 d = new Deer1();
		Monkey1 m = new Monkey1();
		
		Forest f = new Forest();
		f.allowAnimal(t);
		System.out.println();
		
		f.allowAnimal(d);
		System.out.println();
		
		f.allowAnimal(m);
	}
}

class Animal1{
	public void eat(){
		System.out.println("Animal is eating...");
	}
	public void sleep(){
		System.out.println("Animal is sleeping...");
	}
	public void breathe(){
		System.out.println("Animal is breathing...");
	}
}

class Tiger1 extends Animal1 {
	//informing compiler about overidden method
	@Override
	public void eat(){
		System.out.println("Tiger hunts and eat...");
	}
}

class Deer1 extends Animal1{
	//informing compiler about overidden method
	@Override
	public void eat(){
		System.out.println("Deer will graze and eat...");
	}
}

class Monkey1 extends Animal1 {
	//informing compiler about overidden method
	@Override
	public void eat(){
		System.out.println("Monkey steal and eat...");
	}
}

//Helper class
class Forest{
	//Method Overloading
	public void allowAnimal(Tiger1 t){
		t.eat();
		t.sleep();
		t.breathe();
	}
	public void allowAnimal(Deer1 d){
		d.eat();
		d.sleep();
		d.breathe();
	}
	public void allowAnimal(Monkey1 m){
		m.eat();
		m.sleep();
		m.breathe();
	}
}