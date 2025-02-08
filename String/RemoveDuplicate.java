import java.util.Scanner;

public class RemoveDuplicate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.println("Enter a string: ");
		str = sc.nextLine();

		char[] chars = str.toCharArray();
		int length = chars.length;

		int end = 1;
		for (int i = 1 ; i < length ; i++) {
			int j;
			// Check all previous chars.
			for (j = 0 ; j < end ; j++) {
				if (chars[i] == chars[j]) {
					break;
				}
			}
			if (j == end) {
				chars[end] = chars[i];
				end++;
			}
		}
		for(int i = 0; i < end; i++){
			System.out.print(chars[i]);
		}
	}
}