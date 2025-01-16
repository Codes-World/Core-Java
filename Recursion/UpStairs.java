import java.util.*;
import java.io.*;
public class UpStairs{
	public static int noOfWays(int stairs){
		if(stairs <= 1)
			return stairs;
		else
			return noOfWays(stairs-1) + noOfWays(stairs-2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stairs: ");
		int stairs = sc.nextInt();

		int result = noOfWays(stairs+1);
		System.out.println("If Number of Stairs are "+stairs+" So, the number of ways can be "+result+" to up the stairs.");
	}
}