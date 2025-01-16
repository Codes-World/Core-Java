public class Test2{
	public static void main(String[] args){
		String[] names = {"Aman", "Amit", "Rohan"};
		Object[] obj = names; //In object type array, child class array can be assigned.
		System.out.println(obj[0]);

		int[] a = {10, 20, 30 ,40};
		int[] b = {50,100};
		
		a = b;
		b = a;
		
		int i = 0;
		while(a.length != '\0'){
			System.out.println(a[i]);
			i++;
		}
	}
}