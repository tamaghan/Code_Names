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
	
	public GolfTP getTp1() {
		return tp1;
	}
	public void setTp1(GolfTP tp1) {
		this.tp1 = tp1;
	}
	public GolfTP getTp2() {
		return tp2;
	}
	public void setTp2(GolfTP tp2) {
		this.tp2 = tp2;
	}
	public GolfTP getTp3() {
		return tp3;
	}
	public void setTp3(GolfTP tp3) {
		this.tp3 = tp3;
	}
	public GolfTP getTp4() {
		return tp4;
	}
	public void setTp4(GolfTP tp4) {
		this.tp4 = tp4;
	}
	public GolfTP getTp5() {
		return tp5;
	}
	public void setTp5(GolfTP tp5) {
		this.tp5 = tp5;
	}
	public GolfTP getTp6() {
		return tp6;
	}
	public void setTp6(GolfTP tp6) {
		this.tp6 = tp6;
	}
	public GolfTP getTp7() {
		return tp7;
	}
	public void setTp7(GolfTP tp7) {
		this.tp7 = tp7;
	}
	public GolfHomecellPile getHome() {
		return home;
	}
	public void setHome(GolfHomecellPile home) {
		this.home = home;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Deck getDeck() {
		return deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	
	
	
}
