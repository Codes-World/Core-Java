class Test{
	public static void main(String[] args){
		//Array Declaration
		int[] a = null;
		System.out.println(a);//null

		//Array Construction
		a = new int[5];
		System.out.println(a);//[I@372f7a8d

		System.out.println("Before initalization");
		for(int i = 0; i < 5; i++){
			System.out.print(a[i]+" ");
		}
		
		//Arra initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		System.out.println("After initalization");
		for(int i = 0; i < 5; i++){
			System.out.println(a[i]);
		}


		//Second Array
		int[] b = new int[-5];
		System.out.println(b);

	}
}