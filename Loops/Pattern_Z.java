import java.util.Scanner;

public class Pattern_Z {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of loop: ");
        int range = sc.nextInt();
        int x = 1;
        for(int i = 0; i < range; i++){
            for(int j = 0; j < range; j++){
                if(i == 0 || i == range-1 || j == (range - x)){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            x++;
            System.out.print("\n");
        }
    }
}
