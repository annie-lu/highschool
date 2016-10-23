package bananana;

public class WordThing {
	public static String backwards(String word){
		if(word.length()==1)
			return word;
		
		return word.charAt(word.length()-1)+backwards(word.substring(0,word.length()-1));

}
}
