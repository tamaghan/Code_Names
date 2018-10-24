package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Deck.Card;
import Deck.Deck;
import Games.Game;
import pile.Pile;

public class GUI {
	
	/**
	 * fields of the games,
	 * original piles,
	 * new pile,
	 * JPanel for the Game,
	 * original Label which holds the original pile
	 * newLabel which holds the new pile
	 * SelctingCardsListener 
	 */
	private Game g;
	private Pile ogPile;
	private Pile newPile;
	private JPanel gamePanel;
	private JLabel ogLabel;
	private JLabel newLabel;
	private SelectingCardsListener scl;

	/**
	 * method should be generic to game type. 
	 * Must ensure top card is updated and being displayed 
	 * for each pile
	 */
	public void update() {
		
		ogLabel=scl.createDisplayImage(ogPile.topCard().getGifFile());
		newLabel=scl.createDisplayImage(ogPile.topCard().getGifFile());
		
	}
	/**
	 * 
	 * @return a JLabel containing an error message
	 * if a player tries to make an illegal move 
	 */
	public JLabel err(String param) {
		JLabel label = new JLabel();
		JOptionPane.showMessageDialog(label, param, "Error", JOptionPane.ERROR_MESSAGE);
		return label; 
	}
	/**
	 * 
	 * @param p1
	 * @param p2
	 * 
	 * will update the game gui if the move is valid
	 */
	public void makeMove(Pile p1, Pile p2, String p) {
		if(g.validMove(p1, p2)) {
			update();
		}else {
			gamePanel.add(err(p));
		}
		
	}
	/**
	 * 
	 * @return a JPanel containing all cards, will be used for 
	 * the opening screen 
	 */
	public JPanel allCards() {
		scl = new SelectingCardsListener();
		JPanel panel = new JPanel();
		Deck d = new Deck();
		System.out.println(d.getCardDeck()[2].getGifFile());
		for(int i=0; i<52; i++) {
			panel.add(scl.createDisplayImage(d.getCardDeck()[i].getGifFile()));
		}
		panel.setBackground(Color.DARK_GRAY);
		 
		return panel;
	}
	
}
