import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class dictionary {

	
	static HashMap<String, String> hm = new HashMap<String, String>();
	
	public dictionary() 
	{
	}
	
	public void getDefinition(String word)
	{
		if (hm.get(word) == null)
		{
			System.out.println("That word is not definded for this dictionary, try again");
		}
		else
		{
			System.out.println(word +"- "+hm.get(word));
		}
		
	}
	
	public static void insertWord(String word, String definition)
	{
		hm.put(word, definition);
	}
	
	public void readFile(String filename) 
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			String line = br.readLine();
			while (line != null) 
			{
				String word = line;
				//line = br.readLine();
				String def = br.readLine();				
				line = br.readLine();
				insertWord(word,def);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
