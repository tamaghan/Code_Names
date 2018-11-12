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

public class WasteTest {
  
  @Test
  public void testInitialWaste() 
  {
    FortyThieves tg = new FortyThieves();
    assertEquals(tg.getWaste().size(), 0);
    
  }
}
