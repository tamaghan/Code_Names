package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Games.LittleSpiderGame;

public class LittleSpiderGUI extends GUI{
	/**
	 * fields for a new little spider game,
	 * a JPanel for the screen, and JPanels to hold the piles,
	 * JLabels for each card pile,
	 * and a field for a new SelectingCardsListener
	 */
	private LittleSpiderGame lsg;
	private JPanel gameScreen;
	private JPanel tpHolder;
	private JPanel homeHolder;
	private JLabel tp1;
	private JLabel tp2;
	private JLabel tp3;
	private JLabel tp4;
	private JLabel tp5;
	private JLabel tp6;
	private JLabel tp7;
	private JLabel tp8;
	private JLabel home1;
	private JLabel home2;
	private JLabel home3;
	private JLabel home4;
	private SelectingCardsListener scl;
	/**
	 * constructor creates a new instance of a little Spider game, 
	 * SelectingCardsListener, and JLabels and JPanels,
	 * Constructor sets the appropriate gif files for the 
	 * top cards in each pile.
	 * Adds each pile to their respective JPanel, then adds 
	 * those JPanels to one gamePanel
	 */
	LittleSpiderGUI(){
		lsg = new LittleSpiderGame();
		scl = new SelectingCardsListener();
		tp1 = new JLabel();
		tp2 = new JLabel();
		tp3 = new JLabel();
		tp4 = new JLabel();
		tp5 = new JLabel();
		tp6 = new JLabel();
		tp7 = new JLabel();
		tp8 = new JLabel();
		home1 = new JLabel();
		home2 = new JLabel();
		home3 = new JLabel();
		home4 = new JLabel();
		tpHolder=new JPanel();
		homeHolder=new JPanel();
		gameScreen=new JPanel();
		tp1=scl.createDisplayImage(lsg.getTp1().topCard().getGifFile());
		tp2=scl.createDisplayImage(lsg.getTp2().topCard().getGifFile());
		tp3=scl.createDisplayImage(lsg.getTp3().topCard().getGifFile());
		tp4=scl.createDisplayImage(lsg.getTp4().topCard().getGifFile());
		tp5=scl.createDisplayImage(lsg.getTp5().topCard().getGifFile());
		tp6=scl.createDisplayImage(lsg.getTp6().topCard().getGifFile());
		tp7=scl.createDisplayImage(lsg.getTp7().topCard().getGifFile());
		tp8=scl.createDisplayImage(lsg.getTp8().topCard().getGifFile());
		tpHolder.add(new JLabel("Tableau"), BorderLayout.NORTH);
		tpHolder.add(tp1, BorderLayout.SOUTH);
		tpHolder.add(tp2, BorderLayout.SOUTH);
		tpHolder.add(tp3, BorderLayout.SOUTH);
		tpHolder.add(tp4, BorderLayout.SOUTH);
		tpHolder.add(tp5, BorderLayout.SOUTH);
		tpHolder.add(tp6, BorderLayout.SOUTH);
		tpHolder.add(tp7, BorderLayout.SOUTH);
		tpHolder.add(tp8, BorderLayout.SOUTH);
		home1=scl.createDisplayImage(lsg.getHome1().topCard().getGifFile());
		home2=scl.createDisplayImage(lsg.getHome2().topCard().getGifFile());
		home3=scl.createDisplayImage(lsg.getHome3().topCard().getGifFile());
		home4=scl.createDisplayImage(lsg.getHome4().topCard().getGifFile());
		homeHolder.add(new JLabel("HomeCell"), BorderLayout.NORTH);
		homeHolder.add(home1, BorderLayout.SOUTH);
		homeHolder.add(home2, BorderLayout.SOUTH);
		homeHolder.add(home3, BorderLayout.SOUTH);
		homeHolder.add(home4, BorderLayout.SOUTH);
		gameScreen.add(tpHolder, BorderLayout.NORTH);
		gameScreen.add(homeHolder, BorderLayout.SOUTH);
	}
	/**
	 * 
	 * @return gameScreen
	 */
	public JPanel getGameScreen() {
		return this.gameScreen;
	}

}
