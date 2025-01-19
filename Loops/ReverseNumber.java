import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, copyNumber, reverseDigit = 0;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        copyNumber = num;

    //  Reverse the number of digit without using Array
        while(copyNumber > 0){
            reverseDigit = (reverseDigit * 10) + (copyNumber % 10);
            copyNumber /= 10;
        }

        System.out.println("Reverse of Number of digit are: "+reverseDigit);
    }
}
