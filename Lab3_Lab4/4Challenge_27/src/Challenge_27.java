import java.util.Scanner;


public class Challenge_27 
{

	public static void main(String[] args) 
	{
		Scanner nombre = new Scanner(System.in);
		
		float number;
		
		System.out.print("Enter a number with lots of decimal places: ");
		number = nombre.nextFloat();
		
		System.out.println(number*2);

	}

}
