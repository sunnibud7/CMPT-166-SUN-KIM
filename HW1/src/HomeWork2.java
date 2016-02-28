/** @author Sun Ho Kim 
 * 
 * This Program prints out the BeerSong Yayaya!
 * */

import java.util.*;

public class HomeWork2 
{
	public static void main(String[] args)
	{
		/**Create a new Scanner*/
		Scanner NumberInput = new Scanner(System.in);
		
		/** Initialize input, and BeerBottles variables*/
		System.out.print("How many Bottles of Beer? :");
		int BeerBottles;
		BeerBottles = NumberInput.nextInt();
		
		/**Condition in case someone inputs more than 99 or less than 0*/
		if (BeerBottles >= 99)
		{
			BeerBottles = 99;
		}
		else if (BeerBottles <= 0)
		{
			BeerBottles = 0;
			System.out.println("Zero bottles of beer on the wall.");
		}		
		
		/**While loop. While BeerBottles are more than 1 it runs*/
		while (BeerBottles != 0)
		{
			/**Initialize String*/
			String OneValue = "hai";
		
			int OnesValue = BeerBottles%10;
			
			/** OnesValue is the remainder when divided my 10 so second part of counting down is showed
			 * here*/
				if (OnesValue == 9)
				{
					OneValue = "Nine";
				}
				else if (OnesValue == 8)
				{
					OneValue = "Eight";
				}
				else if (OnesValue == 7)
				{
					OneValue = "Seven";
				}
				else if (OnesValue == 6)
				{
					OneValue = "Six";
				}
				else if (OnesValue == 5)
				{
					OneValue = "Five";
				}
				else if (OnesValue == 4)
				{
					OneValue = "Four";
				}
				else if (OnesValue == 3)
				{
					OneValue = "Three";
				}
				else if (OnesValue == 2)
				{
					OneValue = "Two";
				}
				else if (OnesValue == 1)
				{
					OneValue = "One";
				}
				else if (OnesValue == 0)
				{
					OneValue = "";
				}
			
			/** Special Output statement when BeerBottles reaches 1*/
			if (BeerBottles == 1)
			{
				System.out.println("One bottle of Beer on the wall,");
				System.out.println("One bottle of beer,");
				System.out.println("Take one down, pass it around,");
				System.out.println("Zero bottles of beer on the wall.");
				BeerBottles = BeerBottles -1;
				break;
			}
			
			/** Statements for outputs from range 90~99,80~89, and so forth*/
			else if (BeerBottles >=90 && BeerBottles <=99)
			{
				System.out.println("Ninety" + " " + OneValue + " " +"bottle of Beer on the wall,");
				System.out.println("Ninety" + " " + OneValue + " " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles >=80 && BeerBottles <=89)
			{
				System.out.println("Eighty" + " " + OneValue + " " +"bottle of Beer on the wall,");
				System.out.println("Eighty" + " " + OneValue + " " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles >=70 && BeerBottles <=79)
			{
				System.out.println("Seventy" + " " + OneValue + " " +"bottle of Beer on the wall,");
				System.out.println("Seventy" + " " + OneValue + " " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles >=60 && BeerBottles <=69)
			{
				System.out.println("Sixty" + " " + OneValue + " " +"bottle of Beer on the wall,");
				System.out.println("Sixty" + " " + OneValue + " " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles >=50 && BeerBottles <=59)
			{
				System.out.println("Fifty" + " " + OneValue + " " +"bottle of Beer on the wall,");
				System.out.println("Fifty" + " " + OneValue + " " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles >=40 && BeerBottles <=49)
			{
				System.out.println("Forty" + " " + OneValue + " " +"bottle of Beer on the wall,");
				System.out.println("Forty" + " " + OneValue + " " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles >=30 && BeerBottles <=39)
			{
				System.out.println("Thirty" + " " + OneValue + " " +"bottle of Beer on the wall,");
				System.out.println("Thirty" + " " + OneValue + " " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles >=20 && BeerBottles <=29)
			{
				System.out.println("Twenty" + " " + OneValue + " " +"bottle of Beer on the wall,");
				System.out.println("Twenty" + " " + OneValue + " " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			
			/** From nineteen to 2 made a unique output statements*/
			else if (BeerBottles == 19)
			{
				System.out.println("Nineteen" +" " +"bottle of Beer on the wall,");
				System.out.println("Nineteen" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 18)
			{
				System.out.println("Eighteen" +" " +"bottle of Beer on the wall,");
				System.out.println("Eighteen" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 17)
			{
				System.out.println("Seventeen" +" " +"bottle of Beer on the wall,");
				System.out.println("Seventeen" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 16)
			{
				System.out.println("Sixteen" +" " +"bottle of Beer on the wall,");
				System.out.println("Sixteen" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 15)
			{
				System.out.println("Fifteen" +" " +"bottle of Beer on the wall,");
				System.out.println("Fifteen" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 14)
			{
				System.out.println("Fourteen" +" " +"bottle of Beer on the wall,");
				System.out.println("Fourteen" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 13)
			{
				System.out.println("Thirteen" +" " +"bottle of Beer on the wall,");
				System.out.println("Thirteen" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 12)
			{
				System.out.println("Twelve" +" " +"bottle of Beer on the wall,");
				System.out.println("Twelve" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 11)
			{
				System.out.println("Eleven" +" " +"bottle of Beer on the wall,");
				System.out.println("Eleven" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 10)
			{
				System.out.println("Ten" +" " +"bottle of Beer on the wall,");
				System.out.println("Ten" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 9)
			{
				System.out.println("Nine" +" " +"bottle of Beer on the wall,");
				System.out.println("Nine" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 8)
			{
				System.out.println("Eight" +" " +"bottle of Beer on the wall,");
				System.out.println("Eight" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 7)
			{
				System.out.println("Seven" +" " +"bottle of Beer on the wall,");
				System.out.println("Seven" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 6)
			{
				System.out.println("Six" +" " +"bottle of Beer on the wall,");
				System.out.println("Six" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 5)
			{
				System.out.println("Five" +" " +"bottle of Beer on the wall,");
				System.out.println("Five" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 4)
			{
				System.out.println("Four" +" " +"bottle of Beer on the wall,");
				System.out.println("Four" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 3)
			{
				System.out.println("Three" +" " +"bottle of Beer on the wall,");
				System.out.println("Three" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
			else if (BeerBottles == 2)
			{
				System.out.println("Two" +" " +"bottle of Beer on the wall,");
				System.out.println("Two" +" " +"bottle of beer,");
				System.out.println("Take one down, pass it around,");
				BeerBottles = BeerBottles -1;
			}
		}
		/** Close the Scanner*/
		NumberInput.close();
	}
}	

