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

	private boolean is;

	public void initialSetup(Deck d, Pile p) {
		is=true;
	}

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

	public boolean remove() {
		return false;
	}

}
