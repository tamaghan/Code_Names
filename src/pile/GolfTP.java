package pile;

import Deck.Card;
import Deck.Deck;

/**
 *   Class will define behavior of each Tableau pile in golf game
 * @author tamaghan , dandrijje, fmdestin, 
 * @version 1.0 
 *
 */

public class GolfTP extends Pile{
	

	private boolean is;
//	public GolfTP() {
//		pile = new Card[52];
//	}
	
	@Override
	public void initialSetup(Deck d, Card[] c) {
		is=true;
		int size = d.deckSize;
		for(int i = 0; i<5; i++) {
			this.pile[i]=c[size-1-i];
			this.size=this.size+1;
			d.deckSize=d.deckSize-1;
		}
	}

	@Override
	public boolean add(Card c) {
		boolean returnVal = false;
		if(!is) {
			pile[size()]=c;
			size=size+1;
			return true;
		}
		return returnVal;
	}

	@Override
	public boolean remove() {
		if(size()==0) {
			return false;
		}
		pile[size()-1]=null;
		size=size-1;
		return true;
	}
	public Card topCard() {
		return super.topCard();
	}
	
	
}
