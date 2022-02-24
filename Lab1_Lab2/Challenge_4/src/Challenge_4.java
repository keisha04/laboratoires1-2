import java.util.Scanner;


public class Challenge_4 
{

	public static void main(String[] args) 
	{
		Scanner value = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Please enter your first integer: ");
		number1 = value.nextInt();
		
		System.out.print("Please enter your second integer: ");
		number2 = value.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("The total is %d\n "+ sum);

	}

}
