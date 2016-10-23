package autoparts;


import static java.lang.System.*;

import java.io.FileNotFoundException;
import java.io.IOException;

//Files needed
 	//Part.java
 	//PartList.java

public class PartRunner
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		PartList prog = new PartList("partinfo.dat");
		out.println(prog);
	}
}
