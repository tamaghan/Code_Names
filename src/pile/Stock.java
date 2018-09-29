package pile;

import Deck.Card;
import Deck.Deck;

/**
 * The stock pile contains the 
 * cards that have not been dealt. Each game has its own 
 * rules for how cards are dealt from the stock pile.
 * @author tamaghan , dandrijje, fmdestin, 
 *
 */

public class Stock extends Pile{

	
	private boolean is;
	
	@Override
	public void initialSetup(Deck d, Card[] c) {
		is=true;
		int size = d.deckSize;
		for(int i=0; i<17; i++) {
			this.pile[i]=c[i];
			this.size=this.size+1;
		}
		
	}

	@Override
	public boolean add(Card c) {
		boolean returnVal = false;
		return returnVal;
	}

	@Override
	public boolean remove() {
		if(size()==0) {
			return false;
		}else
		pile[size()-1]=null;
		size=size-1;
		return true;
	}
	public Card topCard() {
		return super.topCard();
	}
	

}
