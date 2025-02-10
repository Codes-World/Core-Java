public class DeleteAllConsonants{
	public static void main(String[] args){
		String str1 = "Hello, have a good day";
		char[] c = new char[25];
		int j = 0;
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) == ',' || str1.charAt(i) == ' ' || str1.charAt(i) == 'a' || str1.charAt(i) == 'A' || str1.charAt(i) == 'e' || str1.charAt(i) == 'E' || str1.charAt(i) == 'i' || str1.charAt(i) == 'I' || str1.charAt(i) == 'o' || str1.charAt(i) == 'O' || str1.charAt(i) == 'u' || str1.charAt(i) == 'U'){
				c[j] = str1.charAt(i);
				j++;	
			}
			else{
				continue;
			}
		}
		System.out.print("After Delete Consonants letter\n");
		for(int i = 0; i < j; i++){
			System.out.print(c[i]);
		}
	}
}