import java.util.Scanner;


public class Challenge_16 
{

	public static void main(String[] args)
	{
		Scanner season = new Scanner (System.in);
		
		System.out.print("Is it raining? ");
		String rain = season.nextLine();
		rain = rain.toLowerCase();
		
		if (rain .equals("yes")) 
		{
			System.out.print("Is it windy? ");
			String wind = season.nextLine();
			wind = wind.toLowerCase();
			
			if (wind .equals("yes")) 
				System.out.println("It is too windy for an umbrella!");
			
			else 
				System.out.println("Take an umbrella!");
		}
		
		else 
		{
			System.out.println("Enjoy your day!");
				
		}

	}
}


