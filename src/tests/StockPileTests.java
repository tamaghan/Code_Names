package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Deck.Card;
import Deck.Deck;
import Games.GolfGame;
import pile.GolfTP;
import pile.Stock;

public class StockPileTests {
	/*
	 *Golf stock initially holds 17 cards 
	 */
	@Test
	public void testInitialStock() {
//		Stock g = new Stock();
//		Deck d = new Deck();
//		Card[] c = d.getCardDeck();
//		g.initialSetup(d, c);
//		assertEquals(g.size(), 17);
		GolfGame gg = new GolfGame();
		assertEquals(gg.getStock().size(), 17);
	}
	
	/*
	*Forty Thieves initially holds 54 cards
	*/
	@Test
	public void fortyThievesInitialStock() {
		ThievesGame tg = new ThievesGame();
		assertEquals(tg.getStock().size(), 57);
	}
	
	
	/*
	 * Golf stock pile correctly returns if adding a specific card 
	 * is legal or illegal 
	 * (e.g., the method should always return false).
	 */
	@Test
	public void testAddStock() {
		Stock g = new Stock();
		Deck d = new Deck();
		Card[] c = d.getCardDeck();
		g.initialSetup(d, g);
		Card aceOfSpades = new Card(1, "Spade");
		Card eightOfHearts = new Card(8, "Heart");
		Card kingOfClubs = new Card(13, "Club");
		assertFalse(g.add(aceOfSpades));
		assertFalse(g.add(eightOfHearts));
		assertFalse(g.add(kingOfClubs));
	}

	
	/*
	 * Golf stock pile correctly returns if removing top 
	 * card is legal or illegal (e.g., if the stock pile is NOT empty)
	 */
	@Test
	public void testStockRemove() {
		Stock g = new Stock();
		// not calling initialSetup for testing purposes
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		g.addForTesting(0, aceOfSpades);
		g.addForTesting(0, aceOfSpades);
		assertTrue(g.remove());
		assertTrue(g.remove());
		assertFalse(g.remove());
	}
	
	
	/*
	 * Forty Thieves stock pile correctly returns if removing top 
	 * card is legal or illegal (e.g., if the stock pile is NOT empty)
	 */
	@Test
	public void testFortyThievesStockRemove() {
		Stock g = new Stock();
		// not calling initialSetup for testing purposes
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		g.addForTesting(0, aceOfSpades);
		g.addForTesting(0, aceOfSpades);
		assertTrue(g.remove());
		assertTrue(g.remove());
		assertFalse(g.remove());
	}
	/*
	 * Removing card from Golf's stock 
	 * pile decreases its number of cards 
	 * and results in following card being 
	 * the new top card
	 */
	@Test
	public void testStockDec() {
		Stock g = new Stock();
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		Card threeOfSpades = new Card(3, "Spade");
//		Deck d = new Deck();
//		Card[] c = d.cardDeck;
//		g.initialSetup(c);
		g.addForTesting(0, aceOfSpades);
		g.addForTesting(1, twoOfDiamonds);
		g.addForTesting(2, threeOfSpades);
		int sz1 = g.size();
		g.remove();
		int sz2 = g.size();
		assertEquals(sz2, sz1-1);
		assertEquals(twoOfDiamonds, g.getPile()[sz2-1]);
	}
	
}
