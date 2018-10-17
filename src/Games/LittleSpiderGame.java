package Games;
import Deck.Deck;
import pile.LittleSpiderTP;

import pile.SpiderHomecellPile;

/**
 * Each game instance has 8 tableau piles, 4 homecell piles, and 0 stock piles
 * @author tamaghan , dandrijje, fmdestin
 * @version 1.0
 */


public class LittleSpiderGame {
	private LittleSpiderTP tp1;
	private LittleSpiderTP tp2;
	private LittleSpiderTP tp3;
	private LittleSpiderTP tp4;
	private LittleSpiderTP tp5;
	private LittleSpiderTP tp6;
	private LittleSpiderTP tp7;
	private LittleSpiderTP tp8;
	private SpiderHomecellPile home1;
	private SpiderHomecellPile home2;
	private SpiderHomecellPile home3;
	private SpiderHomecellPile home4;
	private Deck deck;
	

	public LittleSpiderGame() {
		deck= new Deck();
		tp1 = new LittleSpiderTP();
		tp2 = new LittleSpiderTP();
		tp3 = new LittleSpiderTP();
		tp4 = new LittleSpiderTP();
		tp5 = new LittleSpiderTP();
		tp6 = new LittleSpiderTP();
		tp7 = new LittleSpiderTP();
		tp8 = new LittleSpiderTP();
		home1 = new SpiderHomecellPile();
		home2 = new SpiderHomecellPile();
		home3 = new SpiderHomecellPile();
		home4 = new SpiderHomecellPile();
		int rand=3+(int)(Math.random()*3);
		int i=0;
		while(i<rand) {
			deck.shuffle();
			
			i++;
		}
	}

}
