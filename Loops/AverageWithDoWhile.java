import java.util.Scanner;

public class AverageWithDoWhile {
    public static void main(String[] aman){
        Scanner sc = new Scanner(System.in);

        int count = 0; //This variable is used to count how often user enter a number.
        double sum = 0, results, getNumber;
        String choice;

        do{
            System.out.print("Enter a number for calculating average: ");
            getNumber = sc.nextDouble(); //Get input from user.

            sum += getNumber;

            System.out.println("Can you add some more number again? (Yes/No)");
            choice = sc.next();
            count++; //Count the repeating loop.
        }while(choice.equalsIgnoreCase("Yes")); //This statement is to say that if you want enter next input you can easily enter yes then do loop repeating again.

        results = sum / count; // calculate the average number.

        System.out.println("Average number are: "+results);
    }
}
