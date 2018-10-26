package pile;

import Deck.Card;
import Deck.Deck;

/**
 *   Class will define behavior of each Tableau pile in golf game
 * @author tamaghan , dandrijje, fmdestin, tbjackso
 * @version 1.0 
 *
 */

public class GolfTP extends Pile{
	
	/**
	 * field tells whether initial setup has been called
	 */
	private boolean is;

	/**
	 * creates pile with 5 cards
	 */
	@Override
	public void initialSetup(Deck d, Pile p) {
		is=true;
		for(int i=0; i<5; i++) {
			p.addForTesting(i, d.getCardDeck()[d.getDeckSize()-1]);
			d.setDeckSize(d.getDeckSize()-1);
			d.getCardDeck()[d.getDeckSize()]=null;
		}
	}
	/**
	 * once initial setup is complete, cards may not be added
	 */
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
	/**
	 * top card is removed from selected pile
	 */
	@Override
	public boolean remove() {
		if(size()==0) {
			return false;
		}
		this.getPile()[size()-1]=null;
		this.setSize(size()-1);
		return true;
	}

	
	
}
