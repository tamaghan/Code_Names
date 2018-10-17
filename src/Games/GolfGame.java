package Games;
import Deck.Deck;
import pile.GolfHomecellPile;
import pile.GolfTP;
import pile.Stock;
/**
 * Defines class representing a Golf game. 
 * Each game instance has 7 tableau piles, 1 homecell pile, and 1 stock pile [4 points]
 * @author tamaghan , dandrijje, fmdestin
 * @version 1.0
 * 
 */



public class GolfGame {
	private GolfTP tp1;
	private GolfTP tp2;
	private GolfTP tp3;
	private GolfTP tp4;
	private GolfTP tp5;
	private GolfTP tp6;
	private GolfTP tp7;
	private GolfHomecellPile home;
	private Stock stock;
	private Deck deck;
	
	public GolfGame() {
		deck = new Deck();
		tp1 = new GolfTP();
		tp2 = new GolfTP();
		tp3 = new GolfTP();
		tp4 = new GolfTP();
		tp5 = new GolfTP();
		tp6 = new GolfTP();
		tp7 = new GolfTP();
		home = new GolfHomecellPile();
		stock = new Stock();
		int rand=3+(int)(Math.random()*3);
		int i=0;
		while(i<rand) {
			deck.shuffle();
			i++;
		}
	}
	
}
