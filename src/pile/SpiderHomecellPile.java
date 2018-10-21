package pile;

import Deck.Card;
import Deck.Deck;

/**
 *  Class will define behavior of each home cell this.getPile() in little spider game
 * @author tamaghan , dandrijje, fmdestin, 
 * @version 1.0 
 *
 */

public class SpiderHomecellPile extends Pile {
	private boolean is;
	private int hpCount;
	
	
	public void initialSetup(Deck d, Card[] c) {
		is=true;
		if(hpCount==0) {
			c[0]=d.getCardDeck()[26];
			d.getCardDeck()[26]=d.getCardDeck()[d.getDeckSize()-1];
			d.getCardDeck()[d.getDeckSize()-1]=null; 
			d.setDeckSize(d.getDeckSize()-1);
			this.setSize(this.size()+1);
			hpCount+=1;
		}else if(hpCount==1) {
			c[0]=d.getCardDeck()[13];
			d.getCardDeck()[13]=d.getCardDeck()[d.getDeckSize()-1];
			d.getCardDeck()[d.getDeckSize()-1]=null; 
			d.setDeckSize(d.getDeckSize()-1);
			hpCount+=1;
		}else if(hpCount==2) {
			c[0]=d.getCardDeck()[12];
			d.getCardDeck()[12]=d.getCardDeck()[d.getDeckSize()-1];
			d.getCardDeck()[d.getDeckSize()-1]=null; 
			d.setDeckSize(d.getDeckSize()-1);
			hpCount+=1;
		}else if(hpCount==3) {
			c[0]=d.getCardDeck()[26];
			d.getCardDeck()[26]=d.getCardDeck()[d.getDeckSize()-1];
			d.getCardDeck()[d.getDeckSize()-1]=null; 
			d.setDeckSize(d.getDeckSize()-1);
			hpCount+=1;
		}
	}
	
//	public void initialSetup(Deck d,Card[] c) {
//		is=true;
//		if(d.getDeckSize()==52) {
//			this.getPile()[0]= new Card(1,"Diamonds");
//			this.setSize(this.size()+1);
//			d.setDeckSize(d.getDeckSize()-1);
//		}else if(d.getDeckSize()==51) {
//			this.getPile()[0]= new Card(1,"Hearts");
//			this.setSize(this.size()+1);
//			d.setDeckSize(d.getDeckSize()-1);
//		}else if(d.getDeckSize()==50) {
//			this.getPile()[0]= new Card(13,"Clubs");
//			this.setSize(this.size()+1);
//			d.setDeckSize(d.getDeckSize()-1);
//		}else if(d.getDeckSize()==49) {
//			this.getPile()[0]= new Card(13,"Spades");
//			this.setSize(this.size()+1);
//			d.setDeckSize(d.getDeckSize()-1);
//		} 
//		for(int i=0; i<d.getDeckSize(); i++) {
//			if(c[i]==this.getPile()[0]) {
//				
//			}
//		}
//	
//	}
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

	public boolean remove() {
		if(this.size()>=2) {
			this.getPile()[size()-1]=null;
			this.setSize(size()-1);
			return true;
		}else return false;
	}
	
}
