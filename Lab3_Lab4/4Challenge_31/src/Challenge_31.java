import java.text.DecimalFormat;


import java.math.*;

import java.util.Scanner;


public class Challenge_31 
{

	public static void main(String[] args) 
	{
		Scanner nombre = new Scanner(System.in);
		
		int radius;
		double area;
		
		System.out.print("Enter the radius of the circle: ");
		radius = nombre.nextInt();
		
		area = Math.PI*(Math.pow(radius,2));
		
		System.out.println(area);

	}

}
