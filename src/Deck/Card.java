package Deck;

public class Card {
	private int rank;
	private String suit;
	
	public Card (int rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public void setRank() {
	}
	public void setSuit() {
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public String getSuit() {
		return this.suit;
	}
	
	public void testReturn() {
		System.out.println("My rank is " + rank + ". My suit is " + suit);
	}
}
