package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Deck.Card;
import Deck.DoubleDeck;
import pile.ThievesHomecell;
import pile.ThievesStock;
import pile.ThievesTableau;
import pile.ThievesWaste;

public class ThievesTableauTest {

	/*
	 * Tableau piles in Forty Thieves initially hold 3 cards [2 points]
	 */
	
	@Test
	public void testInitialFortyTP() {
		DoubleDeck d = new DoubleDeck();
		ThievesTableau tp = new ThievesTableau();
		tp.initialSetup(d, tp);
		assertEquals(3,tp.getSize());
		assertEquals(101,d.getSize());
		// not sure how to do this one please check?!!!!!
	//	assertEquals(12,tp.topCard().getRank()); 
	}
	
	
	/*
	 * Forty Thieves tableau pile method correctly determines if adding a 
	 * specific card is legal or illegal. [4 points]
	 */
	
	@Test
	public void testAddTP() {
		DoubleDeck d = new DoubleDeck();
		ThievesTableau tp = new ThievesTableau();
		tp.initialSetup(d, tp);
		assertEquals(101,d.getSize());
		String s = tp.topCard().getSuit();
		Card aceOfString = new Card(1, s);
		Card twoOfString = new Card(2, s);
		assertFalse(tp.add(aceOfString));
		assertTrue(tp.add(twoOfString));
	}
	
	
	/*
	 * Forty Thieves tableau pile method correctly determines if removing a 
	 * specific card is legal or illegal. [4 points]
	 */
	
	@Test
	public void testFortyThievesStockRemove() {
		ThievesTableau g = new ThievesTableau();
		// not calling initialSetup for testing purposes
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		g.getSPile().push(aceOfSpades);
		g.getSPile().push(twoOfDiamonds);
		assertTrue(g.remove());
		assertTrue(g.remove());
		assertFalse(g.remove());
	}
	
	/*
	 * Adding a card to Forty Thieves tableau pile increases its number of cards and 
	 * results in that card being the tableau pile's new top card [4 points]
	 */
	
	@Test
	public void testaddingCard() {
		DoubleDeck d = new DoubleDeck();
		ThievesTableau hc = new ThievesTableau();
		hc.initialSetup(d, hc);
		String cardsSuit = hc.topCard().getSuit();
		Card twoRank = new Card(2, cardsSuit);
		 hc.add(twoRank);
		assertEquals(3,hc.getSize());
		//assertEquals(true, hc.add(twoRank));
		assertEquals(twoRank,hc.topCard());
	}
	
	/*
	 * Removing a card from Forty Thieves tableau pile decreases its number of cards
	 *  and results in following card being the new top card [4 points]
	 */
	
	@Test 
	public void testRemovingCard() {
		DoubleDeck d = new DoubleDeck();
		ThievesTableau p = new ThievesTableau();
		Card c = new Card(1,"Diamond");
		Card c2 = new Card(2,"Diamond");
		p.getSPile().push(c);
		p.getSPile().push(c2);
		assertEquals(2,p.getSize());
		assertEquals(c2,p.topCard());
		p.remove();
		assertEquals(1,p.getSize());
		assertEquals(c,p.topCard());
		p.remove();
		assertEquals(0,p.getSize());
	}
}
