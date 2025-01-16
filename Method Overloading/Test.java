public class Test{
	public void m1(int a, float b){
		System.out.print("int-float args method");
	}
	public void m1(float a, int b){
		System.out.print("float-int args method");
	}
	public static void main(String[] args){
		Test t = new Test();
		t.m1(10, 10.5f);//int-float args method
		t.m1(10.5f, 10);//float-int args method
		t.m1(10, 10);//CE: reference to m1 is ambiguous
		t.m1(10.5f, 10.5f);//CE: no suitable method
	}
}