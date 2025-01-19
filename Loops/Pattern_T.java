import java.util.Scanner;

public class Pattern_T {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of loop: ");
        int range = sc.nextInt();

        for(int i = 0; i < range; i++){
            for(int j = 0; j < range; j++){
                if(i == 0 || j == (range-1)/2){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
