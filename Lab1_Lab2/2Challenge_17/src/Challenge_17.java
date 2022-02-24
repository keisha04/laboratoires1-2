import java.util.Scanner;


public class Challenge_17 
{

	public static void main(String[] args) 
	{
		Scanner permission = new Scanner (System.in);
		
		int age;
		
		System.out.print("How old are you? ");
		age = permission .nextInt();
		
		if (age >= 18) 
			System.out.println("You can vote!");
		else if (age == 17)
			System.out.println("You can learn how to drive!");
		else if (age == 16)
			System.out.println("You can buy a lottery ticket!");
		else if (age <= 16)
			System.out.println("You can go Trick-or-Treating!");
			
	}

}
