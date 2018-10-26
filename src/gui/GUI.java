package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Deck.Card;
import Deck.Deck;
import Games.Game;
import pile.Pile;
/**
 * Defines GUI class.
 * @author  tamaghan , dandrijje, fmdestin, tbjackso
 *
 */
public class GUI {
	
	/**
	 * fields of the games,
	 * JPanel for the Game,
	 * original Label which holds the original pile
	 * newLabel which holds the new pile
	 * SelctingCardsListener 
	 */
	private Game g;
	private JLabel label;
	private SelectingCardsListener scl;
	private boolean cardSelected;
	private Card card;
	public Pile pile;
	private static final Border UNSELECTED_BORDER = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    private static final Border SELECTED_BORDER = BorderFactory.createMatteBorder(5, 5, 5, 5,
                                                                                Color.BLACK);
    
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
	 * @return a JPanel containing all cards, will be used for 
	 * the opening screen 
	 * 
	 * (easter eggs added when user clicks on the queen of clubs or the 3 of hearts
	 */
	public JPanel allCards() {
		scl = new SelectingCardsListener();
		JPanel panel = new JPanel();
		Deck d = new Deck();
		System.out.println(d.getCardDeck()[2].getGifFile());
		for(int i=0; i<52; i++) {
			JLabel l = new JLabel();
			l=scl.createDisplayImage(d.getCardDeck()[i].getGifFile());
			panel.add(l);
			if(i==11) {
				l.addMouseListener(new MouseListener() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
					}
					@Override
					public void mouseEntered(MouseEvent arg0) {
					}
					@Override
					public void mouseExited(MouseEvent arg0) {
					}
					@Override
					public void mousePressed(MouseEvent arg0) {
						JFrame f = new JFrame("Not A Virus ;)");
						JLabel eE = new JLabel();
						eE=scl.createDisplayImage("/PictureFolder/spider_man_marvel_mcu_marvel_games_universe.jpg");
						f.getContentPane().add(eE);
						f.setSize(800, 500);
						f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						f.setVisible(true);						
					}
					@Override
					public void mouseReleased(MouseEvent arg0) {
					}
				});
			}
			if(i==28) {
				l.addMouseListener(new MouseListener() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
					}
					@Override
					public void mouseEntered(MouseEvent arg0) {
					}
					@Override
					public void mouseExited(MouseEvent arg0) {
					}
					@Override
					public void mousePressed(MouseEvent arg0) {
						JFrame f = new JFrame("Not A Virus ;)");
						JLabel eE = new JLabel();
						eE=scl.createDisplayImage("/PictureFolder/maxresdefault.jpg");
						f.getContentPane().add(eE);
						f.setSize(1000, 800);
						f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						f.setVisible(true);						
					}
					@Override
					public void mouseReleased(MouseEvent arg0) {
					}
				});
			}
			
		}
		panel.setBackground(Color.DARK_GRAY);
		 
		return panel;
	}
	/**
	 * Method should select the card at the 
	 * top of the pile if no other has been selected, 
	 * also sets selectedCard equal to true
	 * 
	 * @param p is a pile 
	 * @return top card of pile
	 */
	public Card select(Pile p, JLabel label) {
		setPile(p);
		this.setCardSelected(true);
		this.setCard(p.topCard());
		setLabel(label);
		label.setBorder(SELECTED_BORDER);
	      label.repaint();
		return this.getCard();
	}
	/**
	 * method unselects cards and resets fields
	 */
	public void deselect() {
		this.setCardSelected(false);
		this.setCard(null);
		label.setBorder(UNSELECTED_BORDER);
	    label.repaint();
	    setLabel(null);
	    this.setPile(null);
		
	}
	/**
	 * 
	 * @return whether a card has been selected or not
	 */
	public boolean isCardSelected() {
		return cardSelected;
	}
	/**
	 * setter for cardSelected
	 * @param cardSelected
	 */
	public void setCardSelected(boolean cardSelected) {
		this.cardSelected = cardSelected;
	}
	/**
	 * getter for card
	 * @return
	 */
	public Card getCard() {
		return card;
	}
	/**
	 * setter for card
	 * @param card
	 */
	public void setCard(Card card) {
		this.card = card;
	}
	/**
	 * getter for label
	 * @return
	 */

	public JLabel getLabel() {
		return label;
	}
	/**
	 * setter for label
	 * @param label
	 */
	public void setLabel(JLabel label) {
		this.label = label;
	}
	/**
	 * getter for pile
	 * @return
	 */
	public Pile getPile() {
		return this.pile;
	}
	/**
	 * setter for pile
	 * @param pile
	 */
	public void setPile(Pile pile) {
		this.pile=pile;
	}
}
