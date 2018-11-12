package gui;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Games.ThievesGame;
import pile.Pile;
import pile.StackPile;

public class ThievesGUI extends GUI{
	/**
	 * field for ThievesGame
	 */
	private ThievesGame ftg;
	/**
	 * field Jpanel for the game screen
	 */
	private JPanel gameScreen;
	/**
	 * field JPanel to hold the homecell piles
	 */
	private JPanel homeHolder;
	/**
	 * field JPanel to hold tableau piles
	 */
	private JPanel tpHolder;
	/**
	 * field JPanel to hold stock pile
	 */
	private JPanel stockHolder;
	/**
	 * field JPanel to hold waste pile
	 */
	private JPanel wasteHolder;

	/**
	 * field JLabel for tp1
	 */
	private JLabel tp1;
	/**
	 * field JLabel for tp2
	 */
	private JLabel tp2;
	/**
	 * field JLabel for tp3
	 */
	private JLabel tp3;
	/**
	 * field JLabel for tp4
	 */
	private JLabel tp4;
	/**
	 * field JLabel for tp5
	 */
	private JLabel tp5;
	/**
	 * field JLabel for tp6
	 */
	private JLabel tp6;
	/**
	 * field JLabel for tp7
	 */
	private JLabel tp7;
	/**
	 * field JLabel for tp8
	 */
	private JLabel tp8;
	/**
	 * field JLabel for tp9
	 */
	private JLabel tp9;
	/**
	 * field JLabel for tp10
	 */
	private JLabel tp10;
	/**
	 * field JLabel for tp11
	 */
	private JLabel tp11;
	/**
	 * field JLabel for tp12
	 */
	private JLabel tp12;
	/**
	 * field JLabel for tp13
	 */
	private JLabel tp13;
	/**
	 * field JLabel for home1
	 */
	private JLabel home1;
	/**
	 * field JLabel for home2
	 */
	private JLabel home2;
	/**
	 * field JLabel for home3
	 */
	private JLabel home3;
	/**
	 * field JLabel for home4
	 */
	private JLabel home4;
	/**
	 * field JLabel for home5
	 */
	private JLabel home5;
	/**
	 * field JLabel for home6
	 */
	private JLabel home6;
	/**
	 * field JLabel for home7
	 */
	private JLabel home7;
	/**
	 * field JLabel for home8
	 */
	private JLabel home8;
	/**
	 * field JLabel for stock
	 */
	private JLabel stock;
	/**
	 * field JLabel for waste
	 */
	private JLabel waste;
	/**
	 * field for a new SelectingCardsListener
	 */
	private SelectingCardsListener scl;
	/**
	 * field for JFrame
	 */
	private JFrame frame;
	/**
	 * Constructor creates a new instance of a Thieves game,
	 * SelectingCardsListener, JLabels and JPanels 
	 * 
	 */
	public ThievesGUI() {
		ftg = new ThievesGame();
		scl = new SelectingCardsListener();
		tp1 = new JLabel();
		tp2 = new JLabel();
		tp3 = new JLabel();
		tp4 = new JLabel();
		tp5 = new JLabel();
		tp6 = new JLabel();
		tp7 = new JLabel();
		tp8 = new JLabel();
		tp9 = new JLabel();
		tp10 = new JLabel();
		tp11 = new JLabel();
		tp12 = new JLabel();
		tp13 = new JLabel();
		home1 = new JLabel();
		home2 = new JLabel();
		home3 = new JLabel();
		home4 = new JLabel();
		home5 = new JLabel();
		home6 = new JLabel();
		home7 = new JLabel();
		home8 = new JLabel();
		stock = new JLabel();
		waste = new JLabel();
		tpHolder=new JPanel();
		homeHolder=new JPanel();
		stockHolder=new JPanel();
		wasteHolder = new JPanel();
		gameScreen=new JPanel();
		frame=new JFrame("A8-404 Name Not Found: Fourty Theieves");
		update();
	}
	/**
	 * creates a gui for the game
	 */
	public void fTGUI(){
		frame.setSize(1250, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	/**
	 * update method ensures each pile shows the right 
	 * card after a legal move is made and adds mouselisteners with the 
	 * proper functionality
	 */
	public void update() {
		tp1=scl.createDisplayImage(ftg.getTp1().topCard().getGifFile());
		tp2=scl.createDisplayImage(ftg.getTp2().topCard().getGifFile());
		tp3=scl.createDisplayImage(ftg.getTp3().topCard().getGifFile());
		tp4=scl.createDisplayImage(ftg.getTp4().topCard().getGifFile());
		tp5=scl.createDisplayImage(ftg.getTp5().topCard().getGifFile());
		tp6=scl.createDisplayImage(ftg.getTp6().topCard().getGifFile());
		tp7=scl.createDisplayImage(ftg.getTp7().topCard().getGifFile());
		tp8=scl.createDisplayImage(ftg.getTp8().topCard().getGifFile());
		tp9=scl.createDisplayImage(ftg.getTp9().topCard().getGifFile());
		tp10=scl.createDisplayImage(ftg.getTp10().topCard().getGifFile());
		tp11=scl.createDisplayImage(ftg.getTp11().topCard().getGifFile());
		tp12=scl.createDisplayImage(ftg.getTp12().topCard().getGifFile());
		tp13=scl.createDisplayImage(ftg.getTp13().topCard().getGifFile());
		home1=scl.createDisplayImage(ftg.getHome1().topCard().getGifFile());
		home2=scl.createDisplayImage(ftg.getHome2().topCard().getGifFile());
		home3=scl.createDisplayImage(ftg.getHome3().topCard().getGifFile());
		home4=scl.createDisplayImage(ftg.getHome4().topCard().getGifFile());
		home5=scl.createDisplayImage(ftg.getHome5().topCard().getGifFile());
		home6=scl.createDisplayImage(ftg.getHome6().topCard().getGifFile());
		home7=scl.createDisplayImage(ftg.getHome7().topCard().getGifFile());
		home8=scl.createDisplayImage(ftg.getHome8().topCard().getGifFile());
		stock=scl.createDisplayImage(ftg.getStock().topCard().getGifFile());
		waste=scl.createDisplayImage(ftg.getWaste().topCard().getGifFile());
		tp1.addMouseListener(new MouseListener() {
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
				if(ftg.getTp1().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp1(), tp1);
					}else {
						if(!getCard().equals(ftg.getTp1().topCard())) {
							if(validMove(ftg.getTp1())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp2.addMouseListener(new MouseListener() {
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
				if(ftg.getTp2().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp2(), tp2);
					}else {
						if(!getCard().equals(ftg.getTp2().topCard())) {
							if(validMove(ftg.getTp2())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp3.addMouseListener(new MouseListener() {
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
				if(ftg.getTp3().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp3(), tp3);
					}else {
						if(!getCard().equals(ftg.getTp3().topCard())) {
							if(validMove(ftg.getTp3())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp4.addMouseListener(new MouseListener() {
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
				if(ftg.getTp4().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp4(), tp4);
					}else {
						if(!getCard().equals(ftg.getTp4().topCard())) {
							if(validMove(ftg.getTp4())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp5.addMouseListener(new MouseListener() {
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
				if(ftg.getTp5().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp5(), tp5);
					}else {
						if(!getCard().equals(ftg.getTp5().topCard())) {
							if(validMove(ftg.getTp5())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp6.addMouseListener(new MouseListener() {
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
				if(ftg.getTp6().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp6(), tp6);
					}else {
						if(!getCard().equals(ftg.getTp6().topCard())) {
							if(validMove(ftg.getTp6())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp7.addMouseListener(new MouseListener() {
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
				if(ftg.getTp7().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp7(), tp7);
					}else {
						if(!getCard().equals(ftg.getTp7().topCard())) {
							if(validMove(ftg.getTp7())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp8.addMouseListener(new MouseListener() {
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
				if(ftg.getTp8().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp8(), tp8);
					}else {
						if(!getCard().equals(ftg.getTp8().topCard())) {
							if(validMove(ftg.getTp8())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp9.addMouseListener(new MouseListener() {
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
				if(ftg.getTp9().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp9(), tp9);
					}else {
						if(!getCard().equals(ftg.getTp9().topCard())) {
							if(validMove(ftg.getTp9())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp10.addMouseListener(new MouseListener() {
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
				if(ftg.getTp10().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp10(), tp10);
					}else {
						if(!getCard().equals(ftg.getTp10().topCard())) {
							if(validMove(ftg.getTp10())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp11.addMouseListener(new MouseListener() {
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
				if(ftg.getTp11().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp11(), tp11);
					}else {
						if(!getCard().equals(ftg.getTp11().topCard())) {
							if(validMove(ftg.getTp11())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp12.addMouseListener(new MouseListener() {
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
				if(ftg.getTp12().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp12(), tp12);
					}else {
						if(!getCard().equals(ftg.getTp12().topCard())) {
							if(validMove(ftg.getTp12())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		tp13.addMouseListener(new MouseListener() {
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
				if(ftg.getTp13().getSize()>0) {
					if(!isCardSelected()) {
						select(ftg.getTp13(), tp13);
					}else {
						if(!getCard().equals(ftg.getTp13().topCard())) {
							if(validMove(ftg.getTp13())) {
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
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		home1.addMouseListener(new MouseListener() {
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
				if(!isCardSelected()) {
					err("This Card Cannot Be Selected");
				}else {
					if(validMove(ftg.getHome1())) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		home2.addMouseListener(new MouseListener() {
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
				if(!isCardSelected()) {
					err("This Card Cannot Be Selected");
				}else {
					if(validMove(ftg.getHome2())) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		home3.addMouseListener(new MouseListener() {
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
				if(!isCardSelected()) {
					err("This Card Cannot Be Selected");
				}else {
					if(validMove(ftg.getHome3())) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		home4.addMouseListener(new MouseListener() {
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
				if(!isCardSelected()) {
					err("This Card Cannot Be Selected");
				}else {
					if(validMove(ftg.getHome4())) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		home5.addMouseListener(new MouseListener() {
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
				if(!isCardSelected()) {
					err("This Card Cannot Be Selected");
				}else {
					if(validMove(ftg.getHome5())) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		home6.addMouseListener(new MouseListener() {
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
				if(!isCardSelected()) {
					err("This Card Cannot Be Selected");
				}else {
					if(validMove(ftg.getHome6())) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		home7.addMouseListener(new MouseListener() {
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
				if(!isCardSelected()) {
					err("This Card Cannot Be Selected");
				}else {
					if(validMove(ftg.getHome7())) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		home8.addMouseListener(new MouseListener() {
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
				if(!isCardSelected()) {
					err("This Card Cannot Be Selected");
				}else {
					if(validMove(ftg.getHome8())) {
						deselect();
					}else {
						err("The Card You Have Selected Cannot Be Moved Here");
					}
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {	
			}
		});
		stock.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(ftg.getStock().getSize()>0) {
					if(isCardSelected()) {
						err("No Cards Can Be Added To The Stock Pile");
					}else {
						ftg.getWaste().getSPile().push(ftg.getStock().getSPile().pop());
						update();
					}
				}

			}
			@Override
			public void mouseReleased(MouseEvent e) {	
			}
		});
		waste.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(!isCardSelected()) {
					select(ftg.getWaste(), waste);
				}else if(!getCard().equals(ftg.getWaste().topCard())) {
					err("This Card Cannot Be Added To The Waste Pile");
				}else {
					deselect();
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {	
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
		tpHolder.add(tp9);
		tpHolder.add(tp10);
		tpHolder.add(tp11);
		tpHolder.add(tp12);
		tpHolder.add(tp13);
		homeHolder = new JPanel();
		homeHolder.add(new JLabel("HomeCell"), BorderLayout.NORTH);
		homeHolder.add(home1, BorderLayout.SOUTH);
		homeHolder.add(home2, BorderLayout.SOUTH);
		homeHolder.add(home3, BorderLayout.SOUTH);
		homeHolder.add(home4, BorderLayout.SOUTH);
		homeHolder.add(home5, BorderLayout.SOUTH);
		homeHolder.add(home6, BorderLayout.SOUTH);
		homeHolder.add(home7, BorderLayout.SOUTH);
		homeHolder.add(home8, BorderLayout.SOUTH);
		stockHolder = new JPanel();
		stockHolder.add(new JLabel("Stock"), BorderLayout.NORTH);
		stockHolder.add(stock, BorderLayout.SOUTH);
		wasteHolder = new JPanel();
		wasteHolder.add(new JLabel("Waste"), BorderLayout.NORTH);
		wasteHolder.add(waste, BorderLayout.SOUTH);
		gameScreen = new JPanel();
		gameScreen.add(tpHolder, BorderLayout.NORTH);
		gameScreen.add(homeHolder, BorderLayout.SOUTH);
		gameScreen.add(stockHolder, BorderLayout.NORTH);
		gameScreen.add(wasteHolder, BorderLayout.CENTER);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(gameScreen);
		frame.setVisible(true);
	}
	/**
	 * 
	 * @return true if move is valid or false if not
	 */
	public boolean validMove(StackPile p) {
		if(p.add(getCard())) {
			getPile().remove();
			update();
			return true;
		}
		else return false;
	}

	/**
	 * getter for ftg
	 * @return ftg
	 */
	public ThievesGame getFtg() {
		return ftg;
	}
	/**
	 * setter for ftg
	 * @param ftg
	 */
	public void setFtg(ThievesGame ftg) {
		this.ftg = ftg;
	}
	/**
	 * getter for gameScreen
	 * @return gameScreen
	 */
	public JPanel getGameScreen() {
		return gameScreen;
	}
	/**
	 * setter for gameScreen
	 * @param gameScreen
	 */
	public void setGameScreen(JPanel gameScreen) {
		this.gameScreen = gameScreen;
	}
	/**
	 * getter for homeHolder
	 * @return homeHolder
	 */
	public JPanel getHomeHolder() {
		return homeHolder;
	}
	/**
	 * setter for homeHolder
	 * @param homeHolder
	 */
	public void setHomeHolder(JPanel homeHolder) {
		this.homeHolder = homeHolder;
	}
	/**
	 * getter for tpHolder
	 * @return tpHolder
	 */ 
	public JPanel getTpHolder() {
		return tpHolder;
	}
	/**
	 * setter for tpHolder
	 * @param tpHolder
	 */
	public void setTpHolder(JPanel tpHolder) {
		this.tpHolder = tpHolder;
	}
	/**
	 * getter for stockHolder
	 * @return stockHolder
	 */
	public JPanel getStockHolder() {
		return stockHolder;
	}
	/**
	 * setter for stockHolder
	 * @param stockHolder
	 */
	public void setStockHolder(JPanel stockHolder) {
		this.stockHolder = stockHolder;
	}
	/**
	 * getter for wasteHolder
	 * @return wasteHolder
	 */
	public JPanel getWasteHolder() {
		return wasteHolder;
	}
	/**
	 * setter for wasteHolder
	 * @param wasteHolder
	 */
	public void setWasteHolder(JPanel wasteHolder) {
		this.wasteHolder = wasteHolder;
	}
	/**
	 * getter for tp1
	 * @return tp1
	 */
	public JLabel getTp1() {
		return tp1;
	}
	/**
	 * setter for tp1
	 * @param tp1
	 */
	public void setTp1(JLabel tp1) {
		this.tp1 = tp1;
	}
	/**
	 * getter for tp2
	 * @return tp2
	 */
	public JLabel getTp2() {
		return tp2;
	}
	/**
	 * setter for tp2
	 * @param tp2
	 */
	public void setTp2(JLabel tp2) {
		this.tp2 = tp2;
	}
	/**
	 * getter for tp3
	 * @return tp3
	 */
	public JLabel getTp3() {
		return tp3;
	}
	/**
	 * setter for tp3
	 * @param tp3
	 */
	public void setTp3(JLabel tp3) {
		this.tp3 = tp3;
	}
	/**
	 * getter for tp4
	 * @return tp4
	 */
	public JLabel getTp4() {
		return tp4;
	}
	/**
	 * setter for tp4
	 * @param tp4
	 */
	public void setTp4(JLabel tp4) {
		this.tp4 = tp4;
	}
	/**
	 * getter for tp5
	 * @return tp4
	 */
	public JLabel getTp5() {
		return tp5;
	}
	/**
	 * setter for tp5
	 * @param tp5
	 */
	public void setTp5(JLabel tp5) {
		this.tp5 = tp5;
	}
	/**
	 * getter for tp6
	 * @return tp6
	 */
	public JLabel getTp6() {
		return tp6;
	}
	/**
	 * setter for tp6
	 * @param tp6
	 */
	public void setTp6(JLabel tp6) {
		this.tp6 = tp6;
	}
	/**
	 * getter for tp7
	 * @return tp7
	 */
	public JLabel getTp7() {
		return tp7;
	}
	/**
	 * setter for tp7
	 * @param tp7
	 */
	public void setTp7(JLabel tp7) {
		this.tp7 = tp7;
	}
	/**
	 * getter for tp8
	 * @return tp8
	 */
	public JLabel getTp8() {
		return tp8;
	}
	/**
	 * setter for tp8
	 * @param tp8
	 */
	public void setTp8(JLabel tp8) {
		this.tp8 = tp8;
	}
	/**
	 * getter for tp9
	 * @return tp9
	 */
	public JLabel getTp9() {
		return tp9;
	}
	/**
	 * setter for tp9
	 * @param tp9
	 */
	public void setTp9(JLabel tp9) {
		this.tp9 = tp9;
	}
	/**
	 * getter for tp10
	 * @return tp10
	 */
	public JLabel getTp10() {
		return tp10;
	}
	/**
	 * setter for tp10
	 * @param tp10
	 */
	public void setTp10(JLabel tp10) {
		this.tp10 = tp10;
	}
	/**
	 * getter for tp11
	 * @return tp11
	 */
	public JLabel getTp11() {
		return tp11;
	}
	/**
	 * setter for tp11
	 * @param tp11
	 */
	public void setTp11(JLabel tp11) {
		this.tp11 = tp11;
	}
	/**
	 * getter for tp12
	 * @return tp12
	 */
	public JLabel getTp12() {
		return tp12;
	}
	/**
	 * setter for tp12
	 * @param tp12
	 */
	public void setTp12(JLabel tp12) {
		this.tp12 = tp12;
	}
	/**
	 * getter for tp13
	 * @return tp13
	 */
	public JLabel getTp13() {
		return tp13;
	}
	/**
	 * setter for tp13
	 * @param tp13
	 */
	public void setTp13(JLabel tp13) {
		this.tp13 = tp13;
	}
	/**
	 * getter for scl
	 * @return scl
	 */
	public SelectingCardsListener getScl() {
		return scl;
	}
	/**
	 * setter for scl
	 * @param scl
	 */
	public void setScl(SelectingCardsListener scl) {
		this.scl = scl;
	}
	/**
	 * getter for frame
	 * @return frame
	 */
	public JFrame getFrame() {
		return frame;
	}
	/**
	 * setter for frame
	 * @param frame
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	/**
	 * getter for home1
	 * @return home1
	 */
	public JLabel getHome1() {
		return home1;
	}
	/**
	 * setter for home1
	 * @param home1
	 */
	public void setHome1(JLabel home1) {
		this.home1 = home1;
	}
	/**
	 * getter for home2
	 * @return home2
	 */
	public JLabel getHome2() {
		return home2;
	}
	/**
	 * setter for home2
	 * @param home2
	 */
	public void setHome2(JLabel home2) {
		this.home2 = home2;
	}
	/**
	 * getter for home3
	 * @return home3
	 */
	public JLabel getHome3() {
		return home3;
	}
	/**
	 * setter for home3
	 * @param home3
	 */
	public void setHome3(JLabel home3) {
		this.home3 = home3;
	}
	/**
	 * getter for home4
	 * @return home4
	 */
	public JLabel getHome4() {
		return home4;
	}
	/**
	 * setter for home4
	 * @param home4
	 */
	public void setHome4(JLabel home4) {
		this.home4 = home4;
	}
	/**
	 * getter for home5
	 * @return home5
	 */
	public JLabel getHome5() {
		return home5;
	}
	/**
	 * setter for home5
	 * @param home5
	 */
	public void setHome5(JLabel home5) {
		this.home5 = home5;
	}
	/**
	 * getter for home6
	 * @return home6
	 */
	public JLabel getHome6() {
		return home6;
	}
	/**
	 * setter for home6
	 * @param home6
	 */
	public void setHome6(JLabel home6) {
		this.home6 = home6;
	}
	/**
	 * getter for home7
	 * @return home7
	 */
	public JLabel getHome7() {
		return home7;
	}
	/**
	 * setter for home7
	 * @param home7
	 */
	public void setHome7(JLabel home7) {
		this.home7 = home7;
	}
	/**
	 * getter for home8
	 * @return home8
	 */
	public JLabel getHome8() {
		return home8;
	}
	/**
	 * setter for home8
	 * @param home8
	 */
	public void setHome8(JLabel home8) {
		this.home8 = home8;
	}
	/**
	 * getter for stock
	 * @return stock
	 */
	public JLabel getStock() {
		return stock;
	}
	/**
	 * setter for stock
	 * @param stock
	 */
	public void setStock(JLabel stock) {
		this.stock = stock;
	}
	/**
	 * getter for waste
	 * @return waste
	 */
	public JLabel getWaste() {
		return waste;
	}
	/**
	 * setter for waste
	 * @param waste
	 */
	public void setWaste(JLabel waste) {
		this.waste = waste;
	}
}
