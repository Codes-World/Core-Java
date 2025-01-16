import java.util.*;
import java.io.*;

//Main method
public class GuesserGame{
	public static void main(String... args){
		System.out.println("\n--------------START GAME---------------");
		
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

		System.out.println("\n--------------GAME OVER---------------");
	}
}


//User will guess a number
class Guesser{
	int guesserNum;
	
	public int guessNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser: Please Guess a integer number: ");
		guesserNum = sc.nextInt();
		return guesserNum;
	}
}

//Player will guess a number
class Player{
	int playerNum;
	
	public int guessNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Players: Please Guess a integer number: ");
		playerNum = sc.nextInt();
		return playerNum;
	}
}


class Umpire{
	int guesserNum1;
	int playerNum1;
	int playerNum2;
	int playerNum3;
	
	//Collect a number which was given by the guesser class
	public void collectNumFromGuesser(){
		Guesser g = new Guesser();
		guesserNum1 = g.guessNum();
	}

	//Collect a number which was given by the players
	public void collectNumFromPlayer(){
		Player p1 = new Player();
		playerNum1 = p1.guessNum();
		
		Player p2 = new Player();
		playerNum2 = p1.guessNum();


		Player p3 = new Player();
		playerNum3 = p1.guessNum();
	
	}
	
	//Compare number of guesser with player's number and find out which player won the game
	void compare(){
		if(guesserNum1 == playerNum1){
			if(guesserNum1 == playerNum2 && guesserNum1 == playerNum3){
					System.out.println("All players won the game");
			}
			else if(guesserNum1 == playerNum2){
				System.out.println("Player1 and Player2 won the game");
			}
			else if(guesserNum1 == playerNum3){
				System.out.println("Player1 and Player3 won the game");
			}
			else{
				System.out.println("Only Player1 won the game");
			}
		}
		
		else if(guesserNum1 == playerNum2){
			if(guesserNum1 == playerNum3){
				System.out.println("Player2 and Player3 won the game");
			}
			else{
				System.out.println("Only Player2 won the game");
			}
		}
		else if(guesserNum1 == playerNum3){
			System.out.println("Only Player3 won the game");
		}
		
		else{
			System.out.println("All players lost the game");
		}
	}
}
		