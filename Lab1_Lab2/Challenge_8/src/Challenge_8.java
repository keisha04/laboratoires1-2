import java.util.Scanner;


public class Challenge_8 
{

	public static void main(String[] args) 
	{
		Scanner taxe = new Scanner(System.in);
		
		int bill;
		int people;
		int each;
		
		System.out.print("The total cost of the bill is: ");
		bill = taxe.nextInt();
		
		System.out.print("The people's number is: ");
		people = taxe.nextInt();
		
		each = bill / people;
		
		
		System.out.printf("Each person should pay $ %d " , each);
		
	}

}
