import java.util.Scanner;


public class Challenge_5 
{

	public static void main(String[] args) 
	{
		Scanner value = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int sum;
		int mult;
		
		System.out.print("Please enter your first integer: ");
		number1 = value.nextInt();
		
		System.out.print("Please enter your second integer: ");
		number2 = value.nextInt();
		
		System.out.print("Please enter your third integer: ");
		number3 = value.nextInt();
		
		sum = number1 + number2;
		
		mult = sum * number3;
		
		System.out.printf("The answer is %d\n" + mult);

	}

}
