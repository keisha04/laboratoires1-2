import java.util.Scanner;


public class Challenge_2
{

	public static void main(String[] args)
	{
		System.out.print("Enter your first name: ");
		Scanner na = new Scanner(System.in);
		String fn = na.nextLine();
		
		System.out.print("Enter your surname: ");
		Scanner su = new Scanner(System.in);
		String Sr = su.nextLine();
		
		System.out.println("Hello " + fn + " " + Sr);
		
	}

}
