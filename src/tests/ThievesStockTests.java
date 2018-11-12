package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Deck.Card;
import Games.ThievesGame;
import pile.ThievesStock;

public class ThievesStockTests {
	
	/**
	 *  Forty Thieves stock pile correctly returns if 
	 *  adding a specific card is legal or illegal 
	 *  (e.g., always illegal)
	 */
	@Test
	public void testThievesAdd() {
		ThievesStock ts = new ThievesStock();
		assertFalse(ts.add(new Card(1,"Diamonds")));
	}
	
	/**
	 * Dealing cards from Forty Thieves stock pile removes the 
	 * top card from the pile, results in the next card being 
	 * the new top card in the stock pile, and makes the removed 
	 * card the new top card on the waste pile
	 */
	@Test
	public void testThievesStockToWaste() {
		ThievesGame ftg = new ThievesGame();
		Card sc = ftg.getStock().topCard();
		ftg.stockRemove();
		Card sc1 = ftg.getStock().getSPile().peek();
		assertEquals(sc, ftg.getWaste().topCard());
		assertEquals(sc1, ftg.getStock().topCard());
		
	}
	/**
	*  Forty Thieves initially holds 57 cards
	*/
	@Test
	public void fortyThievesInitialStock() {
		ThievesGame tg = new ThievesGame();
		assertEquals(tg.getStock().getSize(), 57);
	}
	/**
	 * Forty Thieves stock pile correctly returns if removing top 
	 * card is legal or illegal (e.g., if the stock pile is NOT empty)
	 */
	@Test
	public void testFortyThievesStockRemove() {
		ThievesStock g = new ThievesStock();
		// not calling initialSetup for testing purposes
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		g.getSPile().push(aceOfSpades);
		g.getSPile().push(twoOfDiamonds);
		assertTrue(g.remove());
		assertTrue(g.remove());
		assertFalse(g.remove());
	}
}
