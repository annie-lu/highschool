package p6_2;

public class Cards {
	private String cardName;
	
	public Cards(String card){
		cardName=card;
	}
	
	public void getDescription(){
		
		String value=cardName.substring(0,1);
		String suit=cardName.substring(1,2);
		String description="";
		
		if(value.equals("A")){
			description="Ace";
		}
		else if(value.equals("J")){
			description="Jack";
		}
		else if(value.equals("Q")){
			description="Queen";
		}
		else if(value.equals("K")){
			description="King";
		}
		else if(Integer.parseInt(value)>=1)
			description=value;
		
		if (suit.equals("D"))
			description = description + " of diamonds";
		else if (suit.equals("H"))
			description = description + " of hearts";
		else if (suit.equals("S"))
			description = description + " of spades";
		else if (suit.equals("C"))
			description = description + " of clubs";
			
			System.out.println(description);
	}

}
