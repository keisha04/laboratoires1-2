import java.util.Scanner;


public class Challenge_9
{

	public static void main(String[] args) 
	{
		Scanner time = new Scanner (System.in);
		
		int days;
		int hours;
		int minutes;
		int seconds;
		
		System.out.print("Enter the number of days: ");
		days = time.nextInt();
		
		hours = days *24;
		
		minutes = hours * 60;
		
		seconds = minutes * 60;
		
		System.out.printf("In %d days there are: \n", days);
		System.out.printf("%d hours\n", hours);
		System.out.printf("%d minutes\n", minutes);
		System.out.printf("%d seconds\n", seconds);
		

	}

}
