import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] aman){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of loop: ");
        int loopLength = sc.nextInt(); //Get input from user.

        int firstNumber = 0, secondNumber = 1, fabo;
        System.out.println("Fibonacci Series");
        for(int begin = 0; begin < loopLength; begin++){

            System.out.print(firstNumber+" "); //Print the fabonacci series

            //Process of calculating in fabonacci form.
            fabo = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fabo;
        }
    }
}
