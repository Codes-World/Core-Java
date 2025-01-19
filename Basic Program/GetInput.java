import java.util.Scanner;

public class GetInput {
    public static void main(String[] aman){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        double result = sc.nextDouble();

        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+result);
    }
}
