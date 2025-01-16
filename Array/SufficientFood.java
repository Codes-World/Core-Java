public class SufficientFood{
	public static int calculateFoodAmount(int r, int n, int unit, int[] arr){
		int totalAmountOfFood = r * unit;
		int sum = 0, count = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(sum >= totalAmountOfFood){
				return count;
			}
			else{
				sum += arr[i];
				count++;
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		int[] arr = {2,8,3,5,7,4,1,2};
		int result = calculateFoodAmount(7,8,2,arr);
		System.out.println("Since, amount of food in "+result+" houses is sufficient for all the rats");
	}
}