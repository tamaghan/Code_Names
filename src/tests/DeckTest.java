package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Deck.Card;
import Deck.Deck;

public class DeckTest {

	@Test
	public void testRank() {
		Deck deck = new Deck();
		assertEquals(52,deck.getDeckSize());
		assertEquals(2,deck.getCardDeck()[1].getRank());
	}
	

	
}
