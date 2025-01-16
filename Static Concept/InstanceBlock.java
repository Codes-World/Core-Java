public class InstanceBlock{
	public static void main(String[] args){
		Test std = new Test(10, "Aman", 50);
		std.dispStdDetails();
	}
}

class Test{
	int sid;
	String sname;
	int sage;

	//constructor: shadowing => resolved through "this"
	Test(int sid, String sname, int sage){
		System.out.println("Supplied values through constructor");
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}

	//instance block
	{
		System.out.println("Supplied values through instance block");
		sid = 100;
		sname = "Aman";
		sage = 41;
		dispStdDetails();
	}

	//instance method
	public void dispStdDetails(){
		System.out.println("SID   is :: "+sid);
		System.out.println("SNAME is :: "+sname);
		System.out.println("SAGE  is :: "+sage);
	}
}