class Test2{
	
	//Static variable
	static int count;
	
	/*Method 1
	Test2(){}
	Test2(int i){}
	Test2(int i, int j){}
	Test2(int i, int j, int k){}

	//instance block
	{
		count++;
	}*/

	Test2(int... args){
		count++;
	}
	
	//instance method
	public void display(){
		System.out.print("Number od object create :: "+count);
	}
	
	public static void main(String[] args){
		Test2 t1 = new Test2();
		Test2 t2 = new Test2(10);
		Test2 t3 = new Test2(10, 20);
		Test2 t4 = new Test2(10, 20, 30);
		Test2 t5 = new Test2();
		Test2 t6 = new Test2(10, 20, 30);
		t1.display();
	}
}