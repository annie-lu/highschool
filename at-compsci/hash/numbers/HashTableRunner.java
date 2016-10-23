package numbers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class HashTableRunner
{
  public static void main ( String[] args ) throws FileNotFoundException, IOException
  {
	  
		try(BufferedReader br = new BufferedReader(new FileReader("Files/numbers.dat"))){
			
			String line=br.readLine();
			
			HashTable x= new HashTable();
			while (line != null) {
				
				x.add(line);
				line = br.readLine();
				
			}
			System.out.println(x);
		}
  }
}