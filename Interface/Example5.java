public class Example5{
	public static void main(String[] args) {
		CalculatorImpl calc;
		calc = new CalculatorImpl();
		calc.add(10,20);
		calc.sub(10,3);
	}
}

interface ICalculator{
	public void add(int a,int b);
}

class CalculatorDemo{
	public void sub(int a,int b){
		System.out.println("The sub is :: "+(a-b));
	}
}

class CalculatorImpl extends CalculatorDemo implements ICalculator{
	@Override
	public void add(int a,int b){
		System.out.println("The sum is :: "+(a+b));
	}
}

