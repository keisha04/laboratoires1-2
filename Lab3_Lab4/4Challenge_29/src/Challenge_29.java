import java.text.DecimalFormat;

import java.util.Scanner;


public class Challenge_29 
{

	public static void main(String[] args) 
	{
		Scanner carre = new Scanner(System.in);
		
		int number;
		double answer;
		
		System.out.print("Enter a number over 500: ");
		number = carre.nextInt();
		answer = Math.sqrt(number);
		
		DecimalFormat carre2 = new DecimalFormat("###.##");
		System.out.println(carre2.format(answer));
			
	}

}
