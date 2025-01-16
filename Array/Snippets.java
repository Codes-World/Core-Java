public class Snippets{
	public void main(String[] args){
		int x = 6;
		Snippets s = new Snippets();
		s.doStuff(x);
		System.out.print("main x = "+x);
	}
	void doStuff(int x){
		System.out.print("doStuff x = "+ x++);
	}
}