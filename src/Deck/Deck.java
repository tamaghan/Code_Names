package Deck;

public class Deck { 
    //Defines Deck class which creates 52 Card instances. 
	//Each Card instance has unique combination of suit & rank [6 points]
	
	public Deck() {
		// Creates 52 card, index 0 to index 51
		Card[] cardDeck = new Card[52];
		
		// Creates 'club' suit (Black)
		for (int i = 0; i<13; i++) {
			cardDeck[i] = new Card(1+i,"Club");
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
}



