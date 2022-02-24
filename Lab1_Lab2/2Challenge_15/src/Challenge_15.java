import java.util.Scanner;


public class Challenge_15 
{

	public static void main(String[] args) 
	{
		Scanner prefer = new Scanner(System.in);
		
		String colour;
		
		System.out.print("Please enter your favourite colour: ");
		colour = prefer.next();
		
		if (colour .equals("red") || colour .equals("RED") || colour .equals("Red")) 
		{
			System.out.println("I like red too!");
		}
		else 
		{
			System.out.println("I don't like that colour, I prefer red!");
		}
	}

}
