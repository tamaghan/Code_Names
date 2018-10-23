package gui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Games.GolfGame;

public class GolfGUI extends GUI{
	
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
		tpHolder.add(tp1);
		tpHolder.add(tp2);
		tpHolder.add(tp3);
		tpHolder.add(tp4);
		tpHolder.add(tp5);
		tpHolder.add(tp6);
		tpHolder.add(tp7);
		home=scl.createDisplayImage("/PictureFolder/green.gif");
		homeHolder = new JPanel();
		homeHolder.add(home);
		stock=scl.createDisplayImage(g.getStock().topCard().getGifFile());
		stockHolder = new JPanel();
		stockHolder.add(stock);
		gameScreen=new JPanel();
		gameScreen.add(tpHolder, BorderLayout.WEST);
		gameScreen.add(homeHolder, BorderLayout.CENTER);
		gameScreen.add(stockHolder, BorderLayout.EAST);
	}
	public JPanel getGameScreen() {
		return this.gameScreen;
	}
}
