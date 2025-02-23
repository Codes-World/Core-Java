public class Example4{
	public static void main(String... args) throws InteruptedException{
		doWork();
	}
	pubilc static void doWork() throws InteruptedException{
		doMoreWork();
	}
	public static void doMoreWork() throws InteruptedException{
		Thread.sleep(5000);
	}
}

//In the above code, if we remove any of the throws keyword it would result in "CompileTimeError".