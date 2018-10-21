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
		int size = d.getDeckSize();
		for(int i = 0; i<5; i++) {
			this.getPile()[i]=c[size-1-i];
			this.setSize(this.size()+1);
			d.setDeckSize(d.getDeckSize()-1);  
		}
	}

	@Override
	public boolean add(Card c) {
		boolean returnVal = false;
		if(!is) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			return true;
		}
		return returnVal;
	}

	@Override
	public boolean remove() {
		if(size()==0) {
			return false;
		}
		this.getPile()[size()-1]=null;
		this.setSize(size()-1);
		return true;
	}
	public Card topCard() {
		return super.topCard();
	}
	
	
}
