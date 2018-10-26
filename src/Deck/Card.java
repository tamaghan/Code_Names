package Deck;
/**
 * Defines Card class. Each Card instance has unique combination of suit & rank
 * @author  tamaghan , dandrijje, fmdestin, tbjackso
 *
 */
public class Card {
	/**
	 *  Creates an int field to represent the cards' ranks 
	 *  and 2 String fields: first for each card's suit, 
	 *  and the other is to access the gif file for each card
	 */
	private int rank;
	private String suit;
	private String gifFile;
	
	/**
	 *  Constructor for this class, two params rank, suit.
	 * @param rank
	 * @param suit
	 */
	public Card (int rank, String suit) {
		// Sets the instances equal to params
		this.rank = rank;
		this.suit = suit;
	}
	
	/**
	 *  Sets rank
	 * @param rank
	 */
	public void setRank(int rank) {
		this.rank=rank;
	}
	
	/**
	 *  Sets suit
	 * @param suit
	 */
	public void setSuit(String suit) {
		this.suit=suit;
	}
	
	/**
	 *  Returns the card's rank
	 * @return
	 */
	public int getRank() {
		return this.rank;
	}
	
	/**
	 *  Returns the card's suit
	 * @return
	 */
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
	/**
	 * 
	 * @return the gif file for a specific card instance
	 */
	public String getGifFile() {
		return gifFile;
	}
	/**
	 * Sets the gif file name for each individual card instance
	 * @param gifFile
	 */
	public void setGifFile(String gifFile) {
		this.gifFile = gifFile;
	}
}
