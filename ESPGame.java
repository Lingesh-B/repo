/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Assignment 1 (Color guessing game)
 * Due: 09/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Lingesh Babu
*/


import java.util.Scanner;
import java.util.Random;


// This class contains the color guessing game. 
public class ESPGame {

	public static void main(String[] args)
	{
		final String COLOR_RED = "red", COLOR_GREEN = "green", COLOR_BLUE = "blue", COLOR_ORANGE = "orange", COLOR_YELLOW = "yellow";
		String userName, userDescription, dueDate, userGuess, correctColor, randomColor;
		int randNum, correctGuesses = 0;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
// Introduction and getting user information. 
		System.out.print("Enter your name: ");
	    userName = input.nextLine();
	    
	    System.out.print("Describe yourself: "); 
	    userDescription = input.nextLine(); 
	    
	    System.out.print("Due Date: ");
	    dueDate = input.nextLine(); 
	    
	    System.out.println("CMSC203 Assignment1: Test your ESP skills!");

// Start of game, (11 rounds)
	    for(int roundNum = 1; roundNum < 12; roundNum++)
	    {
	    	System.out.println("Round " + roundNum);
	    	System.out.println();
		    System.out.println("I am thinking of a color.");
		    System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
		    System.out.println("Enter your guess:");
		    userGuess = input.nextLine();
		    
// Validates user's guess. 
		    while(!userGuess.equalsIgnoreCase(COLOR_RED) && !userGuess.equalsIgnoreCase(COLOR_GREEN) && !userGuess.equalsIgnoreCase(COLOR_BLUE) 
		    		&& !userGuess.equalsIgnoreCase(COLOR_ORANGE) && !userGuess.equalsIgnoreCase(COLOR_YELLOW))
		    {
		    	System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
		    	System.out.println("Enter your guess again:");
		    	userGuess = input.nextLine();
		    }
		    
		    System.out.println();
		    
		    randomColor = "";
		    
// Generates a random number and assigns it to a color.
		    randNum = random.nextInt(5) + 1;
		    
		    switch(randNum)
		    {
		    case 1:
		    	randomColor = COLOR_RED;
		    	System.out.println("I was thinking of " + COLOR_RED);
		    	break;
		    case 2:
		    	randomColor = COLOR_GREEN;
		    	System.out.println("I was thinking of " + COLOR_GREEN);
		    	break;
		    case 3:
		    	randomColor = COLOR_BLUE;
		    	System.out.println("I was thinking of " + COLOR_BLUE);
		    	break;
		    case 4:
		    	randomColor = COLOR_ORANGE;
		    	System.out.println("I was thinking of " + COLOR_ORANGE);
		    	break;
		    case 5:
		    	randomColor = COLOR_YELLOW;
		    	System.out.println("I was thinking of " + COLOR_YELLOW);
		    	break;
		    	
		    		
		    }
		    
// Compares user guess to computer guess and adds 1 to correctGuesses if they are the same. 
		    if(randomColor.equalsIgnoreCase(userGuess))
		    {
		    	correctGuesses++;
		    }
		    
	    }
	    
// Displays the total correct guesses and user information. 
	    	 System.out.println("You guessed " + correctGuesses + " out of 11 colors correctly.");   
	    	 System.out.println("User Name: " + userName);
	    	 System.out.println("User Description: " + userDescription);
	    	 System.out.println("Due Date: " + dueDate);

	    
	   input.close();
		
	}
}
