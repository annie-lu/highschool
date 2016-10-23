package pigLatin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pigs {
	
	/**
	 * Translates word into pig latin
	 * @param englishWord the word to translate
	 * @return pigLatinWord the translated word
	 */
	
	private String translateWord(String englishWord)
	{
		final String VOWELS = "[aeiouAEIOU]";
		boolean capitalized= Character.isUpperCase(englishWord.charAt(0));
		englishWord=englishWord.toLowerCase();
		Pattern pattern = Pattern.compile(VOWELS);
		Matcher match = pattern.matcher(englishWord);
		String pigLatinWord=englishWord;
		
		if(match.find(0))
		{
			String start = englishWord.substring(0, match.start());
			String end = englishWord.substring(match.start(), englishWord.length());
			
			pigLatinWord=end+start+"ay";
		}
		else if(englishWord.substring(0, 1).matches(VOWELS))
			pigLatinWord +="yay";
		else 
			pigLatinWord += "ay";
		
		if (capitalized)
			pigLatinWord= pigLatinWord.substring(0,1).toUpperCase()+pigLatinWord.substring(1);
		
		return pigLatinWord;
	}
	
	/**
	 * Translates sentence into pig latin
	 * @param sentence the sentence you want to translate
	 * @return pigLatinSentence the translated sentence
	 */
	public String translateSentence(String sentence)
	{
		final String DILINEATORS = "[\\s,.?!;:\\-\"'()/\\\\]+";
		String[] words = sentence.split(DILINEATORS);
		String pigLatinSentence = sentence; 
		
		for(int x = 0; x < words.length; x++)
		{		
			if(!words[x].equals(""))
			{
				String englishWord = words[x];
				String pigLatinWord = translateWord(words[x].trim());
				pigLatinSentence = pigLatinSentence.replace(englishWord, pigLatinWord);}
		}
		
		return pigLatinSentence;
	}
}
