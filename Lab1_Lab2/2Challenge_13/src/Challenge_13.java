import java.util.Scanner;


public class Challenge_13 
{

	public static void main(String[] args) 
	{
		Scanner value = new Scanner(System.in);
		
		int num;
		
		System.out.print("Please enter a value less than 20:");
		num = value.nextInt();
		
		if (num >= 20) 
		{
			System.out.println("Too hight!");
		}
		else 
		{
			System.out.println("Thank you!");
		}

	}

}
