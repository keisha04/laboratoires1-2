import java.util.Scanner;


public class Challenge_10 
{

	public static void main(String[] args) 
	{
		Scanner masse = new Scanner (System.in);
		
		int kilo;
		double pound;
		
		System.out.print("Enter the number of kilo: ");
		kilo = masse.nextInt();
		
		pound = kilo * 2.204;
		
		System.out.printf("That is %.3f pounds", pound);
		

	}

}
