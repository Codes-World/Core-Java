/* It is print Alphabets A, B, C, D, E, F, G, and H using
    pattern programming logic.
 */


import java.util.Scanner;

public class Assignment_Pattern1 {
    public static void main(String[] args){
        //Scanner Library is used to get input from users...
        Scanner sc = new Scanner(System.in);

        //Declare three variables with type of integer...
        int outerLoop, innerLoop, loopRange;

        //Here, to print message for getting an input...
        System.out.println("Enter the range of the loop: ");

        //Get input from users...
        loopRange = sc.nextInt();

        //This is an Outer loop..
        for(outerLoop = 0; outerLoop < loopRange; outerLoop++)
        {
            //This is an Inner loop...
            for(innerLoop = 0; innerLoop < loopRange; innerLoop++){

                //Pattern Programming Logic of alphabet letter 'A'...
                if(outerLoop == 0 && innerLoop > 0 && innerLoop < loopRange-1 || innerLoop == 0 && outerLoop > 0 || innerLoop == loopRange-1 && outerLoop > 0 || outerLoop == (loopRange-1)/2){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            //This is an Inner loop...
            for(innerLoop = 0; innerLoop < loopRange; innerLoop++){

                //Pattern Programming Logic of alphabet letter 'B'...
                if(outerLoop == 0 && innerLoop < loopRange-1 || innerLoop == 0 || innerLoop == loopRange-1 && outerLoop > 0 && outerLoop < (loopRange-1)/2 || outerLoop == (loopRange-1)/2 && innerLoop < loopRange-1 || innerLoop == loopRange - 1 && outerLoop > (loopRange-1)/2 && outerLoop < loopRange-1 || outerLoop == loopRange - 1 && innerLoop < loopRange-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            //This is an Inner loop...
            for(innerLoop = 0; innerLoop < loopRange; innerLoop++){

                //Pattern Programming Logic of alphabet letter 'C'...
                if(outerLoop == 0 && innerLoop > 0 || innerLoop == 0 && outerLoop > 0 && outerLoop < loopRange - 1 || outerLoop == loopRange-1 && innerLoop > 0){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            //This is an Inner loop...
            for(innerLoop = 0; innerLoop< loopRange; innerLoop++){

                //Pattern Programming Logic of alphabet letter 'D'...
                if(outerLoop == 0 && innerLoop < loopRange-1 || innerLoop == 0 || outerLoop == loopRange-1 && innerLoop < loopRange-1 || innerLoop == loopRange-1 && outerLoop > 0 && outerLoop < loopRange-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            //This is an Inner loop...
            for(innerLoop = 0; innerLoop < loopRange; innerLoop++){

                //Pattern Programming Logic of alphabet letter 'E'...
                if(outerLoop == 0 || innerLoop == 0 || outerLoop == (loopRange-1)/2 || outerLoop == loopRange-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            //This is an Inner loop...
            for(innerLoop = 0; innerLoop < loopRange; innerLoop++){

                //Pattern Programming Logic of alphabet letter 'F'...
                if(outerLoop == 0 || innerLoop == 0 || outerLoop == (loopRange-1)/2){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            //This is an Inner loop...
            for(innerLoop = 0; innerLoop < loopRange; innerLoop++) {

                //Pattern Programming Logic of alphabet letter 'G'...
                if (outerLoop == 0 && innerLoop > 0 || innerLoop == 0 && outerLoop > 0 && outerLoop < (loopRange - 1) || outerLoop == loopRange - 1 && innerLoop > 0 && innerLoop <= (loopRange - 1) / 2 || innerLoop == (loopRange - 1) / 2 && outerLoop >= (loopRange - 1) / 2 || outerLoop == (loopRange - 1) / 2 && innerLoop >= (loopRange - 1) / 2 || outerLoop >= (loopRange - 1) / 2 && innerLoop == loopRange - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }

            System.out.print("  ");

            //This is an Inner loop...
            for(innerLoop = 0; innerLoop < loopRange; innerLoop++){

                //Pattern Programming Logic of alphabet letter 'H'...
                if(innerLoop == 0 || outerLoop == (loopRange-1)/2 || innerLoop == loopRange-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
