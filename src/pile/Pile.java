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
	
	/**
	 * creates a field for an array of cards
	 * creates a field for the size of the pile
	 */
	private Card[] pile;
	private int size;
	
	/**
	 * constructor makes a new pile array with length 52
	 */
	public Pile() {
		pile=new Card[52];
	}
	/**
	 * 
	 * @param size
	 * 
	 * setter for size field
	 */
	public void setSize(int size) {
		this.size=size;
	}
	
	/**
	 * setup method takes a deck and a pile
	 * to be defined by subclasses
	 * @param d
	 * @param p
	 */
	abstract void initialSetup(Deck d, Pile p);
	
	/**
	 * 
	 * @param c
	 * @return if adding card is leagal/true or illegal/false
	 */
	public abstract boolean add(Card c);
	
	/**
	 * @return if removing top card is leagal/true or illegal/false
	 */
	public abstract boolean remove();
	/**
	 * 
	 * @return the top card of the pile
	 */
	public Card topCard() {
		return pile[this.size()-1];
	}
	
	/**
	 * getter for pile
	 * @return
	 */
	public Card[] getPile() {
		return pile;
	}
	/**
	 * setter for pile
	 * @param pile
	 */
	public void setPile(Card[] pile) {
		this.pile = pile;
	}
	/**
	 * getter for size
	 * @return
	 */
	public int size() {
		return size;

	}
	/**
	 * adds card for testing purposes only
	 * @param i
	 * @param c
	 */
	public void addForTesting(int i, Card c) {
		pile[i]=c;
		size=size+1;
	}

}
