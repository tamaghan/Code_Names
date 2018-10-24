package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import Games.Game;

public class MenuListener extends JFrame implements ActionListener{
	/**
	 *creates fields for JMenuItems for each of the three selections: 
	 *exit, golf game, and little spider game.
	 *also field for a golfGUI and a Little Spider GUI,
	 *field for a gui, and a JFrame
	 *
	 */
	private JMenuItem golf;
	private JMenuItem ls;
	private JMenuItem exit;
	private GolfGUI golfGUI;
	private LittleSpiderGUI lsGUI;
	private GUI gui;
	private JFrame frame;
	/**
	 * 
	 * @param frame should be the JFrame for the Main method
	 * 
	 * Creates new menu item for golf game, little spider game, 
	 * and exit
	 */
	public MenuListener(JFrame frame) {
		golf = new JMenuItem("Golf");
		ls = new JMenuItem("Little Spider");
		exit = new JMenuItem("Exit");
		this.frame=frame;
		
	}
	/**
	 * exit menuListener exits program
	 *  golf and ls menuListeners not working
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(exit)) {
			System.exit(0);
		}
		if(arg0.getSource().equals(golf)) {
			golfGUI = new GolfGUI(); 
			frame.getContentPane().add(golfGUI.getGameScreen());
		}
		if(arg0.getSource().equals(ls)) {
			
			lsGUI = new LittleSpiderGUI();
			frame.getContentPane().add(lsGUI.getGameScreen());
		}
		
	}
	/**
	 *getters and setters for menu item fields 
	 *
	 */
	public JMenuItem getGolf() {
		return golf;
	}
	public void setGolf(JMenuItem golf) {
		this.golf = golf;
	}
	public JMenuItem getLs() {
		return ls;
	}
	public void setLs(JMenuItem ls) {
		this.ls = ls;
	}
	public JMenuItem getExit() {
		return exit;
	}
	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}

}
