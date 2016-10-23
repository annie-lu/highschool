package charMaker;

import java.util.ArrayList;

public class AA_307820 implements CharacterMaker {
	char[] supported={'A','n','i','e','L','u'}; //im selfcentered so i made it my name
	char[][] A={{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ','A','A','A',' ',' ',' ',' '},{' ',' ','A','A','A','A','A',' ',' ',' '},{' ','A','A',' ',' ',' ','A','A',' ',' '},{'A','A','A','A','A','A','A','A','A',' '},{'A','A',' ',' ',' ',' ',' ','A','A',' '}};
	char[][] n={{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ','n','n',' ','n','n','n',' ',' '},{' ',' ','n','n','n',' ',' ','n','n',' '},{' ',' ','n','n',' ',' ',' ','n','n',' '},{' ',' ','n','n',' ',' ',' ','n','n',' '}};
	char[][] i={{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ','i','i','i',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ','i','i','i',' ',' ',' ',' '},{' ',' ',' ','i','i','i',' ',' ',' ',' '},{' ',' ',' ','i','i','i',' ',' ',' ',' '},{' ',' ',' ','i','i','i',' ',' ',' ',' '}};
	char[][] e={{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ','e','e','e',' ',' '},{' ',' ',' ','e','e',' ',' ',' ','e',' '},{' ',' ',' ','e','e','e','e','e',' ',' '},{' ',' ',' ',' ','e','e','e','e','e',' '}};
	char[][] L={{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ','L','L',' ',' ',' ',' ',' ',' '},{' ',' ','L','L',' ',' ',' ',' ',' ',' '},{' ',' ','L','L',' ',' ',' ',' ',' ',' '},{' ',' ','L','L',' ',' ',' ',' ',' ',' '},{' ',' ','L','L','L','L','L','L','L',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
	char[][] u={{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ',' ','u','u',' ',' ',' ','u','u',' '},{' ',' ','u','u',' ',' ',' ','u','u',' '},{' ',' ','u','u',' ',' ',' ','u','u',' '},{' ',' ',' ','u','u','u','u',' ','u',' '}};
	public char[][] characterToAscii(char character) {
		// TODO Auto-generated method stub
        switch (character) {
            case 'A':  return A;
            case 'n':  return n;
            case 'i':  return i;
            case 'e':  return e;
            case 'L':  return L;
            case 'u':  return u;
            default: return null;
        }
                    
	}

	public boolean characterSupported(char character) {
		// TODO Auto-generated method stub
		for(int x=0;x<supported.length;x++){
			if (supported[x]==character)
				return true;}
		return false;
	}

	public char[] supportedCharacters() {
		// TODO Auto-generated method stub
		
		return supported;
	}

	public String toString(char character){
		char [][]asciiArt=this.characterToAscii(character);
		String letter="";
		if(asciiArt!=null){
			
		for (int row=0;row<10;row++)
			for (int column=0;column<10;column++){
			 letter += asciiArt[row][column];
			 if(column==9)
				 letter+="\n";}}

		return letter;
	}
	
	public String toString(String phrase){
	   ArrayList<String>supported=new ArrayList<String>();		
	   String sentence="";
		
	   for(int x=0;x<phrase.length();x++){
			if (characterSupported(phrase.charAt(x)))
				supported.add(phrase.charAt(x)+"");
		}
		
		for (int r = 0; r < 10 ; r++)
		{
			for(int s = 0; s <supported.size(); s++)
			{
				for (int c = 0; c < 10; c++)
				{
					sentence+=(characterToAscii((supported.get(s).charAt(0)))[r][c]);
				}
				sentence+="\t";
			}
			sentence+="\n";
		}
		
		return sentence;
				
	}
		
	}

