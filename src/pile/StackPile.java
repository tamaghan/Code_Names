package pile;

import java.util.Stack;

import Deck.Card;
import Deck.Deck;
import Deck.DoubleDeck;

public abstract class StackPile extends Pile{
	/**
	 * Stack to be used like the backing store for each pile
	 */
	private Stack<Card> pile;
	/**
	 * int to represent the size of the stack
	 */
	
	private int size;

	/**
	 * constructor sets up initial stack
	 */
	public StackPile() {
		pile = new Stack<>();
	}
	/**
	 * 
	 * @return the pile
	 */
	public Stack<Card> getSPile() {
		return pile;
	}

	public int getSize() {
		return pile.size();
	}
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
	 * setup method takes a deck and a pile
	 * to be defined by subclasses
	 * @param d
	 * @param p
	 */
	public abstract void initialSetup(DoubleDeck d, StackPile p);
	/**
	 * 
	 * @return the card on top of the pile
	 */
	public Card topCard() {
		if(pile.size()>0){
			return pile.peek();
		}
		else {
			Card empty = new Card(-1, "empty");
			empty.setGifFile("/PictureFolder/green.gif");
			return empty;
		}
	}
}