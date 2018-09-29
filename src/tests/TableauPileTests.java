package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Deck.Card;
import Deck.Deck;
import pile.GolfTP;
import pile.LittleSpiderTP;

public class TableauPileTests {
	/*
	 * Tableau piles in Golf initially hold 5 cards
	 */
	@Test
	public void testInitialGolfTP() {
		//pile interface, implemented by GolfTP
		GolfTP g = new GolfTP();
		Deck d = new Deck();
		Card[] c = d.cardDeck;
		// g.initialSetUp(); adds 5 Cards from the Deck to the method
		g.initialSetup(c);
		assertEquals(g.size(), 5);
	}
	/*
	 * Tableau piles in Little Spider initially hold 6 cards
	 */
	@Test
	public void testInitialLSTP() {
		// pile interface, implemented by LittleSpiderTP
		LittleSpiderTP ls = new LittleSpiderTP();
		Deck d = new Deck();
		Card[] c = d.cardDeck;
		// ls.initialSetUp(); adds 6 Cards from the Deck to the method
		ls.initialSetup(c);
		assertEquals(ls.size(), 6);
	}
	/*
	 * Golf tableau pile correctly determines if adding a 
	 * specific card is legal or illegal (e.g., the method 
	 * should always return false)
	 */
	@Test
	public void testGolfTPAdd() {
		GolfTP g = new GolfTP();
		Deck d = new Deck();
		Card[] c = d.cardDeck;
//		Will have to be able to call add during initial setup, but not allow cards to be added afterward
		g.initialSetup(c);
		Card aceOfSpades = new Card(1, "Spades");
		Card eightOfHearts = new Card(8, "Hearts");
		Card kingOfClubs = new Card(13, "Clubs");
		assertFalse(g.add(aceOfSpades));
		assertFalse(g.add(eightOfHearts));
		assertFalse(g.add(kingOfClubs));
	}
	/*
	 * Little Spider tableau pile correctly 
	 * determines if adding a specific
	 * card is legal or illegal 
	 */
	@Test
	public void testLSTPAdd() {
		LittleSpiderTP ls = new LittleSpiderTP();
		LittleSpiderTP ls2 = new LittleSpiderTP();
		//not calling initialSetup for testing purposes. initialSetup will be called when pile is made in game class constructor.
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		Card eightOfHearts = new Card(8, "Hearts");
		Card kingOfClubs = new Card(13, "Clubs");
		ls.addForTesting(0, aceOfSpades);
		ls2.addForTesting(0, aceOfSpades);
		assertTrue(ls.add(kingOfClubs));
		assertTrue(ls2.add(twoOfDiamonds));
		assertFalse(ls.add(eightOfHearts));
	}
	/*
	 * Golf tableau pile correctly returns if 
	 * removing top card is legal or illegal
	 */
	@Test
	public void testGolfTPRemove() {
		GolfTP g = new GolfTP();
		// not calling initialSetup for testing purposes
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		g.add(aceOfSpades);
		g.add(twoOfDiamonds);
		assertTrue(g.remove());
		assertTrue(g.remove());
		assertFalse(g.remove());
	}
	/*
	 * Little Spider tableau pile correctly returns if 
	 * removing top card is legal or illegal 
	 * (e.g., if the tableau pile is NOT empty) 
	 */
	@Test
	public void testLSTPRemove() {
		LittleSpiderTP ls = new LittleSpiderTP();
		//not calling initial setup for testing 
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		ls.addForTesting(0, aceOfSpades);
		ls.addForTesting(1, twoOfDiamonds);
		assertTrue(ls.remove());
		assertTrue(ls.remove());
		assertFalse(ls.remove());
	}
	/*
	 * Adding card to Little Spider's tableau pile increases 
	 * its number of cards and results in that card being the 
	 * tableau pile's new top card
	 */
	@Test
	public void testNewLSTP() {
		LittleSpiderTP ls = new LittleSpiderTP();
		//not calling initialSetup for this test
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		ls.addForTesting(0, aceOfSpades);
		ls.addForTesting(1, twoOfDiamonds);
		int sz1 = ls.size();
		ls.add(threeOfSpades);
		int sz2 = ls.size();
		assertEquals(sz2, sz1+1);
		assertEquals(threeOfSpades, ls.getPile()[sz1]);
	}
	/*
	 * Removing card from Golf tableau pile decreases its number 
	 * of cards and results in following card being the new 
	 * top card
	 */
	@Test
	public void testGolfLessTP() {
		GolfTP g = new GolfTP();
		// not calling initialSetup
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		g.add(aceOfSpades);
		g.add(twoOfDiamonds);
		g.add(threeOfSpades);
		int sz1 = g.size();
		g.remove();
		int sz2 = g.size();
		assertEquals(sz2, sz1-1);
		assertEquals(twoOfDiamonds, g.getPile()[sz2-1]);
	}
	/*
	 * Removing card from Little Spider's tableau pile decreases 
	 * its number of cards and results in following card being the 
	 * new top card
	 */
	@Test
	public void testLSDec() {
		LittleSpiderTP ls = new LittleSpiderTP();
		// not calling initialSetup
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		ls.addForTesting(0, aceOfSpades);
		ls.addForTesting(1, twoOfDiamonds);
		ls.addForTesting(2, threeOfSpades);
		int sz1 = ls.size();
		ls.remove();
		int sz2 = ls.size();
		assertEquals(sz2, sz1-1);
		assertEquals(twoOfDiamonds, ls.getPile()[sz2-1]);
	}

}
