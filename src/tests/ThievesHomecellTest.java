package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Deck.Card;
import Deck.DoubleDeck;
import pile.Pile;
import pile.StackPile;
import pile.ThievesHomecell;
import pile.ThievesTableau;

public class ThievesHomecellTest {

	//Forty Thieves homecell piles initially hold 1 card [2 points]
	@Test
	public void initialHold() {
		DoubleDeck d = new DoubleDeck();
		ThievesHomecell hc = new ThievesHomecell();
		hc.initialSetup(d, hc);
		assertEquals(1,hc.getSize());
		assertEquals(103,d.getSize());
		assertEquals(1,hc.topCard().getRank());
	}
	
	//Forty Thieves homecell pile correctly determines if adding a specific card is legal or illegal [2 points]
	@Test
	public void cardLegal() {
		DoubleDeck d = new DoubleDeck();
		ThievesHomecell hc = new ThievesHomecell();
		hc.initialSetup(d, hc);
		assertEquals(103,d.getSize());
		String s = hc.topCard().getSuit();
		Card aceOfString = new Card(1, s);
		Card twoOfString = new Card(2, s);
		assertFalse(hc.add(aceOfString));
		assertTrue(hc.add(twoOfString));
	}
	
	
	
	//Forty Thieves homecell pile correctly returns if removing top card is legal or illegal (e.g., always illegal) [2 points]
	@Test
	public void removeTopLegal() {
		DoubleDeck d = new DoubleDeck();
		ThievesHomecell hc = new ThievesHomecell();
		hc.initialSetup(d, hc);
		assertFalse(hc.remove());
	}
	
	//Adding a card to Forty Thieves homecell pile increases its number of cards and results 
	//in that card being the homecell pile's new top card [2 points]
	@Test
	public void increaseSize() {
		DoubleDeck d = new DoubleDeck();
		ThievesHomecell hc = new ThievesHomecell();
		hc.initialSetup(d, hc);
		String cardsSuit = hc.topCard().getSuit();
		Card twoRank = new Card(2, cardsSuit);
		assertTrue(hc.add(twoRank));
		assertEquals(2,hc.getSize());
		assertEquals(twoRank,hc.topCard());
	}
	
}
