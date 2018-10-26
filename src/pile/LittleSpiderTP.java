package pile;

import Deck.Card;
import Deck.Deck;
/**
 *  Class will define behavior of each Tableau pile in little spider game
 * @author tamaghan , dandrijje, fmdestin, tbjackso
 * @version 1.0 
 *
 */

public class LittleSpiderTP extends Pile{
	
	/**
	 * field tells whether initial setup has been called
	 */
	private boolean is;
	
	/**
	 * creates tableau pile with 6 cards
	 */
	@Override
	public void initialSetup(Deck d, Pile p) {
		is=true;
		for(int i=0; i<6; i++) {
			p.getPile()[i]=d.getCardDeck()[d.getDeckSize()-1];
			d.setDeckSize(d.getDeckSize()-1);
			p.setSize(p.size()+1);
		}
		
	}
	/**
	 * method returns true if the rank of the card added is 
	 * either one above or one below the topcard
	 */
	@Override
	public boolean add(Card c) {
		boolean returnVal=false; 
		if(this.topCard().getRank()==c.getRank()+1||this.topCard().getRank()==c.getRank()-1) {
			this.getPile()[size()]=c;
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
	 * removes topcard if pile is not empty
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
