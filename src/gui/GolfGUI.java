package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Games.GolfGame;

public class GolfGUI extends GUI{
	/**
	 * field for a GolfGame, as well as JLabels for the 
	 * top card in each pile, and JPanels to hold and organize 
	 * the JLabels, as well as field for SelectingCardsListener
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
	
	
	/**
	 * constructor creates a new game of golf and a new 
	 * SelectingCardsListener instance. Then sets the 
	 * JLabels equal to their appropriate gifFiles. Constructor 
	 * then adds the JLabels to their appropriate panels, which 
	 * are all added to one JPanel 
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
		tp1=scl.createDisplayImage(g.getTp1().topCard().getGifFile());
		tp2=scl.createDisplayImage(g.getTp2().topCard().getGifFile());
		tp3=scl.createDisplayImage(g.getTp3().topCard().getGifFile());
		tp4=scl.createDisplayImage(g.getTp4().topCard().getGifFile());
		tp5=scl.createDisplayImage(g.getTp5().topCard().getGifFile());
		tp6=scl.createDisplayImage(g.getTp6().topCard().getGifFile());
		tp7=scl.createDisplayImage(g.getTp7().topCard().getGifFile());
		tpHolder=new JPanel();
		tpHolder.add(new JLabel("Tableau"), BorderLayout.NORTH);
		tpHolder.add(tp1);
		tpHolder.add(tp2);
		tpHolder.add(tp3);
		tpHolder.add(tp4);
		tpHolder.add(tp5);
		tpHolder.add(tp6);
		tpHolder.add(tp7);
		home=scl.createDisplayImage("/PictureFolder/green.gif");
		homeHolder = new JPanel();
		JLabel homeA = new JLabel("HomeCell");
		homeHolder.add(homeA, BorderLayout.NORTH);
		homeHolder.add(home, BorderLayout.SOUTH);
		stock=scl.createDisplayImage(g.getStock().topCard().getGifFile());
		stockHolder = new JPanel();
		JLabel stockA = new JLabel("Stock");
		stockHolder.add(stockA, BorderLayout.NORTH);
		stockHolder.add(stock, BorderLayout.SOUTH);
		gameScreen=new JPanel();
		gameScreen.add(tpHolder, BorderLayout.NORTH);
		gameScreen.add(homeHolder, BorderLayout.CENTER);
		gameScreen.add(stockHolder, BorderLayout.SOUTH);
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
        JFrame frame = new JFrame("A8-404 Name Not Found: Golf");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(gameScreen);
        frame.setVisible(true);
    }
}
