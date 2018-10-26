package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Games.LittleSpiderGame;
import pile.Pile;
/**
 * Defines GUI for little Spider game
 * @author  tamaghan , dandrijje, fmdestin, tbjackso
 *
 */
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
	private JFrame frame;
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
		frame=new JFrame("A8-404 Name Not Found: Little Spider");
		update();
	}
	/**
	 * 
	 * @return gameScreen
	 */
	public JPanel getGameScreen() {
		return this.gameScreen;
	}
	/**
	 * creates a gui for the game
	 */
	public void lsGUI(){
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
		tp1=scl.createDisplayImage(lsg.getTp1().topCard().getGifFile());
		tp2=scl.createDisplayImage(lsg.getTp2().topCard().getGifFile());
		tp3=scl.createDisplayImage(lsg.getTp3().topCard().getGifFile());
		tp4=scl.createDisplayImage(lsg.getTp4().topCard().getGifFile());
		tp5=scl.createDisplayImage(lsg.getTp5().topCard().getGifFile());
		tp6=scl.createDisplayImage(lsg.getTp6().topCard().getGifFile());
		tp7=scl.createDisplayImage(lsg.getTp7().topCard().getGifFile());
		tp8=scl.createDisplayImage(lsg.getTp8().topCard().getGifFile());
		home1=scl.createDisplayImage(lsg.getHome1().topCard().getGifFile());
		home2=scl.createDisplayImage(lsg.getHome2().topCard().getGifFile());
		home3=scl.createDisplayImage(lsg.getHome3().topCard().getGifFile());
		home4=scl.createDisplayImage(lsg.getHome4().topCard().getGifFile());
		tp1.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(lsg.getTp1().size()!=0) {
					if(!isCardSelected()) {
						select(lsg.getTp1(), tp1);
					}else {
						if(!getCard().equals(lsg.getTp1().topCard())) {
							if(validMove(lsg.getTp1())) {
								deselect();
							}else {
								err("The Card You Have Selected Cannot Be Moved Here");
							}
						}else {
							deselect();
						}
					}
				}
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
		tp2.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(lsg.getTp2().size()!=0) {
					if(!isCardSelected()) {
						select(lsg.getTp2(), tp2);
					}else {
						if(!getCard().equals(lsg.getTp2().topCard())) {
							if(validMove(lsg.getTp2())) {
								deselect();
							}else {
								err("The Card You Have Selected Cannot Be Moved Here");
							}
						}else {
							deselect();
						}
					}
				}
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
		tp3.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(lsg.getTp3().size()!=0) {
					if(!isCardSelected()) {
						select(lsg.getTp3(), tp3);
					}else {
						if(!getCard().equals(lsg.getTp3().topCard())) {
							if(validMove(lsg.getTp3())) {
								deselect();
							}else {
								err("The Card You Have Selected Cannot Be Moved Here");
							}
						}else {
							deselect();
						}
					}
				}
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
				if(lsg.getTp4().size()!=0) {
					if(!isCardSelected()) {
						select(lsg.getTp4(), tp4);
					}else {
						if(!getCard().equals(lsg.getTp4().topCard())) {
							if(validMove(lsg.getTp4())) {
								deselect();
							}else {
								err("The Card You Have Selected Cannot Be Moved Here");
							}
						}else {
							deselect();
						}
					}
				}
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
		tp5.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(lsg.getTp5().size()!=0) {
					if(!isCardSelected()) {
						select(lsg.getTp5(), tp5);
					}else {
						if(!getCard().equals(lsg.getTp5().topCard())) {
							if(validMove(lsg.getTp5())) {
								deselect();
							}else {
								err("The Card You Have Selected Cannot Be Moved Here");
							}
						}else {
							deselect();
						}
					}
				}
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
		tp6.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(lsg.getTp6().size()!=0) {
					if(!isCardSelected()) {
						select(lsg.getTp6(), tp6);
					}else {
						if(!getCard().equals(lsg.getTp6().topCard())) {
							if(validMove(lsg.getTp6())) {
								deselect();
							}else {
								err("The Card You Have Selected Cannot Be Moved Here");
							}
						}else {
							deselect();
						}
					}
				}
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
		tp7.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){if(lsg.getTp7().size()!=0) {
				if(!isCardSelected()) {
					select(lsg.getTp7(), tp7);
				}else {
					if(!getCard().equals(lsg.getTp7().topCard())) {
						if(validMove(lsg.getTp7())) {
							deselect();
						}else {
							err("The Card You Have Selected Cannot Be Moved Here");
						}
					}else {
						deselect();
					}
				}
			}
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
		tp8.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(lsg.getTp8().size()!=0) {
					if(!isCardSelected()) {
						select(lsg.getTp8(), tp8);
					}else {
						if(!getCard().equals(lsg.getTp8().topCard())) {
							if(validMove(lsg.getTp8())) {
								deselect();
							}else {
								err("The Card You Have Selected Cannot Be Moved Here");
							}
						}else {
							deselect();
						}
					}
				}
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
		home1.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(!isCardSelected()) {
					if(lsg.getHome1().size()>1) {
						select(lsg.getHome1(), home1);
					}else {
						err("This Card Cannot Be Removed");
					}
				}else {
					if(!getCard().equals(lsg.getHome1().topCard())) {
						if(validMove(lsg.getHome1())) {
							deselect();
						}else {
							err("The Card You Have Selected Cannot Be Moved Here");
						}
					}else {
						deselect();
					}
				}
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
		home2.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(!isCardSelected()) {
					if(lsg.getHome2().size()>1) {
						select(lsg.getHome2(), home2);
					}else {
						err("This Card Cannot Be Removed");
					}
				}else {
					if(!getCard().equals(lsg.getHome2().topCard())) {
						if(validMove(lsg.getHome2())) {
							deselect();
						}else {
							err("The Card You Have Selected Cannot Be Moved Here");
						}
					}else {
						deselect();
					}
				}
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
		home3.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
				if(!isCardSelected()) {
					if(lsg.getHome3().size()>1) {
						select(lsg.getHome3(), home3);
					}else {
						err("This Card Cannot Be Removed");
					}
				}else {
					if(!getCard().equals(lsg.getHome3().topCard())) {
						if(validMove(lsg.getHome3())) {
							deselect();
						}else {
							err("The Card You Have Selected Cannot Be Moved Here");
						}
					}else {
						deselect();
					}
				}
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
		home4.addMouseListener(new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e){
			}
			@Override
			public void mousePressed(MouseEvent e){
					if(!isCardSelected()) {
						if(lsg.getHome4().size()>1) {
							select(lsg.getHome4(), home4);
						}else {
							err("This Card Cannot Be Removed");
						}
					}else {
						if(!getCard().equals(lsg.getHome4().topCard())) {
							if(validMove(lsg.getHome4())) {
								deselect();
							}else {
								err("The Card You Have Selected Cannot Be Moved Here");
							}
						}else {
							deselect();
						}
					}
				
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
		tpHolder= new JPanel();
		tpHolder.add(new JLabel("Tableau"), BorderLayout.NORTH);
		tpHolder.add(tp1);
		tpHolder.add(tp2);
		tpHolder.add(tp3);
		tpHolder.add(tp4);
		tpHolder.add(tp5);
		tpHolder.add(tp6);
		tpHolder.add(tp7);
		tpHolder.add(tp8);
		homeHolder = new JPanel();
		homeHolder.add(new JLabel("HomeCell"), BorderLayout.NORTH);
		homeHolder.add(home1, BorderLayout.SOUTH);
		homeHolder.add(home2, BorderLayout.SOUTH);
		homeHolder.add(home3, BorderLayout.SOUTH);
		homeHolder.add(home4, BorderLayout.SOUTH);
		gameScreen = new JPanel();
		gameScreen.add(tpHolder, BorderLayout.NORTH);
		gameScreen.add(homeHolder, BorderLayout.SOUTH);
		gameScreen.add(tpHolder, BorderLayout.NORTH);
		gameScreen.add(homeHolder, BorderLayout.CENTER);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(gameScreen);
		frame.setVisible(true);
	}
	/**
	 * getter for JFrame
	 * @return
	 */
	public JFrame getFrame() {
		return frame;
	}
	/**
	 * setter for JFrame
	 * @param frame
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	/**
	 * determines if a move is valid and executes the move
	 * @param p
	 * @return
	 */
	public boolean validMove(Pile p) {
		if(p.add(getCard())) {
			getPile().remove();
			update();
			return true;
		}
		else return false;
	}
}
