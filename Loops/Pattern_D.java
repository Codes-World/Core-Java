import java.util.Scanner;

public class Pattern_D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i, j, range;

        System.out.println("Enter the range of the loop: ");
        range = sc.nextInt();

        for(i = 0; i < range; i++){
            for(j = 0; j < range; j++){
                if(i == 0 && j < range-1 || j == 0 || i == range-1 && j < range-1 || j == range-1 && i > 0 && i < range-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
