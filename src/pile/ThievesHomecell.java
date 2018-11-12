package pile;

import Deck.Card;
import Deck.Deck;
import Deck.DoubleDeck;

public class ThievesHomecell extends StackPile{
	
	/**
	 * keeps track of number of homecell piles set up
	 */
	private int hpCount;
	/**
	 * constructor makes new pile instance
	 */
	
	
	/**
	 * uses one instance of a homecell pile with 8 separate pile params
	 * each pile gets an ace
	 */
	@Override
	public void initialSetup(DoubleDeck d, StackPile p) {
		if(hpCount==0) {
			p.getSPile().push(d.getdDeck().remove(0));
			hpCount+=1;
		}else if(hpCount==1) {
			p.getSPile().push(d.getdDeck().remove(25));
			hpCount+=1;
		}
		else if(hpCount==2) {
			p.getSPile().push(d.getdDeck().remove(50));
			hpCount+=1;
		}
		else if(hpCount==3) {
			p.getSPile().push(d.getdDeck().remove(75));
			hpCount+=1;
		}
		else if(hpCount==4) {
			p.getSPile().push(d.getdDeck().remove(0));
			hpCount+=1;
		}
		else if(hpCount==5) {
			p.getSPile().push(d.getdDeck().remove(24));
			hpCount+=1;
		}
		else if(hpCount==6) {
			p.getSPile().push(d.getdDeck().remove(48));
			hpCount+=1;
		}else if(hpCount==7) {
			p.getSPile().push(d.getdDeck().remove(72));
			hpCount+=1;
		}
		
	}

	@Override
	public boolean add(Card c) {
		boolean returnVal = false;
		if(this.topCard().getSuit()==c.getSuit()&&this.topCard().getRank()==c.getRank()-1) {
			this.getSPile().push(c);
			returnVal=true;
		}
		return returnVal;
	}

	@Override
	public boolean remove() {
		return false;
	}

	@Override
	void initialSetup(Deck d, Pile p) {
		// TODO Auto-generated method stub
		
	}

}
