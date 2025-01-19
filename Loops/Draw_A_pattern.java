/*
     ***
    *   *
    * * *
    *   *
    *   *
 */

/*
    **
    *  *
    * *
    *  *
    **
 */
import java.util.Scanner;
public class Draw_A_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfLoop;
        System.out.println("Enter the size of loop: ");
        sizeOfLoop = sc.nextInt();
        for (int i = 0; i < sizeOfLoop; i++) {
            for (int j = 0; j < sizeOfLoop; j++) {
//                if (i == 0 && j > 0 && j < (sizeOfLoop - 1) / 2 || j == 0 && i > 0 || i == (sizeOfLoop - 1) / 2 && j <= (sizeOfLoop - 1) / 2 || j == (sizeOfLoop - 1) / 2 && i > 0) {
//                    System.out.print("*");
//                }
                if(i==0 && j<(sizeOfLoop-1)/2 || j==0 || j==(sizeOfLoop-1)/2 && i>0 && i<(sizeOfLoop-1)/2 || i==(sizeOfLoop-1)/2 && j<(sizeOfLoop-1)/2 || j==(sizeOfLoop-1)/2 && i>0 && i>(sizeOfLoop-1)/2 && i<(sizeOfLoop-1) || i==(sizeOfLoop-1) && j<(sizeOfLoop-1)/2){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
//public class Draw_A_pattern {
//    public static void main(String[] args){
//        int n = 10;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                //Logic of A
////                if(i==0 || j==0|| i==(n-1)/2 || j==(n-1)){
////                    System.out.print("*");
////                }
////                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0){
////                    System.out.print("*");
////                }
//                if(i==0 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i>(n-1)/2 && i<(n-1) || i==(n-1) && j<(n-1)/2){
//                    System.out.print("*");
//                }
//                else
//                    System.out.print(" ");
//            }
//            System.out.print("\n");
//        }
//    }
//}
