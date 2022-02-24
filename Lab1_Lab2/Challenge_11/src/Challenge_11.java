import java.util.Scanner;


public class Challenge_11
{

	public static void main(String[] args)
	{
		Scanner size = new Scanner (System.in);
		
		int larger;
		int smaller;
		int answer;
		
		System.out.print("Please enter a number over 100: ");
		larger = size.nextInt();
		
		System.out.print("Please enter a number under 10: ");
		smaller = size.nextInt();
		
		answer = larger / smaller;
		
		System.out.printf("%d goes into %d, %d times" , smaller, larger, answer );
		

	}

}
