import java.util.Scanner;

public class ArrayMultiplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, i, j, sum = 0;

        System.out.print("Enter the number for how many rows in first matrix: ");
        num1 = sc.nextInt();

        System.out.print("Enter the number for how many rows in first matrix: ");
        num2 = sc.nextInt();

        System.out.print("Enter the number for how many rows in second matrix: ");
        num3 = sc.nextInt();

        System.out.print("Enter the number for how many rows in second matrix: ");
        num4 = sc.nextInt();


        int[][] array = new int[num1][num2];
        int[][] array1 = new int[num3][num4];

        if(num2 == num3){
            int[][] multi = new int[num1][num4];

            System.out.println("Enter the element of first matrix "+num1+" * "+num2);
            for(i = 0; i < num1; i++){
                for(j = 0; j < num2; j++){
                    array[i][j] = sc.nextInt();
                }
                System.out.print("\n");
            }

            System.out.println("Enter the element of second matrix "+num3+" * "+num4);
            for(i = 0; i < num3; i++){
                for(j = 0; j < num4; j++){
                    array1[i][j] = sc.nextInt();
                }
                System.out.print("\n");
            }

            for(i = 0; i < num1; i++){
                for(j = 0; j < num4; j++){
                   for(int k = 0; k < num2; k++){
                        sum += array[i][k] * array1[k][j];
                   }
                   multi[i][j] = sum;
                   sum = 0;
                }
                System.out.print("\n");
            }

            for( i = 0; i < num1; i++) {
                for ( j = 0; j < num4; j++) {
                    System.out.print(multi[i][j]);
                }
                System.out.print("\n");
            }
        }
        else{
            System.out.println("Error: Here the column of first matrix is not equal to the row of second matrix");
        }
    }
}
