package pile;

import Deck.Card;
import Deck.Deck;

/**
 *  Class will define behavior of each home cell pile in little spider game
 * @author tamaghan , dandrijje, fmdestin, 
 * @version 1.0 
 *
 */

public class SpiderHomecellPile extends Pile {
	private boolean is;

	
	public void initialSetup(Deck d,Card[] c) {
		is=true;
		
	}
	public boolean add(Card c) {
		boolean returnVal = false;
		if(this.topCard().getSuit()=="Hearts"&&c.getSuit()=="Hearts"&&this.topCard().getRank()==c.getRank()-1) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}else if(this.topCard().getSuit()=="Diamonds"&&c.getSuit()=="Diamonds"&&this.topCard().getRank()==c.getRank()-1) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}else if(this.topCard().getSuit()=="Clubs"&&c.getSuit()=="Clubs"&&this.topCard().getRank()==c.getRank()+1) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}else if(this.topCard().getSuit()=="Spades"&&c.getSuit()=="Spades"&&this.topCard().getRank()==c.getRank()+1) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}
		
		return returnVal;
	}

	public boolean remove() {
		if(this.size>=2) {
			pile[size()-1]=null;
			size=size-1;
			return true;
		}else return false;
	}
	public Card topCard() {
		return super.topCard();
	}
	
}
