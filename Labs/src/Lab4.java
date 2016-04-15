/** @author Sun Kim
 * Lab 4
 * Takes 7 scores, drops highest score and lowest score, adds all and multiplies by degreeOfDifficulty and multiplier.
 * I was not able to get the boundaries right.
 */
import java.util.*;

public class Lab4 
{
	//Initialize the Variables
	static Scanner userInput = new Scanner(System.in);
	private static int maxScores = 7;
	private static float degreeOfDifficulty = 0;
	private static float sum = 0;
	private static float overallScore = 0;
	private static float multiplier = (float) 0.6;
	
	public static void main(String args[])
	{
		// New ArrayList
		ArrayList<Float> judgeScores = new ArrayList<Float>();
		
		// Do while loop to add inputs into the ArrayList
		do
		{
			System.out.print("Enter Judge's Score between 0 and 10 : ");
			judgeScores.add(userInput.nextFloat());
		}
		//Loop runs only till 7
		while(judgeScores.size() < maxScores);
		{
			
		}
		
		//Sorts the scores
		Collections.sort(judgeScores);
		System.out.println(judgeScores);
		judgeScores.remove(0);
		judgeScores.remove(judgeScores.size()-1);
		System.out.println(judgeScores);
		
		//Input the degree of Difficulty
		System.out.print("Enter Degree of Difficulty between 1.2 and 3.8 :");
		degreeOfDifficulty = userInput.nextFloat();
		
		for (float i : judgeScores)
			sum += i;
		
		//Calculates the OverallScore
		overallScore = sum * degreeOfDifficulty * multiplier;
		System.out.println("The Overall Score is : " + overallScore);
		
	}
	

}
