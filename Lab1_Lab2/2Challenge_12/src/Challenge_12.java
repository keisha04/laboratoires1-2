import java.util.Scanner;


public class Challenge_12 
{

	public static void main(String[] args)
	{
		Scanner show = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Please enter a first number: ");
		number1 = show.nextInt();
		
		System.out.print("Please enter a second number: ");
		number2 = show.nextInt();
		
		if (number1>number2) 
		{
			System.out.printf("%d\n%d ",number2 , number1);
		}
		else 
		{
			System.out.printf("%d\n%d ",number1 , number2);
		}
	}

}
