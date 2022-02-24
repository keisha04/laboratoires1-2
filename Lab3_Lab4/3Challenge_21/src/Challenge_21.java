import java.util.Scanner;


public class Challenge_21
{

	public static void main(String[] args)
	{
		Scanner size = new Scanner(System.in);
		
		String firstName;
		String surName;
		String name;
		
		System.out.print("Enter your first name: ");
		firstName = size.nextLine();
		
		System.out.print("Enter your surname: ");
		surName = size.nextLine();
		
		name = firstName+" "+surName;
		
		System.out.println(name);
		
		System.out.println(name.length());
				

	}

}
