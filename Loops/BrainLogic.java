import java.util.Scanner;

public class BrainLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loopRange;
        System.out.println("Enter the height of the 'W' pattern: ");
        loopRange = sc.nextInt();

        for (int outerLoop = 0; outerLoop < loopRange; outerLoop++) {
            for (int innerLoop = 0; innerLoop < loopRange; innerLoop++) {
                if (innerLoop == 0 || innerLoop + outerLoop == (loopRange-1)/2 || outerLoop >= (loopRange-1)/2 && outerLoop - innerLoop == (loopRange-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

