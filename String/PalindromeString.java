public class PalindromeString{
	public static void main(String[] args){
		String str1 = "2553";
		StringBuilder str2 = new StringBuilder();

		for(int i = str1.length()-1; i >= 0; i--){
			str2.append(str1.charAt(i));
		}
		if(str1.equals(str2.toString()))
			System.out.println(str1+" is Palindrome");
		else
			System.out.println(str1+" is not Palindrome");
	}
}