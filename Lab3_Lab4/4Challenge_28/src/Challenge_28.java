import java.text.DecimalFormat;


import java.util.Scanner;


public class Challenge_28 
{

	public static void main(String[] args) 
	{
		Scanner nombre = new Scanner(System.in);
		
		float number;
		float answer;
		
		System.out.print("Enter a number with lots of decimal places: ");
		number = nombre.nextFloat();
		
		answer = number * 2;
		
		System.out.println(answer);
		
		DecimalFormat mesure = new DecimalFormat("###.##");
		System.out.println(mesure.format(answer));
		
		

	}

}
