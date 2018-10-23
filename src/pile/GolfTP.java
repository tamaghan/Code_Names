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

	
	@Override
	public void initialSetup(Deck d, Pile p) {
		is=true;
		for(int i=0; i<5; i++) {
			p.addForTesting(i, d.getCardDeck()[d.getDeckSize()-1]);
			d.setDeckSize(d.getDeckSize()-1);
			d.getCardDeck()[d.getDeckSize()]=null;
		}
	}
//	@Override
//	public void initialSetup(Deck d, Pile p) {
//		is=true;
//		for(int i=0; i<5; i++) {
//			p.getPile()[i]=d.getCardDeck()[d.getDeckSize()-1];
//			d.setDeckSize(d.getDeckSize()-1);
//			d.getCardDeck()[d.getDeckSize()]=null;
//			p.setSize(p.size()+1);
//		}
//	}


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

	
	
}
