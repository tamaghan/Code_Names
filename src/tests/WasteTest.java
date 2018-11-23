package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Deck.Card;
import Deck.Deck;
import Deck.DoubleDeck;
import Games.GolfGame;
import Games.ThievesGame;
import pile.GolfTP;
import pile.Pile;
import pile.StackPile;
import pile.Stock;
import pile.ThievesStock;
import pile.ThievesWaste;

public class WasteTest {
  
	//Forty Thieves waste pile initially holds 0 cards [1 points]
	@Test
	public void testInitial() {
		ThievesWaste p = new ThievesWaste();
		assertEquals(0,p.size());
	}
	
	//Forty Thieves waste pile correctly returns if adding a specific card is legal or illegal 
	//(e.g., always illegal since we use another approach for this) [1 points]
	@Test
	public void testAdd() {
		ThievesWaste p = new ThievesWaste();
		Card test1 = new Card(1,"Spades");
		Card test2 = new Card(5,"Diamonds");
		assertFalse(p.add(test1));
		assertFalse(p.add(test2));
	}
	
	//Forty Thieves waste pile correctly returns if removing a specific card is legal or illegal 
	//(e.g., always legal) [1 points]
	@Test
	public void testRemove() {
		DoubleDeck d = new DoubleDeck();
		ThievesWaste p = new ThievesWaste();
		ThievesStock s = new ThievesStock();
		Card c = new Card(1,"Diamond");
		p.getSPile().push(c);
		assertTrue(p.remove());
	}
	
	//Removing a card from Forty Thieves waste pile decreases its number of cards and results 
	//in the following card being the new top card [1 points]
	@Test 
	public void testSize() {
		DoubleDeck d = new DoubleDeck();
		ThievesWaste p = new ThievesWaste();
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
