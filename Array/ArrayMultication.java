import java.util.Scanner;
public class ArrayMultication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j, k;

        System.out.print("Enter the number for how many rows in first matrix: ");
        i = sc.nextInt();

        System.out.print("Enter the number for how many columns in first matrix: ");
        j = sc.nextInt();

        System.out.print("What is the number to multiply in first matrix: ");
        k = sc.nextInt();

        int[][] array = new int[i][j];

        System.out.println("Enter the element of matrix "+i+" * "+j);
        for(int loop = 0; loop < i; loop++){
            for(int loop1 = 0; loop1 < j; loop1++){
                array[loop][loop1] = sc.nextInt();
            }
            System.out.print("\n");
        }

        for(int loop = 0; loop < i; loop++){
            for(int loop1 = 0; loop1 < j; loop1++){
                array[loop][loop1] *= k;
            }
        }

        for(int loop = 0; loop < i; loop++){
            for(int loop1 = 0; loop1 < j; loop1++){
                System.out.print(array[loop][loop1]+" ");
            }
            System.out.print("\n");
        }
    }
}
