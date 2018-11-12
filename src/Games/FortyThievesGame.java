package Games;
import Deck.Deck;
import pile.Pile;
import pile.Stock;
import pile.Waste;
import pile.FortyThievesTP;
import pile.FortyThievesHomecellPile;
public class FortyThievesGame extends Game
{



/**
	 * fields for the 13 Forty Thieves Tableau piles, 8 homecell piles, 
	 * the stock pile, the waste pile and two decks
	 */
  private FortyThievesTP tp1;
  private FortyThievesTP tp2;
  private FortyThievesTP tp3;
  private FortyThievesTP tp4;
  private FortyThievesTP tp5;
  private FortyThievesTP tp6;
  private FortyThievesTP tp7;
  private FortyThievesTP tp8;
  private FortyThievesTP tp9;
  private FortyThievesTP tp10;
  private FortyThievesTP tp11;
  private FortyThievesTP tp12;
  private FortyThievesTP tp13;
  private FortyThievesHomecellPile home1;
  private FortyThievesHomecellPile home2;
  private FortyThievesHomecellPile home3;
  private FortyThievesHomecellPile home4;
  private FortyThievesHomecellPile home5;
  private FortyThievesHomecellPile home6;
  private FortyThievesHomecellPile home7;
  private FortyThievesHomecellPile home8;
  private Stock stock;
  private Waste waste;
  private Deck deck1;
  private Deck deck2;
  
  public FortyThievesGame()
  {
    deck1 = new Deck();
    deck2 = new Deck();
    int rand=3+(int)(Math.random()*3);
		int i=0;
		while(i<rand) 
    {
			deck.shuffle();
			i++;
    }
      
  
  
  
  }
  
  public Deck getDeck1()
  {
    return deck1;
  }
  
  public Deck getDeck2()
  {
    return deck2;
  }





































}
