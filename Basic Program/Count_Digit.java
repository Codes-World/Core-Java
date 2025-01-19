import java.util.Scanner;
public class Count_Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, copyNumber, sum = 0;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        copyNumber = num;
    //Logic of count digit
//        while(copyNumber > 0){
//            copyNumber = copyNumber/10;
//            count++;
//        }
//        if(count == 0){
//            System.out.println("There is no any input");
//        }
//        else
//            System.out.println("The number of digits are: "+count);

        while(copyNumber > 0){
            int rem = copyNumber%10;
            sum = sum + rem;
            copyNumber/=10;
        }
        System.out.println("The sum of number of digits are: "+sum);
    }
}
