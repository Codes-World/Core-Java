import java.util.*;

class CheckTarget{
	public boolean contains(int[] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return true;
			}
		}
		return false;
	}
}

class ContainsValue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.print("\nEnter the elements in the array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		System.out.print("\nEnter the target element which is search in the array: ");
		int target = sc.nextInt();

		CheckTarget t = new CheckTarget();

		System.out.println(target+" is present in the array.(true or false) : "+t.contains(arr, target));
	}
}
		