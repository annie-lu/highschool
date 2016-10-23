package p18_1_and_p18_3;

public class StringReverser
{
	public static void main(String[] args)
	{
		System.out.println(reverse("apple"));
	}
	
	public static String reverse(String toReverse)
	{
	
		if(toReverse.length()==1)
			return toReverse;
		
		String reverse=reverse(toReverse.substring(0,toReverse.length()-1));
		return toReverse.charAt(toReverse.length()-1)+reverse;
	}
	
	public static String reverseIteratively(String toReverse)
	{	
String reversed="";
		
		for(int x=1;x<=toReverse.length();x++){
			reversed+=toReverse.charAt(toReverse.length()-x);
		}
		
		return reversed;
	}
}