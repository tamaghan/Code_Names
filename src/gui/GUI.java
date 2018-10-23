package gui;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Deck.Card;
import Games.Game;
import pile.Pile;

public class GUI {
	
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
	public JLabel err() {
		JLabel label = new JLabel();
		JOptionPane.showMessageDialog(label, "Invalid Move", "Error", JOptionPane.ERROR_MESSAGE);
		return label; 
	}
	
	public void makeMove(Pile p1, Pile p2) {
		if(g.validMove(p1, p2)) {
			update();
		}else {
			gamePanel.add(err());
		}
	}
	
}
