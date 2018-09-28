package Deck;
/**
 * Defines Deck class which creates 52 Card instances. Each Card instance has unique combination of suit & rank
 * @author  tamaghan , dandrijje, fmdestin
 *
 */
public class Card {
	// Creates an int and string instance
	private int rank;
	private String suit;
	
	// Constructor for this class, two params rank, suit.
	public Card (int rank, String suit) {
		// Sets the instances equal to params
		this.rank = rank;
		this.suit = suit;
	}
	
	// Sets rank, empty
	public void setRank() {
	}
	
	// Sets suit, empty
	public void setSuit() {
	}
	
	// Returns the card's rank
	public int getRank() {
		return this.rank;
	}
	
	// Returns the card's suit
	public String getSuit() {
		return this.suit;
	}
	
	/**
	 *  Used for testing, ignore
	 *  
	 */
	
	public void testReturn() {
		System.out.println("My rank is " + rank + ". My suit is " + suit);
	}
}
