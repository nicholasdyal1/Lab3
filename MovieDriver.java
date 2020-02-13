import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {



		//used to read user's answer if they want to continue
		String answer;
		
		do	{Scanner scan = new Scanner(System.in);
		Movie m = new Movie(); //movie object
		String movie;
		String rating;
		int tickets;
		System.out.println("Enter the title of the movie");
		movie=scan.nextLine();
		m.setTitle(movie);//set the title in movie object

		System.out.println("Enter the movie rating");
		rating=scan.nextLine();
		m.setRating(rating); //set the rating in movie object
		System.out.println("Enter the number of tickets sold");
		tickets=scan.nextInt();
		m.setSoldTickets(tickets); //set the tickets in the movie object
		System.out.println(m.toString());//use tostring method
		scan.nextLine();//used to unstuck the program so the user can answer
		System.out.println("Do you want to enter another movie? yes or no");
		answer=scan.nextLine();
		}while(answer.equalsIgnoreCase("yes"));
		System.out.println("Goodbye");
	}

}
