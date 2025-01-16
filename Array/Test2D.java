public class Test2D{
	public static void main(String[] args){
		int[][] arr = {{10,20,30},{40,50},{60}};
		
		System.out.println("Using forloop 2-D Array");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("**************************");
		System.out.println("using foreach loop in 2-D Array");
		for(int[] oneDArr : arr){
			for(int data : oneDArr){
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}