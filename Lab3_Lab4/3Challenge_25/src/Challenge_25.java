import java.util.Scanner;


public class Challenge_25 
{

	public static void main(String[] args)
	{
		Scanner size = new Scanner(System.in);
		
		String name;
		String surname;
		
		System.out.print("Please enter your first name: ");
		name = size.nextLine();
		
		if (name.length() < 5) 
		{
			System.out.print("Enter your surname: ");
			surname = size.nextLine();
			name = name + surname;
			System.out.println(name.toUpperCase());
		}
		
		else
			System.out.println(name.toLowerCase());
		
			
				
	}

}
