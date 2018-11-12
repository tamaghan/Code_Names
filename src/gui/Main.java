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
import Deck.DoubleDeck;
import Games.GolfGame;
import Games.LittleSpiderGame;
import Games.ThievesGame;
import pile.GolfTP;
import pile.SpiderHomecellPile;
import pile.ThievesHomecell;
/**
 * Defines Main class: only class to contain main method
 * @author  tamaghan , dandrijje, fmdestin, tbjackso
 *
 */
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
	    ThievesGUI ftG = new ThievesGUI();
	    
	    JMenuBar bar = new JMenuBar(); 
		JMenu menu = new JMenu("New Game");
		JMenuItem golf = new JMenuItem("Golf");
		action.setGolf(golf);
		JMenuItem ls = new JMenuItem("Little Spider");
		action.setLs(ls);
		JMenuItem fT = new JMenuItem("Fourty Thieves");
		action.setFT(fT);
		JMenuItem exit = new JMenuItem("Exit");
		action.setExit(exit);
		golf.addActionListener(action);
		ls.addActionListener(action);
		fT.addActionListener(action);
		exit.addActionListener(action);
		
		menu.add(golf);
		menu.add(ls);
		menu.add(fT);
		menu.add(exit);
		bar.add(menu);
		frame.setJMenuBar(bar);
		frame.getContentPane().add(gg.allCards());
	    frame.setVisible(true);
	}
	
	/**
	 * runs game
	 * @param args
	 */
	public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gameGUI();
            }
        });

		
	}

}
