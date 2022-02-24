import java.util.Scanner;


public class Challenge_14
{

	public static void main(String[] args) 
	{
		Scanner value = new Scanner(System.in);
		
		int num;
		
		System.out.print("Please enter a value between 10 and 20: ");
		num = value.nextInt();
		
		if (num >=10 && num <= 20) 
		{
			System.out.println("Thank you!");
		}
		else 
		{
			System.out.println("Incorrect answer!");
		}

	}

}
