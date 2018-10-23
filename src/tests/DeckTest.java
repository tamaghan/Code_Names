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
	
	@Test
	public void testShuffle() {
		Deck deck = new Deck();
		deck.shuffle();
		assertEquals(52,deck.getDeckSize());
		assertEquals(2,deck.getCardDeck()[1].getRank());
	}
	
	@Test 
	public void testCut() {
		Deck deck = new Deck();
		int cut = 13+ (int)(Math.random()*25);
		int cut2 = 52-cut;
		Card[] firstHalf = new Card[cut];
		for(int i=0; i<cut; i++) {
			firstHalf[i]=deck.getCardDeck()[i];
			deck.getCardDeck()[i]=null;
		}
		Card[] secondHalf = new Card[cut2];
		for(int i=cut; i<52; i++) {
			int j = 0;
			secondHalf[j+=1]=deck.getCardDeck()[i];
			deck.getCardDeck()[i]=null;
		}
		assertEquals(cut,firstHalf.length); 
		assertEquals(cut2,secondHalf.length);
		assertEquals(2,firstHalf[1].getRank());
		//assertEquals(2,firstHalf[cut-1].getRank());
		
		assertEquals(2,secondHalf[cut2-1].getRank());
		//assertEquals(2,secondHalf[1].getRank());

		//assertEquals(cut, cut2);
		//assertEquals(cut,deck.cutDeck());
	}
	
}
