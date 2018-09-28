package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Deck.Card;
import pile.GolfTP;
import pile.LittleSpiderTP;

public class Homecellpiletests {
	
	/*
	 * Homecell pile in Golf initially holds 0 cards
	 */
	@Test
	public void testInitialGolfHP() {
		//pile interface, implemented by GolfTP
		GolfTP g = new GolfTP();
		// g.initialSetUp(); adds  Cards from the Deck to the method
		g.initialSetup();
		assertEquals(g.size(), 0);
	}
	
	/*
	 * Homecell piles in Little Spider initially hold 1 card
	 */
	@Test
	public void testInitialLSHP() {
		// pile interface, implemented by LittleSpiderTP
		LittleSpiderTP ls = new LittleSpiderTP();
		// ls.initialSetUp(); adds 1 Cards from the Deck to the method
		ls.initialSetup();
		assertEquals(ls.size(), 1);
	}
	
	/*
	 * Golf homecell pile correctly determines if adding a card 
	 * is legal or illegal To receive points, your test(s) cannot 
	 * call one method for when the card comes from the stock pile 
	 * and a different method for when the card comes from a tableau pile.
	 */
	@Test
	public void testGolfHPAdd() {
		GolfTP g = new GolfTP();
		//Will have to be able to call add during initial setup, but not allow cards to be added afterward
		g.initialSetup();
		Card aceOfSpades = new Card(1, "Spades");
		Card eightOfHearts = new Card(8, "Hearts");
		Card kingOfClubs = new Card(13, "Clubs");
		assertFalse(g.add(aceOfSpades));
		assertFalse(g.add(eightOfHearts));
		assertFalse(g.add(kingOfClubs));
	}
	
	/*
	 * Little Spider homecell piles correctly determines 
	 * if adding a specific card is legal or illegal
	 */
	@Test
	public void testLSHPAdd() {
		LittleSpiderTP ls = new LittleSpiderTP();
		//not calling initialSetup for testing purposes. initialSetup will be called when pile is made in game class constructor.
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		Card eightOfHearts = new Card(8, "Hearts");
		Card kingOfClubs = new Card(13, "Clubs");
		
		ls.add(aceOfSpades);
		assertTrue(ls.add(kingOfClubs));
		assertTrue(ls.add(twoOfDiamonds));
		assertFalse(ls.add(eightOfHearts));
	}
	
	/*
	 *Golf homecell pile correctly returns if removing
	 * top card is legal or illegal (e.g., always false)
	 */
	@Test
	public void testGolfHPRemove() {
		GolfTP g = new GolfTP();
		// not calling initialSetup for testing purposes
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		g.add(aceOfSpades);
		g.add(twoOfDiamonds);
		assertFalse(g.remove());
	}
	
	/*
	 * Little Spider homecell
	 *  pile correctly returns if removing top card is
	 *   legal or illegal (e.g., if the homecell pile has 2 or more cards)
	 */
	@Test
	public void testLSHPRemove() {
		LittleSpiderTP ls = new LittleSpiderTP();
		//not calling initial setup for testing 
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		ls.add(aceOfSpades);
		ls.add(twoOfDiamonds);
		assertTrue(ls.remove());
		assertFalse(ls.remove());
	}
	
	/*
	 * Adding card to Golf homecell pile increases 
	 * its number of cards and results in that card
	 *  being the homecell pile's new top card 
	 */
	@Test
	public void testNewLSHP() {
		GolfTP g = new GolfTP();
		//not calling initialSetup for this test
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		g.add(aceOfSpades);
		g.add(twoOfDiamonds);
		int sz1 = g.size();
		g.add(threeOfSpades);
		int sz2 = g.size();
		assertEquals(sz2, sz1+1);
		assertEquals(threeOfSpades, g.getPile()[sz1]);
	}
	
	/*
	 * Adding card to Little Spider's
	 *  homecell pile increases its number of 
	 *  cards and results in that card being the homecell pile's new top card 
	 */
	@Test
	public void testNewLSHP1() {
		LittleSpiderTP ls = new LittleSpiderTP();
		//not calling initialSetup for this test
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		ls.add(aceOfSpades);
		ls.add(twoOfDiamonds);
		int sz1 = ls.size();
		ls.add(threeOfSpades);
		int sz2 = ls.size();
		assertEquals(sz2, sz1+1);
		assertEquals(threeOfSpades, ls.getPile()[sz1]);
	}
	
	/*
	 * Removing card from one of 
	 * Little Spider's homecell pile decreases its 
	 * number of cards and results in following card being the new top card 
	 */
	@Test
	public void testGolfLessHP() {
		LittleSpiderTP ls = new LittleSpiderTP();
		// not calling initialSetup
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
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
