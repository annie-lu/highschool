package blackjack.players;

import java.util.List;

import blackjack.BlackjackPlayer;
import blackjack.Card;
import blackjack.HandUtilities;
import blackjack.PlayerAction;
import blackjack.Result;

public class BasicPlayer implements BlackjackPlayer{

	String h = "h"; //PlayerAction.HIT;
	String s = "s"; //PlayerAction.STAND;
	String dh = "dh"; //PlayerAction.HIT;
	String ds = "ds"; //PlayerAction.STAND;
	String p = "p"; //PlayerAction.SPLIT;
	String ph = "ph"; //PlayerAction.SPLIT;
	String rh = "rh"; //PlayerAction.HIT;

	String[][] hard = { { h, h, h, h, h, h, h, h, h, h },
			{ h, dh, dh, dh, dh, h, h, h, h, h },
			{ dh, dh, dh, dh, dh, dh, dh, dh, h, h },
			{ dh, dh, dh, dh, dh, dh, dh, dh, dh, h },
			{ h, h, s, s, s, h, h, h, h, h }, 
			{ s, s, s, s, s, h, h, h, h, h },
			{ s, s, s, s, s, h, h, h, h, h },
			{ s, s, s, s, s, h, h, h, rh, h },
			{ s, s, s, s, s, h, h, rh, rh, rh },
			{ s, s, s, s, s, s, s, s, s, s }, };
	
	String[][] soft = { { h, h, h, dh, dh, h, h, h, h, h },
			{ h, h, h, dh, dh, h, h, h, h, h },
			{ h, h, dh, dh, dh, h, h, h, h, h },
			{ h, h, dh, dh, dh, h, h, h, h, h },
			{ h, dh, dh, dh, dh, h, h, h, h, h },
			{ s, ds, ds, ds, ds, s, s, h, h, h },
			{ s, s, s, s, s, s, s, s, s, s }, };
	
	String[][] splits = { { ph, ph, p, p, p, p, h, h, h, h },
			{ ph, ph, p, p, p, p, h, h, h, h },
			{ h, h, h, ph, ph, h, h, h, h, h },
			{ ph, p, p, p, p, h, h, h, h, h },
			{ p, p, p, p, p, p, h, h, h, h }, 
			{ p, p, p, p, p, p, p, p, p, p },
			{ p, p, p, p, p, s, p, p, s, s }, 
			{ p, p, p, p, p, p, p, p, p, p }, };
	
	@Override
	public void playerIDs(List<String> playerIDs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialBet(int playerIndex, double bet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialBets(List<Double> bets) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faceUpCard(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insuranceDecision(int playerIndex, List<Card> playersHand,
			Card dealersUpCard, boolean insuredHand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insuranceResult(int playerIndex, double bet,
			List<Card> playersHand, Card dealersUpCard, boolean insuranceBetWon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decision(int playerIndex, List<Card> playersHand,
			Card dealersUpCard, List<PlayerAction> allowedActions,
			PlayerAction action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void result(int playerIndex, double bet, List<Card> playersHand,
			List<Card> dealersHand, Result result) {
		// TODO Auto-generated method stub
		
	}



	public String id() {

		return "Annie Lu Basic";
	}

	public double bet(double minBet, double maxBet) {

		return minBet;
	}

	public PlayerAction act(List<Card> ownHand, Card dealerUpCard,
			List<PlayerAction> allowedActions) {
		
		String result = "h";

		int ownSum = HandUtilities.value(ownHand);
	
		int column=dealerUpCard.value().numericValue() - 2;
		if (dealerUpCard.value().toString().equals("A"))
			column = 9;
		
		if (allowedActions.contains(PlayerAction.SPLIT)
				&& ownSum != 10
						&& ownSum != 20) {
			if (ownHand.get(0).value().toString().equals("A"))
				result = splits[7][column];
			else if (ownHand.get(0).value().numericValue() < 5)
				result = splits[ownHand.get(0).value().numericValue() - 2][column];
			else
				result = splits[ownHand.get(0).value().numericValue() - 3][column];
		} else if (HandUtilities.soft(ownHand)) {
			if (ownSum < 19)
				result = soft[ownSum - 13][column];
			else
				result = soft[6][column];
		} else {
			if (ownSum <= 8)
				result = hard[0][column];
			else if (9 <= ownSum && ownSum <= 16)
				result = hard[ownSum - 8][column];
			else
				result = hard[9][column];
		}

		if (allowedActions.contains(PlayerAction.DOUBLE) && (result.equals("dh") || result.equals("ds"))) {
			return PlayerAction.DOUBLE;
		} else if (result.equals("dh")){
			return PlayerAction.HIT;					
		}
		else if (result.equals("ds"))
			return PlayerAction.STAND;
		
		if (allowedActions.contains(PlayerAction.SURRENDER) && result.equals("rh")) {
			return PlayerAction.SURRENDER;
		} else if (result.equals("rh")) {
			return PlayerAction.HIT;
		}
		
		if (result.equals("h")) {
			return PlayerAction.HIT;
		} else if (result.equals("s")) {
			return PlayerAction.STAND;
		} else { // if (result.equals("p") || result.equals("ph")) {
			return PlayerAction.SPLIT;
		}
 
	}


	@Override
	public boolean insureHand(List<Card> ownHand, Card dealerUpCard) {
		// TODO Auto-generated method stub
		return false;
	}

}
