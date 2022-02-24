import java.util.Scanner;


public class Challenge_18
{

	public static void main(String[] args) 
	{
		Scanner size2 = new Scanner(System.in);
		
		int number;
		
		System.out.print("Please enter a number: ");
		number = size2.nextInt();
		
	    if (number < 10)
			System.out.println("Too low!");
		else if (number < 10 && number < 20)
			System.out.println("Corrrect!");
		else 
			System.out.println("Too hight!");
		
	}

}
