public class Test2{
	/*public void m1(){
		System.out.print("0");
	}
	public void m1(int a){
		System.out.print(a);
	}
	public void m1(int a, int b){
		System.out.print(a+b);
	}
	public void m1(int a, int b, int c){
		System.out.print(a+b+c);
	}*/
	
	public void m1(int... data){
		int total = 0;
		for(int i = 0; i < data.length; i++){
			System.out.print("data["+i+"] = "+data[i]+"\t");
			total = total + data[i];
		}
		System.out.print("Total = "+total);
		System.out.print("\n");
	}
	public static void main(String[] args){
		Test2 t = new Test2();
		t.m1();
		t.m1(10);
		t.m1(10, 10);
		t.m1(10, 10, 10);
	}
}