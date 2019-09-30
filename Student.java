//imports
import java.io.*;

//student class
public class Student{
	
	
	
	
	//saves to file
	public static String readfromFile(){
		
		
		//get each line of the file
		try{
			
			InputStream fileinput = new FileInputStream("students.txt");
			InputStreamReader readinput = new InputStreamReader(fileinput);
			BufferedReader buffer = new BufferedReader(readinput);
			
			// Get's the first line in the file.
			String line = buffer.readLine();
			String save = line;
			String newline;
			while(line != null){	
			// Get the next line in the file...
			line = buffer.readLine();
			newline = "-" + line;
			save += newline;
			}
			buffer.close();
			String[] parts = save.split("-null");
			save= parts[0];
			return save;
		}
		catch (IOException ex) 
		{
			System.err.println(ex);
		}
		return null;
	}
}