//InbuiltException -> CheckedException(partial,fully),UnCheckedException
//CustomException -> UncheckedException[RuntimeException]

import java.util.Scanner;

public class Example2{
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter the age of the candidate:: ");
		int age = scanner.nextInt();
		
		if (age>60){
			throw new TooOldAgeException("Sorry DL can't be issued for senior citizen people");
		}
		else if(age<18){
			throw new TooYoungAgeException("Sorry DL can't be issued for minor candidates");
		}
		else{
			System.out.println("You will get DL soon in registered email...");
		}
	}
}

class TooOldAgeException extends RuntimeException{
	TooOldAgeException(String msg){
		super(msg);
	}
}

class TooYoungAgeException extends RuntimeException{
	TooYoungAgeException(String msg){
		super(msg);
	}
}

