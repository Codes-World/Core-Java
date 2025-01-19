import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary number to coversion in Decimal Number: ");
        int getNumber = sc.nextInt();
        int sum = 0;
        int res = 1; //I know that 2 ^ 0 = 1
        while(getNumber>0){
            int unitOfDigit = getNumber % 10;
            if(unitOfDigit == 1 || unitOfDigit == 0)
            {
                sum = sum + (unitOfDigit * res);
                getNumber = getNumber / 10;
                res *= 2;
            }
            else {
                System.out.println("This number is not a Binary Number. Please Try Again");
                break;
            }
        }

        System.out.println("After conversion");
        System.out.println("The Decimal value is "+sum);
    }
}
