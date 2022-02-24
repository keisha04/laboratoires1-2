import java.util.Scanner;


public class Challenge_26 
{

	public static void main(String[] args) 
	{
		Scanner mot = new Scanner(System.in);
		
		String word;
		String first;
		int longs;
		String rest;
		String newword;
		
		
		System.out.print("Please enter a word: ");
		word = mot.nextLine();
		
		first = word.substring(0, 1);
		
		longs = word.length();
		
		rest = word.substring(1, longs);
		
		if (!first.equals("a") && !first.equals("e") && !first.equals("i") && !first.equals("o") && !first.equals("u"))
			{
			newword = rest + first+ "ay";
			}
		else
			{
			newword = word + "way";
			}
		System.out.println(newword.toLowerCase());

	}

}
