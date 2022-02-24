import java.util.Scanner;


public class Challenge_23 
{

	public static void main(String[] args) 
	{
		Scanner nursery = new Scanner(System.in);
		
		String name;
		int start;
		int end;
		String fin;
		
		
		System.out.print("Please enter the first line of a nursery rhyme: ");
		name = nursery.nextLine();
		
		System.out.printf("This has %d letters in it\n", name.length());
		
		System.out.print("Enter a starting number: ");
		start = nursery.nextInt();
		
		System.out.print("Enter an end number: ");
		end = nursery.nextInt();
		
		fin = name.substring(start, end);
		
		System.out.println(fin);
				
	}

}
