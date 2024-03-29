package Games;
import Deck.Deck;
import pile.LittleSpiderTP;
import pile.Pile;
import pile.SpiderHomecellPile;

/**
 * Each game instance has 8 tableau piles, 4 homecell piles, and 0 stock piles
 * @author tamaghan , dandrijje, fmdestin, tbjackso
 * @version 1.0
 */


public class LittleSpiderGame extends Game{
	
	/**
	 * fields for the 8 tableau piles, 4 homecell piles, and deck
	 */
	
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
	
	/**
	 * constructor shuffles the deck and calls initialSetup 
	 * for all of the piles
	 */
	public LittleSpiderGame() {
		deck= new Deck();
		tp1= new LittleSpiderTP();
		tp2=new LittleSpiderTP();
		tp3=new LittleSpiderTP();
		tp4=new LittleSpiderTP();
		tp5=new LittleSpiderTP();
	    tp6=new LittleSpiderTP();
		tp7=new LittleSpiderTP();
		tp8=new LittleSpiderTP();
		home1 = new SpiderHomecellPile();
		home1.initialSetup(deck, home1); 
		home2 = new SpiderHomecellPile();
		home2.setSize(1);
		home1.initialSetup(deck, home2);		
		home3 = new SpiderHomecellPile();
		home3.setSize(1);
		home1.initialSetup(deck, home3);	
		home4 = new SpiderHomecellPile();
		home4.setSize(1);
		home1.initialSetup(deck, home4);
		
		int rand=3+(int)(Math.random()*3);
		int i=0;
		while(i<rand) {
			deck.shuffle();
			i++;
		}
		tp1=new LittleSpiderTP();
		tp1.initialSetup(deck, tp1);
		tp2=new LittleSpiderTP();
		tp2.initialSetup(deck, tp2);
		tp3=new LittleSpiderTP();
		tp3.initialSetup(deck, tp3);
		tp4=new LittleSpiderTP();
		tp4.initialSetup(deck, tp4);
		tp5=new LittleSpiderTP();
		tp5.initialSetup(deck, tp5);
		tp6=new LittleSpiderTP();
		tp6.initialSetup(deck, tp6);
		tp7=new LittleSpiderTP();
		tp7.initialSetup(deck, tp7);
		tp8=new LittleSpiderTP();
		tp8.initialSetup(deck, tp8);
	}
	/**
	 * getter for homecell pile 1
	 */
	public SpiderHomecellPile getHome1() {
		return this.home1;
	}
	/**
	 * setter for homecell pile 1
	 * @param lshp
	 */
	public void setHome1(SpiderHomecellPile lshp) {
		home1=lshp;
	}
	/**
	 * getter for homecell pile 2
	 */
	public SpiderHomecellPile getHome2() {
		return this.home2;
	}
	/**
	 * setter for homecell pile 2
	 * @param lshp
	 */
	public void setHome2(SpiderHomecellPile lshp) {
		home2=lshp;
	}
	/**
	 * getter for homecell pile 3
	 */
	public SpiderHomecellPile getHome3() {
		return this.home3;
	}
	/**
	 * setter for homecell pile 3
	 * @param lshp
	 */
	public void setHome3(SpiderHomecellPile lshp) {
		home3=lshp;
	}
	/**
	 * getter for homecell pile 4
	 */
	public SpiderHomecellPile getHome4() {
		return this.home4;
	}
	/**
	 * setter for homecell pile 4
	 * @param lshp
	 */
	public void setHome4(SpiderHomecellPile lshp) {
		home4=lshp;
	}
	/**
	 * getter for tableau pile 1
	 * @return
	 */
	public LittleSpiderTP getTp1() {
		return tp1;
	}
	/**
	 * setter for tableau pile 1
	 */
	public void setTp1(LittleSpiderTP tp1) {
		this.tp1 = tp1;
	}
	/**
	 * getter for tableau pile 2
	 * @return
	 */
	public LittleSpiderTP getTp2() {
		return tp2;
	}
	/**
	 * setter for tableau pile 2
	 */
	public void setTp2(LittleSpiderTP tp2) {
		this.tp2 = tp2;
	}
	/**
	 * getter for tableau pile 3
	 * @return
	 */
	public LittleSpiderTP getTp3() {
		return tp3;
	}
	/**
	 * setter for tableau pile 3
	 * 
	 */
	public void setTp3(LittleSpiderTP tp3) {
		this.tp3 = tp3;
	}
	/**
	 * getter for tableau pile 4
	 * @return
	 */
	public LittleSpiderTP getTp4() {
		return tp4;
	}
	/**
	 * setter for tp4
	 * @param tp4
	 */
	public void setTp4(LittleSpiderTP tp4) {
		this.tp4 = tp4;
	}
	/**
	 * getter for tableau pile 5
	 * @return
	 */
	public LittleSpiderTP getTp5() {
		return tp5;
	}
	/**
	 * setter for tp5
	 * @param tp5
	 */
	public void setTp5(LittleSpiderTP tp5) {
		this.tp5 = tp5;
	}
	/**
	 * getter for tableau pile 6
	 * @return
	 */
	public LittleSpiderTP getTp6() {
		return tp6;
	}
	/**
	 * setter for tp6
	 * @param tp6
	 */
	public void setTp6(LittleSpiderTP tp6) {
		this.tp6 = tp6;
	}
	/**
	 * getter for tableau pile 7
	 * @return
	 */
	public LittleSpiderTP getTp7() {
		return tp7;
	}
	/**
	 * setter for tableau pile 7
	 */
	public void setTp7(LittleSpiderTP tp7) {
		this.tp7 = tp7;
	}
	/**
	 * getter for tableau pile 8
	 * @return
	 */
	public LittleSpiderTP getTp8() {
		return tp8;
	}
	/**
	 * setter for tp8
	 * @param tp8
	 */
	public void setTp8(LittleSpiderTP tp8) {
		this.tp8 = tp8;
	}
	/**
	 * getter for deck
	 * @return 
	 */
	public Deck getDeck() {
		return this.deck;
	}
	

}
