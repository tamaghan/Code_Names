package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Deck.Card;
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
		// g.initialSetUp(); adds 5 Cards from the Deck to the method
		g.initialSetup();
		assertEquals(g.size(), 5);
	}
	/*
	 * Tableau piles in Little Spider initially hold 6 cards
	 */
	@Test
	public void testInitialLSTP() {
		// pile interface, implemented by LittleSpiderTP
		LittleSpiderTP ls = new LittleSpiderTP();
		// ls.initialSetUp(); adds 6 Cards from the Deck to the method
		ls.initialSetup();
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
		//Will have to be able to call add during initial setup, but not allow cards to be added afterward
		g.initialSetup();
		Card aceOfSpades = new Card(1, "Spade");
		Card eightOfHearts = new Card(8, "Heart");
		Card kingOfClubs = new Card(13, "Club");
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
		//not calling initialSetup for testing purposes. initialSetup will be called when pile is made in game class constructor.
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		Card threeOfSpades = new Card(3, "Spade");
		Card eightOfHearts = new Card(8, "Heart");
		Card kingOfClubs = new Card(13, "Club");
		ls.add(aceOfSpades);
		assertTrue(ls.add(kingOfClubs));
		assertTrue(ls.add(twoOfDiamonds));
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
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		g.add(aceOfSpades);
		g.add(twoOfDiamonds);
		assertTrue(g.remove());
		g.remove();
		assertTrue(g.remove());
		g.remove();
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
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		ls.add(aceOfSpades);
		ls.add(twoOfDiamonds);
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
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		Card threeOfSpades = new Card(3, "Spade");
		ls.add(aceOfSpades);
		ls.add(twoOfDiamonds);
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
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		Card threeOfSpades = new Card(3, "Spade");
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
		Card aceOfSpades = new Card(1, "Spade");
		Card twoOfDiamonds = new Card(2, "Diamond");
		Card threeOfSpades = new Card(3, "Spade");
		ls.add(aceOfSpades);
		ls.add(twoOfDiamonds);
		ls.add(threeOfSpades);
		int sz1 = ls.size();
		ls.remove();
		int sz2 = ls.size();
		assertEquals(sz2, sz1-1);
		assertEquals(twoOfDiamonds, ls.getPile()[sz2-1]);
	}

}
