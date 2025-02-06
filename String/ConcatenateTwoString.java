import java.util.Scanner;

public class ConcatenateTwoString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = new String();
		String str2 = new String();
		
		System.out.print("Enter your first name: ");
		str1 = sc.next();
		
		System.out.println("Enter your last name: ");
		str2 = sc.next();

		String str3 = str1.concat(str2);

		System.out.print("Name: "+str3);
	}
}