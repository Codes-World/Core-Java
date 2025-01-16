//Control follow of static

public class Test{
	//1
	static int i = 10; //7
	//2
	static{
		methodOne(); //8
		System.out.println("First static block");//10
	}
	//3
	public static void main(String[] args){
		methodOne();//13
		System.out.println("Inside main method"); //15
	}
	//4
	public static void methodOne(){
		System.out.println(j); //9, 14
	}
	//5
	static{
		System.out.println("Second static block"); //11
	}
	//6
	static int j = 20; //12
}