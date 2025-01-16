public class TestAnanomyous{
	public static void main(String[] args){
		System.out.println("The sum of the Array's Element are :: "+sum(new int[]{10,20,40,30}));
	}
	static int sum(int[] arr){
		int total = 0;
		for(int data : arr){
			total += data;
		}
		return total;
	}
}