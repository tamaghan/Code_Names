package Games;

import Deck.DoubleDeck;
import pile.ThievesHomecell;
import pile.ThievesStock;
import pile.ThievesTableau;
import pile.ThievesWaste;

public class ThievesGame extends Game{
	
	/**
	 * fields for 13 tableau piles, 8 homecell piles, 
	 * 1 stock pile, 1 waste pile, and one double deck
	 */
	private ThievesTableau tp1;
	private ThievesTableau tp2;
	private ThievesTableau tp3;
	private ThievesTableau tp4;
	private ThievesTableau tp5;
	private ThievesTableau tp6;
	private ThievesTableau tp7;
	private ThievesTableau tp8;
	private ThievesTableau tp9;
	private ThievesTableau tp10;
	private ThievesTableau tp11;
	private ThievesTableau tp12;
	private ThievesTableau tp13;
	private ThievesHomecell home1;
	private ThievesHomecell home2;
	private ThievesHomecell home3;
	private ThievesHomecell home4;
	private ThievesHomecell home5;
	private ThievesHomecell home6;
	private ThievesHomecell home7;
	private ThievesHomecell home8;
	private ThievesStock stock;
	private ThievesWaste waste;
	private DoubleDeck d;
	
	/**
	 * constructor shuffles the deck and calls initialSetup 
	 * method for all of the piles
	 */
	public ThievesGame() {
		d = new DoubleDeck();
		tp1 = new ThievesTableau();
		tp2 = new ThievesTableau();
		tp3 = new ThievesTableau();
		tp4 = new ThievesTableau();
		tp5 = new ThievesTableau();
		tp6 = new ThievesTableau();
		tp7 = new ThievesTableau();
		tp8 = new ThievesTableau();
		tp9 = new ThievesTableau();
		tp10 = new ThievesTableau();
		tp11 = new ThievesTableau();
		tp12 = new ThievesTableau();
		tp13 = new ThievesTableau();
		home1 = new ThievesHomecell();
		home2 = new ThievesHomecell();
		home3 = new ThievesHomecell();
		home4 = new ThievesHomecell();
		home5 = new ThievesHomecell();
		home6 = new ThievesHomecell();
		home7 = new ThievesHomecell();
		home8 = new ThievesHomecell();
		stock = new ThievesStock();
		waste = new ThievesWaste();
		home1.initialSetup(d, home1);
		home1.initialSetup(d, home2);
		home1.initialSetup(d, home3);
		home1.initialSetup(d, home4);
		home1.initialSetup(d, home5);
		home1.initialSetup(d, home6);
		home1.initialSetup(d, home7);
		home1.initialSetup(d, home8);
		d.dDeckShuffle();
		tp1.initialSetup(d, tp1);
		tp2.initialSetup(d, tp2);
		tp3.initialSetup(d, tp3);
		tp4.initialSetup(d, tp4);
		tp5.initialSetup(d, tp5);
		tp6.initialSetup(d, tp6);
		tp7.initialSetup(d, tp7);
		tp8.initialSetup(d, tp8);
		tp9.initialSetup(d, tp9);
		tp10.initialSetup(d, tp10);
		tp11.initialSetup(d, tp11);
		tp12.initialSetup(d, tp12);
		tp13.initialSetup(d, tp13);
		stock.initialSetup(d, stock);
		waste.initialSetup(d, waste);
	}
	
	/**
	 * 
	 */
	public void stockRemove() {
		getWaste().getSPile().push(getStock().getSPile().pop());
	}
	/**
	 * getter for tp1
	 * @return tp1
	 */
	public ThievesTableau getTp1() {
		return tp1;
	}
	/**
	 * setter for tp1
	 * @param tp1
	 */
	public void setTp1(ThievesTableau tp1) {
		this.tp1 = tp1;
	}
	/**
	 * getter for tp2
	 * @return tp2
	 */
	public ThievesTableau getTp2() {
		return tp2;
	}
	/**
	 * setter for tp2
	 * @param tp2
	 */
	public void setTp2(ThievesTableau tp2) {
		this.tp2 = tp2;
	}
	/**
	 * getter for tp3
	 * @return tp3
	 */
	public ThievesTableau getTp3() {
		return tp3;
	}
	/**
	 * setter for tp3
	 * @param tp3
	 */
	public void setTp3(ThievesTableau tp3) {
		this.tp3 = tp3;
	}
	/**
	 * getter for tp4
	 * @return tp4
	 */
	public ThievesTableau getTp4() {
		return tp4;
	}
	/**
	 * setter for tp4
	 * @param tp4
	 */
	public void setTp4(ThievesTableau tp4) {
		this.tp4 = tp4;
	}
	/**
	 * getter for tp5
	 * @return tp5
	 */
	public ThievesTableau getTp5() {
		return tp5;
	}
	/**
	 * setter for tp5
	 * @param tp5
	 */
	public void setTp5(ThievesTableau tp5) {
		this.tp5 = tp5;
	}
	/**
	 * getter for tp6
	 * @return tp6
	 */
	public ThievesTableau getTp6() {
		return tp6;
	}
	/**
	 * setter for tp6
	 * @param tp6
	 */
	public void setTp6(ThievesTableau tp6) {
		this.tp6 = tp6;
	}
	/**
	 * getter for tp7
	 * @return tp7
	 */
	public ThievesTableau getTp7() {
		return tp7;
	}
	/**
	 * setter for tp7
	 * @param tp7
	 */
	public void setTp7(ThievesTableau tp7) {
		this.tp7 = tp7;
	}
	/**
	 * getter for tp8
	 * @return tp8
	 */
	public ThievesTableau getTp8() {
		return tp8;
	}
	/**
	 * setter for tp8
	 * @param tp8
	 */
	public void setTp8(ThievesTableau tp8) {
		this.tp8 = tp8;
	}
	/**
	 * getter for tp9
	 * @return tp9
	 */
	public ThievesTableau getTp9() {
		return tp9;
	}
	/**
	 * setter for tp9
	 * @param tp9
	 */
	public void setTp9(ThievesTableau tp9) {
		this.tp9 = tp9;
	}
	/**
	 * getter for tp10
	 * @return tp10
	 */
	public ThievesTableau getTp10() {
		return tp10;
	}
	/**
	 * setter for tp10
	 * @param tp10
	 */
	public void setTp10(ThievesTableau tp10) {
		this.tp10 = tp10;
	}
	/**
	 * getter for tp11
	 * @return tp11
	 */
	public ThievesTableau getTp11() {
		return tp11;
	}
	/**
	 * setter for tp11
	 * @param tp11
	 */
	public void setTp11(ThievesTableau tp11) {
		this.tp11 = tp11;
	}
	/**
	 * getter for tp12
	 * @return tp12
	 */
	public ThievesTableau getTp12() {
		return tp12;
	}
	/**
	 * setter for tp12
	 * @param tp12
	 */
	public void setTp12(ThievesTableau tp12) {
		this.tp12 = tp12;
	}
	/**
	 * getter for tp13
	 * @return tp13
	 */
	public ThievesTableau getTp13() {
		return tp13;
	}
	/**
	 * setter for tp13
	 * @param tp13
	 */
	public void setTp13(ThievesTableau tp13) {
		this.tp13 = tp13;
	}
	/**
	 * getter for home1
	 * @return home1
	 */
	public ThievesHomecell getHome1() {
		return home1;
	}
	/**
	 * setter for home1
	 * @param home1
	 */
	public void setHome1(ThievesHomecell home1) {
		this.home1 = home1;
	}
	/**
	 * getter for home2
	 * @return home2
	 */
	public ThievesHomecell getHome2() {
		return home2;
	}
	/**
	 * setter for home2
	 * @param home2
	 */
	public void setHome2(ThievesHomecell home2) {
		this.home2 = home2;
	}
	/**
	 * getter for home3
	 * @return home3
	 */
	public ThievesHomecell getHome3() {
		return home3;
	}
	/**
	 * setter for home3
	 * @param home3
	 */
	public void setHome3(ThievesHomecell home3) {
		this.home3 = home3;
	}
	/**
	 * getter for home4
	 * @return home4
	 */
	public ThievesHomecell getHome4() {
		return home4;
	}
	/**
	 * setter for home4
	 * @param home4
	 */
	public void setHome4(ThievesHomecell home4) {
		this.home4 = home4;
	}
	/**
	 * getter for home5
	 * @return home5
	 */
	public ThievesHomecell getHome5() {
		return home5;
	}
	/**
	 * setter for home5
	 * @param home5
	 */
	public void setHome5(ThievesHomecell home5) {
		this.home5 = home5;
	}
	/**
	 * getter for home6
	 * @return home6
	 */
	public ThievesHomecell getHome6() {
		return home6;
	}
	/**
	 * setter for home6
	 * @param home6
	 */
	public void setHome6(ThievesHomecell home6) {
		this.home6 = home6;
	}
	/**
	 * getter for home7
	 * @return home7
	 */
	public ThievesHomecell getHome7() {
		return home7;
	}
	/**
	 * setter for home7
	 * @param home7
	 */
	public void setHome7(ThievesHomecell home7) {
		this.home7 = home7;
	}
	/**
	 * getter for home8
	 * @return home8
	 */
	public ThievesHomecell getHome8() {
		return home8;
	}
	/**
	 * setter for home8
	 * @param home8
	 */
	public void setHome8(ThievesHomecell home8) {
		this.home8 = home8;
	}
	/**
	 * getter for stock
	 * @return stock
	 */
	public ThievesStock getStock() {
		return stock;
	}
	/**
	 * setter for stock
	 * @param stock
	 */
	public void setStock(ThievesStock stock) {
		this.stock = stock;
	}
	/**
	 * getter for waste
	 * @return waste
	 */
	public ThievesWaste getWaste() {
		return waste;
	}
	/**
	 * setter for waste
	 * @param waste
	 */
	public void setWaste(ThievesWaste waste) {
		this.waste = waste;
	}
	/**
	 * getter for d
	 * @return d
	 */
	public DoubleDeck getD() {
		return d;
	}
	/**
	 * setter for d
	 * @param d
	 */
	public void setD(DoubleDeck d) {
		this.d = d;
	}
}
