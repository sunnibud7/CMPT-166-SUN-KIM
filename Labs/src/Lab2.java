/**
 *  @author Sun Kim 
 *  This Program will ask the user for two fractions and it will compare those two and if those two values
 *  are the same it will return true, if they do not equal to each other it return false
 *  It also lets author decide whether to repeat the program.
 */

/**Imports Util Package*/
import java.util.*;

public class Lab2 
{
	/**Initialize the Variables*/
	private static int Numerator;
	private static int Denominator;
	private static int NumeratorTwo;
	private static int DenominatorTwo;
	
	public static void main(String args[])	
	{
		/**Invokes Method Fraction and prints out the User input Value with / inbetween*/
		Fraction();
		System.out.println(Numerator+"/"+Denominator);
		
		/**Does the float division of Numerator/Denominator*/
		float fractions;
		fractions = (float)Numerator/Denominator;
		
		/**Invokes Equals method and prints out the second User input*/
		Equals();
		System.out.println(NumeratorTwo+"/"+DenominatorTwo);
		/**Does the float division of second Numerator/Denominator*/
		float fractionsTwo;
		fractionsTwo = (float)NumeratorTwo/DenominatorTwo;
		
		/**Prints out the values of fraction 1 and fraction 2 to compare*/
		System.out.println(fractions);
		System.out.println(fractionsTwo);
		
		/**if else statement for true and false if first fraction equals to second fraction
		 * print true, else print false*/
		if(fractions == fractionsTwo)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		
		/**Invoke the test program that repeats the program on user input command*/
		TestProgram();
	}
		
	public static void Fraction()
	{
		/**Create a new Scanner*/
		Scanner getNumber = new Scanner(System.in);
		
		/**Ask user for numerator and denominator*/
		System.out.print("What is your Numerator? : ");
		Numerator = getNumber.nextInt();
		System.out.print("What is your Denominator? : ");
		Denominator = getNumber.nextInt();	
		
		}
	public static void Equals()
	{
		/**Create a new Scanner*/
		Scanner getNumber = new Scanner(System.in);
		
		/**Ask user for second numerator and denominator*/
		System.out.print("What is your second Numerator?: ");
		NumeratorTwo = getNumber.nextInt();
		System.out.print("What is your Second Denominator?: ");
		DenominatorTwo = getNumber.nextInt();

	}
	public static void TestProgram()
	{
		/**Create a new Scanner*/
		Scanner YesOrNo = new Scanner(System.in);
		System.out.print("Would you like to continue? Yes = 1/No = 2: ");
		int YourAnswer;
		YourAnswer = YesOrNo.nextInt();
		
		/**while the user inputs 1 the main method will repeatedly run, if user inputs 2 it will stop the while
		 * loop*/
		while(YourAnswer == 1) 
		{
			/**Invokes main method*/
			String args[] = {};
			Lab2.main(args);
		}
		/**Closes the Scanner YesOrNo*/
		YesOrNo.close();
	}
}
