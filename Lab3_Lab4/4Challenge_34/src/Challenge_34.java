import java.util.Scanner;


public class Challenge_34 
{

	public static void main(String[] args) 
	{
		Scanner formes = new Scanner(System.in);
		
		int menuSelection;
		int side;
		int area;
		int base;
		int height;
		
		System.out.print("1) Square\n");
		System.out.print("2) Triangle");
		System.out.println( );
		
		System.out.print("Enter a number: ");
		menuSelection = formes.nextInt();
		
		if (menuSelection == 1 ) 
		{
			System.out.print("Enter the length of one side: ");
			side = formes.nextInt();
			area = side * side;
			System.out.printf("The area of your choosen shape is "+ area);
		}
		else if (menuSelection == 2) 
		{
			System.out.print("Enter the length of the base: ");
			base = formes.nextInt();
			
			System.out.print("Enter the height of the triangle: ");
			height = formes.nextInt();
			
			area = (base * height)/2;
			
			System.out.printf("The area of your choosen shape is "+ area);
		}
		else
			System.out.print("Incorrectoption selected");

	}

}
