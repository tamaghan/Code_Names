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

public class GolfGame extends Game{
	/**
	 * fields for the 7 golf Tableau piles, the homecell pile, 
	 * the stock pile, and the deck
	 */
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
	private boolean easterEggAvailability;
	private Timer timer;
	
	/**
	 * constructor shuffles the deck a random number of times,
	 * then calls the initialSetup method for each pile
	 */
	public GolfGame() {
		deck = new Deck();
		int rand=3+(int)(Math.random()*3);
		int i=0;
		while(i<rand) {
			deck.shuffle();
			i++;
		}
		tp1 = new GolfTP();
		tp1.initialSetup(deck, tp1);
		tp2 = new GolfTP();
		tp2.initialSetup(deck, tp2);
		tp3 = new GolfTP();
		tp3.initialSetup(deck, tp3);
		tp4 = new GolfTP();
		tp4.initialSetup(deck, tp4);
		tp5 = new GolfTP();
		tp5.initialSetup(deck, tp5);
		tp6 = new GolfTP();
		tp6.initialSetup(deck, tp6);
		tp7 = new GolfTP();
		tp7.initialSetup(deck, tp7);
		home = new GolfHomecellPile();
		home.initialSetup(deck, home);
		stock = new Stock();
		stock.initialSetup(deck, stock);
		
	}
	/**
	 * getters for tp1
	 */
	public GolfTP getTp1() {
		return tp1;
	}
	/**
	 * setter for tp1
	 * @param tp1
	 */
	public void setTp1(GolfTP tp1) {
		this.tp1 = tp1;
	}
	/**
	 * getter for tp2
	 * @return
	 */
	public GolfTP getTp2() {
		return tp2;
	}
	/**
	 * setter for tp2
	 * @param tp2
	 */
	public void setTp2(GolfTP tp2) {
		this.tp2 = tp2;
	}
	/**
	 * getter for tp3
	 * @return
	 */
	public GolfTP getTp3() {
		return tp3;
	}
	/**
	 * setter for tp3
	 * @param tp3
	 */
	public void setTp3(GolfTP tp3) {
		this.tp3 = tp3;
	}
	/**
	 * getter for tp4
	 * 
	 * @return
	 */
	public GolfTP getTp4() {
		return tp4;
	}
	/**
	 * setter for tp4
	 * @param tp4
	 */
	public void setTp4(GolfTP tp4) {
		this.tp4 = tp4;
	}
	/**
	 * getter for tp5
	 * @return
	 */
	public GolfTP getTp5() {
		return tp5;
	}
	/**
	 * setter for tp5
	 * @param tp5
	 */
	public void setTp5(GolfTP tp5) {
		this.tp5 = tp5;
	}
	/**
	 * getter for tp6
	 * @return
	 */
	public GolfTP getTp6() {
		return tp6;
	}
	/**
	 * setter for tp6
	 * @param tp6
	 */
	public void setTp6(GolfTP tp6) {
		this.tp6 = tp6;
	}
	/**
	 * getter for tp7
	 * @return
	 */
	public GolfTP getTp7() {
		return tp7;
	}
	/**
	 * setter for tp7
	 * @param tp7
	 */
	public void setTp7(GolfTP tp7) {
		this.tp7 = tp7;
	}
	/**
	 * getter for home
	 * @return
	 */
	public GolfHomecellPile getHome() {
		return home;
	}
	/**
	 * setter for home
	 * @param home
	 */
	public void setHome(GolfHomecellPile home) {
		this.home = home;
	}
	/**
	 * getter for stock
	 * @return
	 */
	public Stock getStock() {
		return stock;
	}
	/**
	 * setter for stock
	 * @param stock
	 */
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	/**
	 * getter for deck
	 * @return
	 */
	public Deck getDeck() {
		return deck;
	}
	/**
	 * setter for deck
	 * @param deck
	 */
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	
	
}
