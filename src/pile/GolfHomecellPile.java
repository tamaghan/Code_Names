package pile;

import Deck.Card;
import Deck.Deck;
/**
 *  Class will define behavior of each home cell pile in little spider game
 * @author tamaghan , dandrijje, fmdestin, 
 * @version 1.0 
 *
 */

public class GolfHomecellPile extends Pile {
	
	/**
	 * field tells whether initial setup has been called
	 */
	private boolean is;
	
	/**
	 * pile starts out empty
	 */
	public void initialSetup(Deck d, Pile p) {
		is=true;
	}
	/**
	 * can add card if its rank is one above or one below 
	 * the new pile's topcard, rank also wraps around
	 */
	public boolean add(Card c) {
		boolean returnVal=false; 
		if(this.topCard().getRank()==c.getRank()+1||this.topCard().getRank()==c.getRank()-1) {
			this.getPile()[this.size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}else if(this.topCard().getRank()==13&&c.getRank()==1) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}else if(this.topCard().getRank()==1&&c.getRank()==13) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}
		return returnVal;
	}
	/**
	 * cards cannot be removed from the homecellpile in golf
	 */
	public boolean remove() {
		return false;
	}

}
