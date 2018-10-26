package pile;

import Deck.Card;
import Deck.Deck;

/**
 * The stock this.getPile() contains the 
 * cards that have not been dealt. Each game has its own 
 * rules for how cards are dealt from the stock this.getPile().
 * @author tamaghan , dandrijje, fmdestin, tbjackso
 *
 */

public class Stock extends Pile{

	/**
	 * field tells whether initial setup has been called
	 */
	private boolean is;
	
	public void initialSetup(Deck d, Pile p) {
		is=true;
		int deckSize = d.getDeckSize();
		for(int i=0; i< deckSize; i++) {
			p.getPile()[i]=d.getCardDeck()[i];
			p.setSize(p.size()+1);
		}
	}
	/**
	 * always illegal to add cards after setup
	 */
	@Override
	public boolean add(Card c) {
		boolean returnVal = false;
		return returnVal;
	}
	/**
	 * unless the pile is empty, can always remove card 
	 * from stock pile
	 * 
	 * (card should be added to the homecell pile)
	 */
	@Override
	public boolean remove() {
		if(size()==0) {
			return false;
		}else
		this.getPile()[size()-1]=null;
		this.setSize(size()-1);
		return true;
	}	

}
