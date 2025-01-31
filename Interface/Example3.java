/*
	As noticed in the below example ICalculator1 and 
	ICalculator2 both have void add(int a,int b) 
	method,but compiler will keep only one method void 
	add(int a,int b) in the implementation class through 
	which "Ambiguity problem" will not occur in interfaces.

*/
public class Example3{
	public static void main(String[] args) {
		//Creating a reference of interface
		CalculatorImpl calc;
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

//Implemented class : concrete class
class CalculatorImpl implements ICalculator1,ICalculator2{
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
