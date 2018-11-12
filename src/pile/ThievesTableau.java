package pile;

import Deck.Card;
import Deck.Deck;
import Deck.DoubleDeck;

public class ThievesTableau extends StackPile{

	@Override
	public void initialSetup(DoubleDeck d, StackPile p) {
		for(int i=0; i<3; i++) {
			p.getSPile().push(d.getdDeck().remove(d.getSize()-1));
		}
	}

	@Override
	public boolean add(Card c) {
		boolean returnVal = false;
		if(this.getSize()>0&&this.topCard().getSuit()==c.getSuit()&&this.topCard().getRank()==c.getRank()+1) {
			this.getSPile().push(c);
			returnVal=true;
		}
		return returnVal;
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
	void initialSetup(Deck d, Pile p) {
		// TODO Auto-generated method stub
		
	}

}
