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

//	public GolfHomecellPile() {
//		pile = new Card[52];
//	}
	private boolean is;

	public void initialSetup(Deck d, Card[] c) {
		is=true;
	}
	//	public Card topCard() {
	//		return super.topCard();
	//	}

	public boolean add(Card c) {
		boolean returnVal=false; 
		if(this.topCard().getRank()==c.getRank()+1||this.topCard().getRank()==c.getRank()-1) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}else if(this.topCard().getRank()==13&&c.getRank()==1) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}else if(this.topCard().getRank()==1&&c.getRank()==13) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}
		return returnVal;
	}

	public boolean remove() {
		return false;
	}

}
