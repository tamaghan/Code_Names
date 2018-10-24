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
	/**
	 * Creates an array of Card objects
	 */
	private Card[] cardDeck;
	private int deckSize;

	/**
	 *  Constructs a deck of 52 cards, each with a unique combination of suit, 
	 *  rank, and gif file name
	 */
	public Deck() {
		/**
		 *  Creates 52 card, index 0 to index 51
		 */
		this.cardDeck = new Card[52];
		this.deckSize=52;
		
		/**
		 *  Creates 'club' suit (Black)
		 */
		for (int i = 0; i<13; i++) {
			int j=i+1;
			cardDeck[i] = new Card(1+i,"Clubs");
			if(i==0) {
				cardDeck[i].setGifFile("/PictureFolder/ac.gif");
			}else if(0<i&&i<10) {
				cardDeck[i].setGifFile("/PictureFolder/"+j+"c.gif");
			}else if(i==10) {
				cardDeck[i].setGifFile("/PictureFolder/jc.gif");
			}else if(i==11) {
				cardDeck[i].setGifFile("/PictureFolder/qc.gif");
			}
			else if(i==12) {
				cardDeck[i].setGifFile("/PictureFolder/kc.gif");
			}
			
		}
		
		/**
		 *  Creates 'Diamonds' suit (Red)
		 */
		for (int i = 13; i<26; i++) {
			int j=i-12;
			cardDeck[i] = new Card(i-12,"Diamonds");
			if(i==13) {
				cardDeck[i].setGifFile("/PictureFolder/ad.gif");
			}else if(13<i&&i<23) {
				cardDeck[i].setGifFile("/PictureFolder/"+j+"d.gif");
			}else if(i==23) {
				cardDeck[i].setGifFile("/PictureFolder/jd.gif");
			}else if(i==24) {
				cardDeck[i].setGifFile("/PictureFolder/qd.gif");
			}
			else if(i==25) {
				cardDeck[i].setGifFile("/PictureFolder/kd.gif");
			}
		}
		
		/**
		 *  Creates 'Hearts' suit (Red)
		 */
		for (int i = 26; i<39; i++) {
			int j=i-25;
			cardDeck[i] = new Card(i-25,"Hearts");
			if(i==26) {
				cardDeck[i].setGifFile("/PictureFolder/ah.gif");
			}else if(26<i&&i<36) {
				cardDeck[i].setGifFile("/PictureFolder/"+j+"h.gif");
			}else if(i==36) {
				cardDeck[i].setGifFile("/PictureFolder/jh.gif");
			}else if(i==37) {
				cardDeck[i].setGifFile("/PictureFolder/qh.gif");
			}
			else if(i==38) {
				cardDeck[i].setGifFile("/PictureFolder/kh.gif");
			}
			j++;
		}
		
		/**
		 *  Creates 'Spades' suit (Black)
		 */
		for (int i = 39; i<52; i++) {
			int j=i-38;
			cardDeck[i] = new Card(i-38,"Spades");
			if(i==39) {
				cardDeck[i].setGifFile("/PictureFolder/as.gif");
			}else if(39<i&&i<49) {
				cardDeck[i].setGifFile("/PictureFolder/"+j+"s.gif");
			}else if(i==49) {
				cardDeck[i].setGifFile("/PictureFolder/js.gif");
			}else if(i==50) {
				cardDeck[i].setGifFile("/PictureFolder/qs.gif");
			}
			else if(i==51) {
				cardDeck[i].setGifFile("/PictureFolder/ks.gif");
			}
			j++;
		}
	}

	/**
	 * Returns the deck
	 * @return cardDeck
	 */
	public Card[] getCardDeck() {
		return cardDeck;
	}
	public int getDeckSize() {
		return this.deckSize;
	}
	public void setDeckSize(int size) {
		this.deckSize=size;
	}
	
	/**
	 * Sets a card deck
	 * @param cardDeck
	 */
	public void setCardDeck(Card[] cardDeck) {
		this.cardDeck = cardDeck;
	}
	
	/**
	 * 
	 * @return
	 * returns the cardDeck, but cut at a random point 
	 */
	public Card[] cutDeck() {
		int dSize = this.getDeckSize();
		int halfD = dSize/2;
		
		int cut = 13+ (int)(Math.random()*(halfD-1));
		int cut2 = dSize-cut;
		
		Card[] firstHalf = new Card[cut];
		Card[] secondHalf = new Card[cut2];
		for(int i=0; i<cut; i++) {
			firstHalf[i]=this.getCardDeck()[i];
			this.getCardDeck()[i]=null;
		}
		for(int i=0; i<cut2; i++) {
			secondHalf[i]=this.getCardDeck()[i+cut];
			this.getCardDeck()[i+cut]=null;
		}
		for(int i=0; i<cut2; i++) {
			this.getCardDeck()[i]=secondHalf[i];
		}
		for(int i=0; i<cut; i++) {
			this.getCardDeck()[i+cut2]=firstHalf[i];
		}
		
		return this.cardDeck;
	}
	/**
	 * 
	 * @returns the cardDeck, completely shuffled
	 */
	public Card[] shuffle() {
		int j = 0;
		int deckSize = this.getDeckSize();
		int halfDeck = deckSize/2;
		Card[] firstHalf = new Card[halfDeck];
		Card[] secondHalf = new Card[halfDeck];
		this.setCardDeck(this.cutDeck());
		for(int i=0; i<halfDeck; i++) {
			firstHalf[i]=this.getCardDeck()[i];
			this.getCardDeck()[i]=null;
		}
		for(int i=0; i<halfDeck; i++) {
			secondHalf[i]=this.getCardDeck()[i+halfDeck];
			this.getCardDeck()[i+halfDeck]=null;
		}
		for(int i=0; i<deckSize; i+=2) {
			this.getCardDeck()[i]=secondHalf[j];
			this.getCardDeck()[i+1]=firstHalf[j];
			j++;
		}
		return secondHalf;
		
	}


}



