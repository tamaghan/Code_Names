package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import Deck.Card;
import Deck.Deck;
import Games.GolfGame;
import Games.LittleSpiderGame;
import pile.GolfTP;
import pile.SpiderHomecellPile;

public class Main {
	
	/**
	 * code to make the JFrame and gui
	 */
	public static void gameGUI() {
	
	
		JFrame frame = new JFrame("A8-404 Name Not Found");
		frame.setSize(1200, 600);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    MenuListener action = new MenuListener();
	    
	    LittleSpiderGUI lsg = new LittleSpiderGUI();
	    GolfGUI gg = new GolfGUI();
	    
	    JMenuBar bar = new JMenuBar(); 
		JMenu menu = new JMenu("New Game");
		JMenuItem golf = new JMenuItem("Golf");
		action.setGolf(golf);
		JMenuItem ls = new JMenuItem("Little Spider");
		action.setLs(ls);
		JMenuItem exit = new JMenuItem("Exit");
		action.setExit(exit);
		golf.addActionListener(action);
		ls.addActionListener(action);
		exit.addActionListener(action);
		
		menu.add(golf);
		menu.add(ls);
		menu.add(exit);
		bar.add(menu);
		frame.setJMenuBar(bar);
		frame.getContentPane().add(gg.allCards());
	    frame.setVisible(true);
	}
	
	/**
	 * 
	 * @param args
	 * 
	 * runs game
	 * 
	 */
	public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gameGUI();
            }
        });
//		LittleSpiderGame lsg = new LittleSpiderGame();
//		GolfGame gg = new GolfGame();
//		SelectingCardsListener scl = new SelectingCardsListener();
//		
//		Deck d = new Deck();
//		SpiderHomecellPile home1 = new SpiderHomecellPile();
//		SpiderHomecellPile home2 = new SpiderHomecellPile();
//		SpiderHomecellPile home3 = new SpiderHomecellPile();
//		SpiderHomecellPile home4 = new SpiderHomecellPile();
//		home1.initialSetup(d, home1);
//		home1.initialSetup(d, home2);
//		home1.initialSetup(d, home3);
//		home1.initialSetup(d, home4);
//			System.out.println(d.getCardDeck()[0]);
//			System.out.println(d.getCardDeck()[1]);
//			System.out.println(d.getCardDeck()[2]);
//			System.out.println(d.getCardDeck()[3]);
//			System.out.println(d.getCardDeck()[4]);
//			System.out.println(d.getCardDeck()[5]);
//			System.out.println(d.getCardDeck()[6]);
//			System.out.println(d.getCardDeck()[7]);
//			System.out.println(d.getCardDeck()[8]);
//			System.out.println(d.getCardDeck()[9]);
//			System.out.println(d.getCardDeck()[10]);
//			System.out.println(d.getCardDeck()[11]);
//			System.out.println(d.getCardDeck()[12]);
//			System.out.println(d.getCardDeck()[13]);
//			System.out.println(d.getCardDeck()[14]);
//			System.out.println(d.getCardDeck()[15]);
//			System.out.println(d.getCardDeck()[16]);
//			System.out.println(d.getCardDeck()[17]);
//			System.out.println(d.getCardDeck()[18]);
//			System.out.println(d.getCardDeck()[19]);
//			System.out.println(d.getCardDeck()[20]);
//			System.out.println(d.getCardDeck()[21]);
//			System.out.println(d.getCardDeck()[22]);
//			System.out.println(d.getCardDeck()[23]);
//			System.out.println(d.getCardDeck()[24]);
//			System.out.println(d.getCardDeck()[25]);
//			System.out.println(d.getCardDeck()[26]);
//			System.out.println(d.getCardDeck()[27]);
//			System.out.println(d.getCardDeck()[28]);
//			System.out.println(d.getCardDeck()[29]);
//			System.out.println(d.getCardDeck()[30]);
//			System.out.println(d.getCardDeck()[31]);
//			System.out.println(d.getCardDeck()[32]);
//			System.out.println(d.getCardDeck()[33]);
//			System.out.println(d.getCardDeck()[34]);
//			System.out.println(d.getCardDeck()[35]);
//			System.out.println(d.getCardDeck()[36]);
//			System.out.println(d.getCardDeck()[37]);
//			System.out.println(d.getCardDeck()[38]);
//			System.out.println(d.getCardDeck()[39]);
//			System.out.println(d.getCardDeck()[40]);
//			System.out.println(d.getCardDeck()[41]);
//			System.out.println(d.getCardDeck()[42]);
//			System.out.println(d.getCardDeck()[43]);
//			System.out.println(d.getCardDeck()[44]);
//			System.out.println(d.getCardDeck()[45]);
//			System.out.println(d.getCardDeck()[46]);
//			System.out.println(d.getCardDeck()[47]);
//		
//		
//		
//		System.out.println("1: "+scl.createDisplayImage(lsg.getHome1().topCard().getGifFile()));
//		System.out.println("2: "+scl.createDisplayImage(lsg.getHome2().topCard().getGifFile()));
//		System.out.println("3: "+scl.createDisplayImage(lsg.getHome3().topCard().getGifFile()));
//		System.out.println("4: "+scl.createDisplayImage(lsg.getHome4().topCard().getGifFile()));
//		System.out.println("5: "+scl.createDisplayImage("/PictureFolder/green.gif"));//golf homecell
//		System.out.println("6: "+scl.createDisplayImage(gg.getTp1().topCard().getGifFile()));
//		System.out.println("7: "+scl.createDisplayImage(gg.getTp2().topCard().getGifFile()));
//		System.out.println("8: "+scl.createDisplayImage(gg.getTp3().topCard().getGifFile()));
//		System.out.println("9: "+scl.createDisplayImage(gg.getTp4().topCard().getGifFile()));
//		System.out.println("10: "+scl.createDisplayImage(gg.getTp5().topCard().getGifFile()));
//		System.out.println("11: "+scl.createDisplayImage(gg.getTp6().topCard().getGifFile()));
//		System.out.println("12: "+scl.createDisplayImage(gg.getTp7().topCard().getGifFile()));
//		System.out.println("13: "+scl.createDisplayImage(gg.getStock().topCard().getGifFile()));
//		System.out.println("14: "+scl.createDisplayImage(lsg.getTp1().topCard().getGifFile()));
//		System.out.println("15: "+scl.createDisplayImage(lsg.getTp2().topCard().getGifFile()));
//		System.out.println("16: "+scl.createDisplayImage(lsg.getTp3().topCard().getGifFile()));
//		System.out.println("17: "+scl.createDisplayImage(lsg.getTp4().topCard().getGifFile()));
//		System.out.println("18: "+scl.createDisplayImage(lsg.getTp5().topCard().getGifFile()));
//		System.out.println("19: "+scl.createDisplayImage(lsg.getTp6().topCard().getGifFile()));
//		System.out.println("20: "+scl.createDisplayImage(lsg.getTp7().topCard().getGifFile()));
//		System.out.println("21: "+scl.createDisplayImage(lsg.getTp8().topCard().getGifFile()));
		
	}

}
