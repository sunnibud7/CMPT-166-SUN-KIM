/** Lab 1 
 
 * This Program will get the user input and print
 * them in 3 different ways.
 * This program will also read the textfile and
 * save the output as outputText.txt.
 
 @author Sun Kim
 
 Date - 1/27/16 */



/** import the scanner class so we can add user
 * input, imported File, FileWriter, * and FileNotFoundException to write and save to a file.*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.*;

public class lab1 
{
	public static void main (String[] args) throws Exception
{
	/** Assign a new Scanner for User input */
	Scanner Reader = new Scanner(System.in);
	
	/** This writes to a new file in the destined folder below. 
	 * For this lab we needed outputText.txt*/
	FileWriter output = new FileWriter("outputText.txt");
	
	/** Ask the user for the word*/
	System.out.print("Enter the word :");
	String wordInput;
	wordInput = Reader.nextLine();
	
	/** This assigns the word user typed into a
	 * upper case letters and prints it out*/
	String UpperCase = wordInput;
	String Upper;
	Upper = UpperCase.toUpperCase();
	System.out.println(Upper);
	
	/** This assigns the word use typed into a 
	 * lower case letters and prints it out
	 */
	String LowerCase = wordInput;
	String Lower;
	Lower = LowerCase.toLowerCase();
	System.out.println(Lower);
	
	/**It adds the Uppercase word, lowercase word and vertical word into the 
	 * outputText.txt file.*/
	output.write(Upper+"\r\n");
	output.write(Lower+"\r\n");
	
	/**
	 * This converts the String word into char and
	 * prints out the array from 0~ the length of
	 * the word
	 * the array increases by 1 and println allows
	 * each letter to print once everyline*/
	char array[] = wordInput.toCharArray();
	for(int x=0; x<array.length;x++)
	{
		System.out.println(array[x]);
		output.write(array[x]);
		output.write("\r\n");
	}
	
	/**
	 * This creates new scanner that reads the input file in my personal CMPT 166 Folder*/
	Scanner readtext = new Scanner(new File("inputText.txt"));
	
	/**While loop that reads the text in the inputText.txt and prints uppercased words, lowercased words
	 * and lastly it prints the word vertically.*/
	while (readtext.hasNext())
	{
		String y = readtext.next();
		String ytext;
		ytext = y.toUpperCase();
		System.out.println(ytext);
		String yyy;
		yyy = y.toLowerCase();
		System.out.println(yyy);
		
		/** This writes the words in inputText.txt to the outputText.txt file.
		 * "\r\n" makes a new line for the next word*/
		output.write(ytext+"\r\n");
		output.write(yyy+"\r\n");

		char yarray[]= y.toCharArray();
		for (int z=0; z<yarray.length; z++)
		{
			System.out.println(yarray[z]);
			output.write(yarray[z]);
			output.write("\r\n");
			
		}
		

	}
	/** Closes all the scanners used*/
	output.close();
	Reader.close();
	readtext.close();
}
}
