import java.util.Scanner;


public class Challenge_22 
{

	private static final int x = 0;

	public static void main(String[] args) 
	{
		Scanner size = new Scanner(System.in);
		
		String firstName;
		String surName;
		String name;		
		
		System.out.print("Enter your first name in lowercase: ");
		firstName = size.nextLine();
		
		System.out.print("Enter your surname in lowercase: ");
		surName = size.nextLine();
		
		name = firstName+" "+surName;
		
		String[] tab = name.split(" ");
		
		for(int x = 0; x < tab.length; x++)
		{
			char nom = tab[x].charAt(0);
			
			String dimension = String.valueOf(nom).toUpperCase();
			
			String value = tab[x].substring(1);
			
			String fin = dimension + value;
		
			System.out.println(fin);
		}
		
		
		

	}

}
