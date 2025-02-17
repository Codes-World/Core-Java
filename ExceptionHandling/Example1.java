public class Example1{
	public static void main(String[] args)throws Exception{
		Parent p = new Child();
		System.out.println(p);
	}
}
class Parent{
	Parent() throws java.io.FileNotFoundException{}
}

class Child extends Parent{
	Child() throws java.io.FileNotFoundException{}
}

