/*
	since the variable is static and final,compulsorily 
	it should be initialized at the time of declaration 
	otherwise it would result in compile time error.
*/

public class Example7 implements IRemote{
	public static void main(String[] args) { 
		int MIN_VOLUME = -5;
		System.out.println(MIN_VOLUME);
		System.out.println(IRemote.MIN_VOLUME);
		System.out.println(Example7.MIN_VOLUME);
	}
}

interface IRemote{
	//public static final
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 100;
}