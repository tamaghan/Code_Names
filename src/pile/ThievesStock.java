package pile;

import Deck.Card;
import Deck.Deck;
import Deck.DoubleDeck;

public class ThievesStock extends StackPile{

	@Override
	public boolean add(Card c) {
		return false;
	}

	@Override
	public boolean remove() {
		if(this.getSize()==0) {
			return false;
		}
		this.getSPile().pop();
		return true;
	}

	@Override
	public void initialSetup(DoubleDeck d, StackPile p) {
		while(d.getSize()>0) {
			p.getSPile().push(d.getdDeck().remove(0));
		}
	}

	@Override
	void initialSetup(Deck d, Pile p) {
		// TODO Auto-generated method stub
		
	}

}
