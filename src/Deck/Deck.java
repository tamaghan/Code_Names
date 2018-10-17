package Deck;


/**
 * Defines Deck class which creates 52 Card instances. Each Card instance has unique combination of suit & rank [6 points]
 * @author HP
 *
/** Defines Deck class which creates 52 Card instances. Each Card instance has unique combination of suit & rank [6 points]
 * .
 * @author tamaghan , dandrijje, fmdestin
 * 
 */

public class Deck { 
	// Creates an array of Card objects
	public Card[] cardDeck;
	public int deckSize;

	// Constructs a deck
	public Deck() {
		// Creates 52 card, index 0 to index 51
		this.cardDeck = new Card[52];
		this.deckSize=52;
		
		// Creates 'club' suit (Black)
		for (int i = 0; i<13; i++) {
			cardDeck[i] = new Card(1+i,"Clubs");
		}
		
		// Creates 'Diamonds' suit (Red)
		for (int i = 13; i<26; i++) {
			cardDeck[i] = new Card(i-12,"Diamonds");
		}
		
		// Creates 'Hearts' suit (Red)
		for (int i = 26; i<39; i++) {
			cardDeck[i] = new Card(i-25,"Hearts");
		}
		
		// Creates 'Spades' suit (Black)
		for (int i = 39; i<52; i++) {
			cardDeck[i] = new Card(i-38,"Spades");
		}
	}

	/**
	 * Returns the deck
	 * @return cardDeck
	 */
	public Card[] getCardDeck() {
		return cardDeck;
	}

	
	/**
	 * Sets a card deck
	 * @param cardDeck
	 */
	public void setCardDeck(Card[] cardDeck) {
		this.cardDeck = cardDeck;
	}
	public Card[] cutDeck() {
		Card[] firstHalf = new Card[26];
		Card[] secondHalf = new Card[26];
		int cut = 13+ (int)(Math.random()*25);
		for(int i=0; i<cut; i++) {
			firstHalf[i]=this.getCardDeck()[i];
			this.getCardDeck()[i]=null;
		}
		for(int i=0; i<cut; i++) {
			secondHalf[i]=this.getCardDeck()[i+26];
			this.getCardDeck()[i+26]=null;
		}
		for(int i=0; i<cut; i++) {
			this.getCardDeck()[i]=secondHalf[i];
		}
		for(int i=0; i<cut; i++) {
			this.getCardDeck()[i+cut]=firstHalf[i];
		}
		
		return this.cardDeck;
	}
	public void shuffle() {
		Card[] firstHalf = new Card[26];
		Card[] secondHalf = new Card[26];
		int halfDeck = 26;
		this.setCardDeck(this.cutDeck());
		for(int i=0; i<halfDeck; i++) {
			firstHalf[i]=this.getCardDeck()[i];
			this.getCardDeck()[i]=null;
		}
		for(int i=0; i<halfDeck; i++) {
			secondHalf[i]=this.getCardDeck()[i+26];
			this.getCardDeck()[i+26]=null;
		}
		for(int i=0; i<52; i+=2) {
			this.getCardDeck()[i]=secondHalf[i];
			this.getCardDeck()[i+1]=firstHalf[i];
			this.setCardDeck(this.cutDeck());
		}
		
	}
	

}



