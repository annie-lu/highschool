package p18_4;

public class Finder
{
	public static void main(String[] args)
	{
		String hello="hello";
		String hell="hell";
		System.out.println(find(hello,hell));
	    
	}
	
	public static boolean find(String toSearch, String toFind)
	{
		if(toSearch==""||toSearch.length()<toFind.length())
			  return false;
			  
			String threeLetters=toSearch.substring(toSearch.length()-toFind.length());
			  if(threeLetters.equals(toFind))
			  return true;
			  
			  return find(toSearch.substring(0,toSearch.length()-1),toFind);
	    
	}
}
