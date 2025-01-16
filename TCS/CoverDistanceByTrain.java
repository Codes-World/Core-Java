import java.util.*;
import java.io.*;
public class CoverDistanceByTrain{
	public static int calculateTime(int speed){
		int lengthOfBridge = 400;
		int distanceCoveredByTrain = 400;
		int totalDistanceCovered = lengthOfBridge + distanceCoveredByTrain;
		return (totalDistanceCovered/speed);
	}	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int speedOfTrain = sc.nextInt();
		int convertIntoMeterPerSecond = speedOfTrain*5/18;
		System.out.print(calculateTime(convertIntoMeterPerSecond));
		sc.close();
	}
}