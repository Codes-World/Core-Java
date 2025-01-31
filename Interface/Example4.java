public class Example4{
	public static void main(String[] args) {
		//Creating a reference of interface
		Calculator calc;
		calc = new CalculatorImpl();
		//Calling the method based on runtime object
		calc.add(10,20);
		calc.sub(20,10);
		calc.mul(10,20);
		calc.div(5,2);
	}
}

//Pure-Abstract-class : SRS
interface ICalculator1{
	//By Default methods are :: public abstract
 	void add(int a,int b);
 	void sub(int a,int b);
}

//Pure-Abstract-class : SRS
interface ICalculator2{
	//By Default methods are :: public abstract
	void mul(int a,int b);
	void div(int a,int b);
	void add(int a,int b);
}

abstract class Calculator implements ICalculator1,ICalculator2{}

//Implemented class : concrete class
class CalculatorImpl extends Calculator{
	@Override
	public void add(int a,int b){
		int sum = a+b;
		System.out.println("The sum is :: "+sum);
	}
	@Override
	public void sub(int a,int b){
		int diff = a-b;
		System.out.println("The sub is :: "+diff);
	}
	@Override
	public void mul(int a,int b){
		int res = a*b;
		System.out.println("The res is :: "+res);
	}
	@Override
	public void div(int a,int b){
		int quotient = a/b;
		System.out.println("The quotient is :: "+quotient);
	}
}

