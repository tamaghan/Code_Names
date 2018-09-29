package pile;

import java.util.ArrayList;

import Deck.Card;
import Deck.Deck;

/**
 *  
 * @author tamaghan , dandrijje, fmdestin, 
 * @version 3.0 
 *
 */
public abstract class Pile {
	public Card[] pile;
	
	public Pile() {
		pile=new Card[52];
	}
	public int size;
	abstract void initialSetup(Deck d, Card[] c);
	abstract boolean add(Card c);
	abstract boolean remove();

	public Card topCard() {
		return pile[this.size()-1];
	}
	public Card[] getPile() {
		return pile;
	}
	public void setPile(Card[] pile) {
		this.pile = pile;
	}
	public int size() {
		return size;
		//		int returnVal=0;
		//		for(int i = 0; i<pile.length ; i++) {
		//			if(pile[i]!=null) {
		//				returnVal= returnVal+1;
		//			}
		//		}
		//		return returnVal;

	}
	public void addForTesting(int i, Card c) {
		pile[i]=c;
		size=size+1;
	}

}
