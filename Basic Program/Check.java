import java.util.Scanner;

public class Check {
    public static void main(String[] aman){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether a number is positive, negative or zero: ");
        int inputNumber = sc.nextInt(); //To get number from user.

        //Check the number is positive, negative or zero..
        if(inputNumber > 0){
            System.out.println(inputNumber+" is positive number.");
        }
        else if(inputNumber < 0){
            System.out.println(inputNumber+" is negative number.");
        }
        else{
            System.out.println(inputNumber+" is zero number.");
        }
    }
}
