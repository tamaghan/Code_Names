package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Deck.Card;
import Deck.Deck;
import Games.LittleSpiderGame;
import pile.GolfHomecellPile;
import pile.GolfTP;
import pile.GolfHomecellPile;
import pile.SpiderHomecellPile;

public class HomecellPileTests {
	
	/*
	 * Homecell pile in Golf initially holds 0 cards..
	 */
	@Test
	public void testInitialGolfHomecellPile() {
		//pile interface, implemented by GolfHomecellPile
		GolfHomecellPile g = new GolfHomecellPile();
		Deck d = new Deck();
		Card[] c = d.getCardDeck();
		// g.initialSetUp(); adds  Cards from the Deck to the method
		g.initialSetup(d, c);
		assertEquals(g.size(), 0);
	}
	
	/*
	 * Homecell piles in Little Spider initially hold 1 card
	 */
	@Test
	public void testInitialLSHP() {
		// pile interface, implemented by SpiderHomecellPile
		LittleSpiderGame lsg = new LittleSpiderGame();
		// ls.initialSetUp(); adds 1 Cards from the Deck to the method
		
		assertEquals(lsg.getHome1().topCard().getRank(), 1);
		assertEquals(lsg.getHome1().topCard().getSuit(), "Hearts");
		assertEquals(lsg.getHome2().topCard().getRank(), 1);
		assertEquals(lsg.getHome2().topCard().getSuit(), "Diamonds");
		assertEquals(lsg.getHome3().topCard().getRank(), 13);
		assertEquals(lsg.getHome3().topCard().getSuit(), "Clubs");
		assertEquals(lsg.getHome4().topCard().getRank(), 13);
		assertEquals(lsg.getHome4().topCard().getSuit(), "Spades");
	}
	
	/*
	 * Golf homecell pile correctly determines if adding a card 
	 * is legal or illegal. To receive points, your test(s) cannot 
	 * call one method for when the card comes from the stock pile 
	 * and a different method for when the card comes from a tableau pile.
	 */
	
	
	@Test
	public void testGolfHomecellPileAdd() {
		GolfHomecellPile g = new GolfHomecellPile();
		GolfHomecellPile g2 = new GolfHomecellPile();
		GolfHomecellPile g3 = new GolfHomecellPile();
		GolfTP g4 = new GolfTP();
		Deck d = new Deck();
		Card[] c = d.getCardDeck();
		g.initialSetup(d, c);
		Card aceOfSpades = new Card(1, "Spades");
		Card eightOfHearts = new Card(8, "Hearts");
		Card kingOfClubs = new Card(13, "Clubs");
		Card queenOfHearts = new Card(12, "Hearts");
		g.addForTesting(0, aceOfSpades);
		g2.addForTesting(0, queenOfHearts);
		g3.addForTesting(0, eightOfHearts);
		g4.addForTesting(0, kingOfClubs);
		assertTrue(g.add(kingOfClubs));
		assertTrue(g2.add(kingOfClubs));
		assertFalse(g2.add(kingOfClubs));
		
		
	}
	
	/*
	 * Little Spider homecell piles correctly determines 
	 * if adding a specific card is legal or illegal
	 */
	@Test
	public void testLSHPAdd() {
		SpiderHomecellPile ls = new SpiderHomecellPile();
		SpiderHomecellPile ls1 = new SpiderHomecellPile();
		//not calling initialSetup for testing purposes. initialSetup will be called when pile is made in game class constructor.
		Card aceOfHearts = new Card(1, "Hearts");
		Card twoOfHearts = new Card(2, "Hearts");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card eightOfSpades = new Card(8, "Spades");
		Card queenOfClubs = new Card(12, "Clubs");
		Card kingOfClubs = new Card(13, "Clubs");
		ls.addForTesting(0, aceOfHearts);
		ls1.addForTesting(0, kingOfClubs);
		assertFalse(ls.add(kingOfClubs));
		assertFalse(ls.add(twoOfDiamonds));
		assertTrue(ls.add(twoOfHearts));
		assertFalse(ls.add(eightOfSpades));
		assertEquals(ls.topCard(), twoOfHearts);
		assertTrue(ls1.add(queenOfClubs));
		assertFalse(ls1.add(eightOfSpades));
		assertEquals(ls1.topCard(), queenOfClubs);
		
	}
	
	/*
	 *Golf homecell pile correctly returns if removing
	 * top card is legal or illegal (e.g., always false)
	 */
	@Test
	public void testGolfHomecellPileRemove() {
		GolfHomecellPile g = new GolfHomecellPile();
		Deck d = new Deck();
		Card[] c = d.getCardDeck();
		g.initialSetup(d, c);
		assertFalse(g.remove());
	}
	
	/*
	 * Little Spider homecell
	 *  pile correctly returns if removing top card is
	 *   legal or illegal (e.g., if the homecell pile has 2 or more cards)
	 */
	@Test
	public void testLSHPRemove() {
		SpiderHomecellPile ls = new SpiderHomecellPile();
		//not calling initial setup for testing 
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfHearts = new Card(3, "Hearts");
		Deck d = new Deck();
		Card[] c = d.getCardDeck();
		ls.initialSetup(d, c);
		assertFalse(ls.remove());
		ls.addForTesting(0, aceOfSpades);
		ls.addForTesting(1, twoOfDiamonds);
		ls.addForTesting(2, threeOfHearts);
		assertTrue(ls.remove());
		assertTrue(ls.remove());
		assertTrue(ls.remove());
		assertFalse(ls.remove());
	}
	
	/*
	 * Adding card to Golf homecell pile increases 
	 * its number of cards and results in that card
	 *  being the homecell pile's new top card 
	 */
	@Test
	public void testincreaseGolfHP() {
		GolfHomecellPile g = new GolfHomecellPile();
		//not calling initialSetup for this test
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		g.addForTesting(0, aceOfSpades);
		g.addForTesting(1, twoOfDiamonds);
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
	public void testIncreaseLSHP() {
		SpiderHomecellPile ls = new SpiderHomecellPile();
		//not calling initialSetup for this test
		Card aceOfSpades = new Card(1, "Spades");
		Card twoOfDiamonds = new Card(2, "Diamonds");
		Card threeOfSpades = new Card(3, "Spades");
		ls.addForTesting(0, aceOfSpades);
		ls.addForTesting(1, twoOfDiamonds);
		int sz1 = ls.size();
		ls.addForTesting(2, threeOfSpades);
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
	public void testLSDecHP() {
		SpiderHomecellPile ls = new SpiderHomecellPile();
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
