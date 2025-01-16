class Animal{}
class Monkey extends Animal{}
public class Test3{
	public void talk(Monkey m){
		System.out.println("Monkey Version");
	}
	public void talk(Animal a){
		System.out.println("Animal Version");
	}
	public static void main(String[] args){
		Test3 t = new Test3();
		
		Animal a = new Animal();
		t.talk(a);

		Monkey m = new Monkey();
		t.talk(m);

		Animal a1 = new Monkey();
		t.talk(a1);
	}
}