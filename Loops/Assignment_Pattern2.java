/* It is print triangle using star pattern programming logic. */

import java.util.Scanner;

public class Assignment_Pattern2 {
    public static void main(String[] args) {
        //Scanner Library is used to get input from users...
        Scanner sc = new Scanner(System.in);

        //Declare three variables with type of integer...
        int outerLoop, innerLoop, loopRange;

        //Here, to print message for getting an input...
        System.out.println("Enter the range of the loop: ");

        //Get input from users...
        loopRange = sc.nextInt();

        //This is an Outer loop..
        for (outerLoop = 0; outerLoop < loopRange; outerLoop++) {

            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of triangle...
                if (innerLoop <= outerLoop) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
