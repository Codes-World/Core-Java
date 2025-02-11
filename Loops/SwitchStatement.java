import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);

		System.out.print("1. Sunday \n2. Monday \n3. Tuesday \n4. Wednesday \n5. Thursday \n6. Friday \n7. Saturday\n");
		System.out.print("Enter your choice: ");
		int choice = Sc.nextInt();

		switch(choice){
			case 1:
				System.out.print("\nSunday");
			
			case 2:
				System.out.print("\nMonday");

			case 3:
				System.out.print("\nTuesday");

			case 4:
				System.out.print("\nWednesday");

			case 5:
				System.out.print("\nThursday");

			case 6:
				System.out.print("\nFriday");

			case 7:
				System.out.print("\nSunday");

			//default:
			//	System.out.print("\nInvalid Choice!");
		}
	}
}