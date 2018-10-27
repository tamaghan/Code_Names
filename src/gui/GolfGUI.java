package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Deck.Card;
import Games.GolfGame;
/**
 * Defines GUI for the golf game
 * @author  tamaghan , dandrijje, fmdestin, tbjackso
 *
 */
public class GolfGUI extends GUI {
	/**
	 * field for a GolfGame, as well as JLabels for the 
	 * top card in each pile, and JPanels to hold and organize 
	 * the JLabels, as well as field for SelectingCardsListener, 
	 * the JFrame for the game
	 */
	private GolfGame g;
	private JPanel gameScreen;
	private JPanel tpHolder;
	private JPanel homeHolder;
	private JPanel stockHolder;
	private JLabel tp1;
	private JLabel tp2;
	private JLabel tp3;
	private JLabel tp4;
	private JLabel tp5;
	private JLabel tp6;
	private JLabel tp7;
	private JLabel home;
	private JLabel stock;
	private SelectingCardsListener scl;
	private JFrame frame;

	/**
	 * constructor creates a new game of golf and a new 
	 * SelectingCardsListener instance, along with 
	 * new Jlabels
	 */
	public GolfGUI() {
		g= new GolfGame();
		scl = new SelectingCardsListener();
		tp1=new JLabel();
		tp2=new JLabel();
		tp3=new JLabel();
		tp4=new JLabel();
		tp5=new JLabel();
		tp6=new JLabel();
		tp7=new JLabel();
		home=new JLabel();
		stock=new JLabel();
		tpHolder=new JPanel();
		homeHolder = new JPanel();
		stockHolder = new JPanel();
		gameScreen=new JPanel();
		frame = new JFrame("A8-404 Name Not Found: Golf");
		update();
	}
	/**
	 * 
	 * @return the JPanel which holds all of the piles
	 */
	public JPanel getGameScreen() {
		return this.gameScreen;
	}

	/**
	 * creates new JFrame for golf game
	 */
	public void golfGUI(){
		frame.setSize(800, 400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	/**
	 * update method ensures each pile shows the right 
	 * card after a legal move is made and adds mouselisteners with the 
	 * proper functionality
	 */
	public void update() {		

		tp1=scl.createDisplayImage(g.getTp1().topCard().getGifFile());
		tp2=scl.createDisplayImage(g.getTp2().topCard().getGifFile());
		tp3=scl.createDisplayImage(g.getTp3().topCard().getGifFile());
		tp4=scl.createDisplayImage(g.getTp4().topCard().getGifFile());
		tp5=scl.createDisplayImage(g.getTp5().topCard().getGifFile());
		tp6=scl.createDisplayImage(g.getTp6().topCard().getGifFile());
		tp7=scl.createDisplayImage(g.getTp7().topCard().getGifFile());
		tp1.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	
				if(g.getTp1().size()!=0) {
					if(!isCardSelected()) {
						select(g.getTp1(), tp1);
					}else {
						if(!getCard().equals(g.getTp1().topCard())) {
							err("Cards Cannot Be Added to Tableau Pile");
						}else {
							deselect();
						}
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){
			}
		});
		tp2.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	
				if(g.getTp2().size()!=0) {
					if(!isCardSelected()) {
						select(g.getTp2(), tp2);
					}else {
						if(!getCard().equals(g.getTp2().topCard())) {
							err("Cards Cannot Be Added to Tableau Pile");
						}else {
							deselect();
						}
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){	
			}
		});
		tp3.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e){
				if(g.getTp3().size()!=0) {
					if(!isCardSelected()) {
						select(g.getTp3(), tp3);
					}else {
						if(!getCard().equals(g.getTp3().topCard())) {
							err("Cards Cannot Be Added to Tableau Pile");
						}else {
							deselect();
						}
					}
				}
			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	

			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){	
			}
		});
		tp4.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e){

			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	
				if(g.getTp4().size()!=0) {
					if(!isCardSelected()) {
						select(g.getTp4(), tp4);
					}else {
						if(!getCard().equals(g.getTp4().topCard())) {
							err("Cards Cannot Be Added to Tableau Pile");
						}else {
							deselect();
						}
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){	
			}
		});
		tp5.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e){

			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	
				if(g.getTp5().size()!=0) {
					if(!isCardSelected()) {
						select(g.getTp5(), tp5);
					}else {
						if(!getCard().equals(g.getTp5().topCard())) {
							err("Cards Cannot Be Added to Tableau Pile");
						}else {
							deselect();
						}
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){	
			}
		});
		tp6.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e){

			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	
				if(g.getTp6().size()!=0) {
					if(!isCardSelected()) {
						select(g.getTp6(), tp6);
					}else {
						if(!getCard().equals(g.getTp6().topCard())) {
							err("Cards Cannot Be Added to Tableau Pile");
						}else {
							deselect();
						}
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){	
			}
		});
		tp7.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e){

			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	
				if(g.getTp7().size()!=0) {
					if(!isCardSelected()) {
						select(g.getTp7(), tp7);
					}else {
						if(!getCard().equals(g.getTp7().topCard())) {
							err("Cards Cannot Be Added to Tableau Pile");
						}else {
							deselect();
						}
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){	
			}
		});
		tpHolder = new JPanel();
		tpHolder.add(new JLabel("Tableau"), BorderLayout.NORTH);
		tpHolder.add(tp1);
		tpHolder.add(tp2);
		tpHolder.add(tp3);
		tpHolder.add(tp4);
		tpHolder.add(tp5);
		tpHolder.add(tp6);
		tpHolder.add(tp7);
		home=scl.createDisplayImage(g.getHome().topCard().getGifFile());
		home.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){	
			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	
				if(!isCardSelected()) {
					err("Homecell Pile Cannot Be Selected");
				}else {
					if(validMove()) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){	
			}
		});
		stock=scl.createDisplayImage(g.getStock().topCard().getGifFile());
		stock.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e){

			}
			@Override
			public void mousePressed(MouseEvent e){
			}
			@Override
			public void mouseReleased(MouseEvent e){	
				System.err.println("hi mom");
				selectStock();
			}
			@Override
			public void mouseEntered(MouseEvent e){
			}
			@Override
			public void mouseExited(MouseEvent e){	
			}
		});
		homeHolder=new JPanel();
		homeHolder.add(new JLabel("HomeCell"), BorderLayout.NORTH);
		homeHolder.add(home, BorderLayout.SOUTH);
		JLabel stockA = new JLabel("Stock");
		stockHolder=new JPanel();
		stockHolder.add(stockA, BorderLayout.NORTH);
		stockHolder.add(stock, BorderLayout.SOUTH);
		gameScreen = new JPanel();
		gameScreen.add(tpHolder, BorderLayout.NORTH);
		gameScreen.add(homeHolder, BorderLayout.CENTER);
		gameScreen.add(stockHolder, BorderLayout.SOUTH);
		setLabel(new JLabel());
		frame.getContentPane().removeAll();
		frame.getContentPane().add(gameScreen);
		frame.setVisible(true);
	}
	/**
	 * method for when user selects stock JLabel
	 */
	public void selectStock() {
		if(g.getStock().size()!=0) {
			if(isCardSelected()) {
				deselect();
			}
			g.getHome().getPile()[g.getHome().size()]=g.getStock().topCard();
			g.getHome().setSize(g.getHome().size()+1);
			g.getStock().remove();
			update();	
		}		
	}
	/**
	 * if a move is valid, card will be moved 
	 * from tableau pile to the homecellpile
	 */
	public boolean validMove() {
		if(g.getHome().add(getCard())) {
			getPile().remove();
			update();
			return true;
		}
		else return false;
	}
}
