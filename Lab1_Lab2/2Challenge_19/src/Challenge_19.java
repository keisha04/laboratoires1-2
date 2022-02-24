import java.util.Scanner;


public class Challenge_19
{

	public static void main(String[] args)
	{
		Scanner value2 = new Scanner(System.in);
		
		int number;
		
		System.out.println("Please enter 1, 2 or 3");
		number = value2.nextInt();
		
		if (number == 1)
			System.out.println("Thank you!");
		else if (number == 2)
			System.out.println("Well done!");
		else if (number == 3)
			System.out.println("Correct!");
		else
			System.out.println("Error message!");
		

	}

}
