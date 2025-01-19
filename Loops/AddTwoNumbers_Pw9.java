import java.util.Scanner;

public class AddTwoNumbers_Pw9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numberOfTestCases, num1 = 0, num2 = 0;
        numberOfTestCases = sc.nextInt();

        for (int i = 0; i < numberOfTestCases; i++){
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(num1+num2);
        }

    }
}
