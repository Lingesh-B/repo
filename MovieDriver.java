import java.util.Scanner;

// This class will display info on a movie based on user input. 
public class MovieDriver 
{ 
	
	public static void main(String[] args)
	{
		String movieTitle, rating, enterAnother = null; 
		int ticketNum;
		Scanner input = new Scanner(System.in); 
		Movie m1 = new Movie(); 

// Loop to ask info for multiple movies. 
		do 
		{
			System.out.println("Enter the name of a movie"); 
			movieTitle = input.nextLine();  
			m1.setTitle(movieTitle);
			
			System.out.println("Enter the rating of the movie");
			rating = input.nextLine();
			m1.setRating(rating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			ticketNum = input.nextInt();
			m1.setSoldTickets(ticketNum);
			input.nextLine();
			
			System.out.println(movieTitle + " " + "(" + rating + ")" + ": Tickets Sold: " + ticketNum);
			System.out.println("Do you want to enter another? (y or n)");
			enterAnother = input.nextLine();
		}
		
		while(enterAnother.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
		
	}

}
