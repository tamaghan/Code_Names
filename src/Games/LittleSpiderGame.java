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
		setTp1(new LittleSpiderTP());
		setTp2(new LittleSpiderTP());
		setTp3(new LittleSpiderTP());
		setTp4(new LittleSpiderTP());
		setTp5(new LittleSpiderTP());
		setTp6(new LittleSpiderTP());
		setTp7(new LittleSpiderTP());
		setTp8(new LittleSpiderTP());
		
		home1 = new SpiderHomecellPile();
		home1.initialSetup(deck, home1.getPile()); 
		
		home2 = new SpiderHomecellPile();
		home2.setSize(1);
		home1.initialSetup(deck, home2.getPile());
		
		home3 = new SpiderHomecellPile();
		home3.setSize(1);
		home1.initialSetup(deck, home3.getPile());
		
		home4 = new SpiderHomecellPile();
		home4.setSize(1);
		home1.initialSetup(deck, home4.getPile());

		
		int rand=3+(int)(Math.random()*3);
		int i=0;
		while(i<rand) {
			deck.shuffle();
			i++;
		}
	}
	public SpiderHomecellPile getHome1() {
		return this.home1;
	}
	public void setHome1(SpiderHomecellPile lshp) {
		home1=lshp;
	}
	public SpiderHomecellPile getHome2() {
		return this.home2;
	}
	public void setHome2(SpiderHomecellPile lshp) {
		home2=lshp;
	}
	public SpiderHomecellPile getHome3() {
		return this.home3;
	}
	public void setHome3(SpiderHomecellPile lshp) {
		home3=lshp;
	}
	public SpiderHomecellPile getHome4() {
		return this.home4;
	}
	public void setHome4(SpiderHomecellPile lshp) {
		home4=lshp;
	}
	public LittleSpiderTP getTp1() {
		return tp1;
	}
	public void setTp1(LittleSpiderTP tp1) {
		this.tp1 = tp1;
	}
	public LittleSpiderTP getTp2() {
		return tp2;
	}
	public void setTp2(LittleSpiderTP tp2) {
		this.tp2 = tp2;
	}
	public LittleSpiderTP getTp3() {
		return tp3;
	}
	public void setTp3(LittleSpiderTP tp3) {
		this.tp3 = tp3;
	}
	public LittleSpiderTP getTp4() {
		return tp4;
	}
	public void setTp4(LittleSpiderTP tp4) {
		this.tp4 = tp4;
	}
	public LittleSpiderTP getTp5() {
		return tp5;
	}
	public void setTp5(LittleSpiderTP tp5) {
		this.tp5 = tp5;
	}
	public LittleSpiderTP getTp6() {
		return tp6;
	}
	public void setTp6(LittleSpiderTP tp6) {
		this.tp6 = tp6;
	}
	public LittleSpiderTP getTp7() {
		return tp7;
	}
	public void setTp7(LittleSpiderTP tp7) {
		this.tp7 = tp7;
	}
	public LittleSpiderTP getTp8() {
		return tp8;
	}
	public void setTp8(LittleSpiderTP tp8) {
		this.tp8 = tp8;
	}
	public Deck getDeck() {
		return this.deck;
	}

}
