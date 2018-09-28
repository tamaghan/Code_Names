package pile;

import Deck.Card;

/**
 * The stock pile contains the 
 * cards that have not been dealt. Each game has its own 
 * rules for how cards are dealt from the stock pile.
 * @author tamaghan , dandrijje, fmdestin, 
 *
 */

public class Stock extends Pile{

	@Override
	public void initialSetup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(Card c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}
	public Card topCard() {
		return super.topCard();
	}
	

}
