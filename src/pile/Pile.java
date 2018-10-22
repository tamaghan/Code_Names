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
	private Card[] pile;
	private int size;
	public Pile() {
		pile=new Card[52];
	}
	
	public void setSize(int size) {
		this.size=size;
	}
	
	
	abstract void initialSetup(Deck d, Card[] c);
	public abstract boolean add(Card c);
	public abstract boolean remove();

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

	}
	public void addForTesting(int i, Card c) {
		pile[i]=c;
		size=size+1;
	}

}
