package Deck;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleDeck{
	/**
	 * Array list to be used like backing store for the double deck
	 */
	private static ArrayList<Card> dDeck;
	/**
	 * int field for size of the deck
	 */
	private int size;
	/**
	 * Constructor makes an arrayList which is the 
	 * combination of two decks
	 */
	public DoubleDeck() {
		Deck d1 = new Deck();
		Deck d2 = new Deck();
		dDeck= new ArrayList<>();
		for(int i=0; i<52; i++) {
			dDeck.add(d1.getCardDeck()[i]);
			dDeck.add(d2.getCardDeck()[i]);
		}
	}
	/**
	 * 
	 * @return the array list containing the two decks
	 */
	public ArrayList<Card> getdDeck() {
		return dDeck;
	}
	/**
	 * 
	 * @return size of the deck
	 */
	public int getSize() {
		return dDeck.size();
	}
	/**
	 * shuffles the double deck
	 */
	public void dDeckShuffle() {
		Collections.shuffle(dDeck);
	}
	
}
