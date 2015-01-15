import java.util.Scanner;
public class DictionaryDriver 
{
	static Scanner kbd = new Scanner(System.in);
	private static String filename ="dictionarywords.txt";
	private static dictionary d = new dictionary();
	
	public static void main(String[] args)
	{	
		d.readFile(filename);
		DictionaryDriver.commandPrompt();
		
	}
	
	public static void commandPrompt()
	{
		System.out.println("What word would you like defined?");
		System.out.println("computer, program, robot, sea, wolf, or would you like to exit?");
		
		String word = kbd.next();
			
		switch(word)
		{
		case"computer":
		{
			d.getDefinition(word);
			System.out.println();
			commandPrompt();
			break;
		}
		case"program":
		{
			d.getDefinition(word);
			System.out.println();
			commandPrompt();
			break;
		}
		case"robot":
		{
			d.getDefinition(word);
			System.out.println();
			commandPrompt();
			break;
		}
		case"sea":
		{
			d.getDefinition(word);
			System.out.println();
			commandPrompt();
			break;
		}
		case"wolf":
		{
			d.getDefinition(word);
			System.out.println();
			commandPrompt();
			break;
		}
		case"exit":
		{
			System.out.println("Goodbye!");
			break;
		}
		}
	}
	
}