import java.util.Scanner;

public class SearchDigit {

    static void Search(int num, int searchNumber){
        int count = 0, ans;

        while(num > 0){
            ans = num % 10;
            if(ans == searchNumber){
                count++;
            }
            num /= 10;
        }

        System.out.println("There are "+count+" times present "+searchNumber+" in a number ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int searchNumber, number;

        System.out.println("Enter a number: ");
        number = sc.nextInt();

        System.out.println("Enter the number which want to you find: ");
        searchNumber = sc.nextInt();

        Search(number, searchNumber);

    }
}
