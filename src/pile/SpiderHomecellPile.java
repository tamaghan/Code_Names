package pile;

import Deck.Card;
import Deck.Deck;

/**
 *  Class will define behavior of each home cell this.getPile() in little spider game
 * @author tamaghan , dandrijje, fmdestin, tbjackso
 * @version 1.0 
 *
 */

public class SpiderHomecellPile extends Pile {
	
	/**
	 * field tells whether initial setup has been called
	 * 
	 * hpCount keeps track of number of homecell piles made 
	 * for Spider Game
	 */
	private boolean is;
	private int hpCount;
	
	/**
	 * uses one instance of a homecell pile with 4 pile params,
	 * first pile adds 
	 */
	public void initialSetup(Deck d, Pile p) {
		is=true;
		p.setSize(0);
		is=true;
		if(hpCount==0) {
			p.getPile()[0]=d.getCardDeck()[26];
			d.getCardDeck()[26]=d.getCardDeck()[d.getDeckSize()-1];
			d.getCardDeck()[d.getDeckSize()-1]=null; 
			d.setDeckSize(d.getDeckSize()-1);
			p.setSize(p.size()+1);
			hpCount+=1;
		}else if(hpCount==1) {
			p.getPile()[0]=d.getCardDeck()[13];
			d.getCardDeck()[13]=d.getCardDeck()[d.getDeckSize()-1];
			d.getCardDeck()[d.getDeckSize()-1]=null; 
			d.setDeckSize(d.getDeckSize()-1);
			p.setSize(p.size()+1);
			hpCount+=1;
		}else if(hpCount==2) {
			p.getPile()[0]=d.getCardDeck()[12];
			d.getCardDeck()[12]=d.getCardDeck()[d.getDeckSize()-1];
			d.getCardDeck()[d.getDeckSize()-1]=null; 
			d.setDeckSize(d.getDeckSize()-1);
			p.setSize(p.size()+1);
			hpCount+=1;
		}else if(hpCount==3) {
			p.getPile()[0]=d.getCardDeck()[26];
			d.getCardDeck()[26]=d.getCardDeck()[d.getDeckSize()-1];
			d.getCardDeck()[d.getDeckSize()-1]=null; 
			d.setDeckSize(d.getDeckSize()-1);
			p.setSize(p.size()+1);
			hpCount+=1;
		}
	}	
	/**
	 * adds card to pile if the suits match and the card is either one above for hearts and diamonds or one below for clubs and spades 
	 */
	public boolean add(Card c) {
		boolean returnVal = false;
		if(this.topCard().getSuit()=="Hearts"&&c.getSuit()=="Hearts"&&this.topCard().getRank()==c.getRank()-1) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}else if(this.topCard().getSuit()=="Diamonds"&&c.getSuit()=="Diamonds"&&this.topCard().getRank()==c.getRank()-1) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}else if(this.topCard().getSuit()=="Clubs"&&c.getSuit()=="Clubs"&&this.topCard().getRank()==c.getRank()+1) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}else if(this.topCard().getSuit()=="Spades"&&c.getSuit()=="Spades"&&this.topCard().getRank()==c.getRank()+1) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}
		
		return returnVal;
	}
	/**
	 * removes top card if the pile contains more than one card. 
	 */
	public boolean remove() {
		if(this.size()>=2) {
			this.getPile()[size()-1]=null;
			this.setSize(size()-1);
			return true;
		}else return false;
	}
	
}
