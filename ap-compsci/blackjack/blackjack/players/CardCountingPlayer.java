package blackjack.players;

import java.util.List;

import blackjack.Card;
import blackjack.HandUtilities;
import blackjack.PlayerAction;

public class CardCountingPlayer extends BasicPlayer {

    int runningCount;
    int trueCount;
    double decks;
    int cardsLeft=312;
    int insuranceCount;
    int tensLeft = 4*4*6;

			public PlayerAction act(List<Card> ownHand, Card dealerUpCard,
					List<PlayerAction> allowedActions) {

				int ownSum = HandUtilities.value(ownHand);
				int index=0;
				boolean fabFour=true;

				if(ownSum==14&&dealerUpCard.value().numericValue()==10)
					index=3;
				else if(ownSum==15&&dealerUpCard.value().numericValue()==10)
					index=0;
				else if(ownSum==15&&dealerUpCard.value().numericValue()==9)
					index=2;
				else if(ownSum==15&&dealerUpCard.value().numericValue()==1)
					index=1;
				else
					fabFour=false;

				if(fabFour && trueCount>=index && allowedActions.contains(PlayerAction.SURRENDER))
						 return PlayerAction.SURRENDER;
				
					
				return super.act(ownHand, dealerUpCard, allowedActions);
				
		 
			}
    
    public double bet(double minBet, double maxBet) {
    	
    	if(trueCount<=1)
    		return minBet;
        else if(trueCount<=3){
        	if(2*minBet>maxBet)
        		return maxBet;
        	else
        		return 2*minBet;
        }
        else if(trueCount<=5){
        	if(4*minBet>maxBet)
        		return maxBet;
        	else
        	 return 4*minBet;
        }
        else if(trueCount<=6){
        	if(8*minBet>maxBet)
        		return maxBet;
        	else
        	 return 8*minBet;
        }
        else{
        		return maxBet;
        }
	}
    
  
    public void faceUpCard(Card card) {
    	cardsLeft--;
    	decks=cardsLeft/52;
    	
    	if(card.value().numericValue()==10){
    		insuranceCount-=9;
    		tensLeft--;
    	}
    	else
    		insuranceCount+=4;
    	
    	int cardValue=card.value().numericValue(); 
    	if(2<=cardValue&&cardValue<=6) 
    		runningCount++;
    	else if(cardValue==10||cardValue==11||cardValue==1)
    		runningCount--;
    	
    	trueCount= (int)Math.round((runningCount/decks)); 
	} 
    
    public void shuffle() {

    	insuranceCount=0;
    	runningCount = 0;
    	cardsLeft = 312;
    	tensLeft = 4*4*6;
    	
	} 
    
    public boolean insureHand(List<Card> ownHand, Card dealerUpCard) {
		return insuranceCount > 24;
	}
}
