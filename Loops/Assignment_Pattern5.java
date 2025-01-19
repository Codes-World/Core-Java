/* Print AMAN KUMAR SONI */

import java.util.Scanner;

public class Assignment_Pattern5 {
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

                //This is the logic of "A"...
                if (outerLoop == 0 && innerLoop > 0 && innerLoop < loopRange-1 || innerLoop == 0 && outerLoop > 0 || innerLoop == loopRange-1 && outerLoop > 0 || outerLoop == (loopRange-1)/2) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "M"...
                if (innerLoop == 0 || innerLoop == loopRange - 1 ||
                        (outerLoop >= 0 && outerLoop <= loopRange / 2 && (innerLoop == outerLoop || innerLoop == loopRange - 1 - outerLoop))) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print(" ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "A"...
                if (outerLoop == 0 && innerLoop > 0 && innerLoop < loopRange-1 || innerLoop == 0 && outerLoop > 0 || innerLoop == loopRange-1 && outerLoop > 0 || outerLoop == (loopRange-1)/2) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "N"...
                if (innerLoop == 0 || innerLoop == loopRange-1 || outerLoop == innerLoop) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print(" \t\t ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "K"...
                if (innerLoop == 0 || innerLoop + outerLoop == (loopRange-1)/2 || outerLoop >= (loopRange-1)/2 && outerLoop - innerLoop == (loopRange-1)/2) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print(" ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "U"...
                if (innerLoop == 0 && outerLoop < loopRange-1|| innerLoop == loopRange-1 && outerLoop < loopRange-1|| outerLoop == loopRange-1 && innerLoop > 0 && innerLoop < loopRange-1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print(" ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "M"...
                if (innerLoop == 0 || innerLoop == loopRange - 1 ||
                        (outerLoop >= 0 && outerLoop <= loopRange / 2 && (innerLoop == outerLoop || innerLoop == loopRange - 1 - outerLoop))) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print(" ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "A"...
                if (outerLoop == 0 && innerLoop > 0 && innerLoop < loopRange-1 || innerLoop == 0 && outerLoop > 0 || innerLoop == loopRange-1 && outerLoop > 0 || outerLoop == (loopRange-1)/2) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print(" ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "R"...
                if (innerLoop == 0 || outerLoop == 0 && innerLoop < loopRange-1 || innerLoop == loopRange-1 && outerLoop > 0 && outerLoop < (loopRange-1)/2 || outerLoop == (loopRange-1)/2 && innerLoop < loopRange-1 || outerLoop >= (loopRange-1)/2 && outerLoop - innerLoop == (loopRange-1)/2) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print(" \t\t ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "S"...
                if (outerLoop == 0 && innerLoop > 0 || innerLoop == 0 && outerLoop > 0 && outerLoop < (loopRange-1)/2 || outerLoop == (loopRange-1)/2 && innerLoop > 0 && innerLoop < loopRange-1 || innerLoop == loopRange-1 && outerLoop > (loopRange-1)/2 && outerLoop < loopRange-1 || outerLoop == loopRange-1 && innerLoop < loopRange-1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print(" ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "O"...
                if (outerLoop == 0 && innerLoop > 0 && innerLoop < loopRange-1 || innerLoop == 0 && outerLoop > 0 && outerLoop < loopRange-1 || outerLoop == loopRange-1 && innerLoop > 0 && innerLoop < loopRange-1 || innerLoop == loopRange-1 && outerLoop > 0 && outerLoop < loopRange-1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");
            //This is an Inner loop...
            for (innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //This is the logic of "N"...
                if (innerLoop == 0 || innerLoop == loopRange-1 || outerLoop == innerLoop) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");
            //This is an Inner loop...
            for(innerLoop = 0; innerLoop < loopRange; innerLoop++){

                //This is the logic of "I"...
                if(outerLoop == 0 || innerLoop == (loopRange-1)/2 || outerLoop == loopRange-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
