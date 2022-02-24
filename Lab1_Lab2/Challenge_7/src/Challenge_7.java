import java.util.Scanner;


public class Challenge_7 
{

	public static void main(String[] args)
	{
		Scanner year = new Scanner (System.in);
		
		String name;
		int age;
		int newAge;
		
		System.out.print("Enter your name: ");
		name = year.nextLine();
		
		System.out.print("Enter your age: ");
		age = year.nextInt();
		
		newAge = age + 1;
		
		System.out.printf("%s , next birthday you will be %d years " , name, newAge);

	}

}
