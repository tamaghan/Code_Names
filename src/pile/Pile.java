package pile;

import java.util.ArrayList;

import Deck.Card;
import Deck.Deck;

public abstract class Pile {
	private Card[] pile;
	abstract void initialSetup();
	abstract boolean add(Card c);
	abstract boolean remove();
	public Card[] getPile() {
		return pile;
	}
	public void setPile(Card[] pile) {
		this.pile = pile;
	}
	public int size() {
		int i = 0;
		ArrayList<Card> cards = new ArrayList<Card>();
		if(pile.length>1) {
			for(Card j : pile) {
				cards.add(j);
				i=i+1;
			}
		}
		return i;

	}

}
