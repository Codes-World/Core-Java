import java.util.Scanner;
public class Pattern_X {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of loop: ");
        int range = sc.nextInt();
        int x = 1;
        int y = 0;
        for(int i = 0; i < range; i++){
            for(int j = 0; j < range; j++){
                if(i == y && j == y && j < (range - 1)/2 || j == (range - x) && j >= (range-1)/2 ){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            y++;
            x++;
            System.out.print("\n");
        }
    }
}
