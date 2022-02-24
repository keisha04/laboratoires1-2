import java.util.Scanner;


public class Challenge_6  
{

	public static void main(String[] args) 
	{
		Scanner value = new Scanner(System.in);
		
		int startNum;
		int endNum;
		int slicesLeft;
		
		System.out.print("Please enter the number of slices pizza you started with: ");
		startNum = value.nextInt();
		
		System.out.print("Please enter the number of slices pizza you have eaten: ");
		endNum = value.nextInt();

		slicesLeft = endNum - startNum;
		
		System.out.printf("You have %d slices remaining" + slicesLeft);
	}

}
