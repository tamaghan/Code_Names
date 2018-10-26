package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import Games.Game;
/**
 * Defines Menulistener class which will be used for menuItems
 * @author  tamaghan , dandrijje, fmdestin, tbjackso
 *
 */
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
	public MenuListener() {
		golf = new JMenuItem("Golf");
		ls = new JMenuItem("Little Spider");
		exit = new JMenuItem("Exit");
		this.frame=new JFrame();
		
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
			golfGUI.golfGUI();
		}
		if(arg0.getSource().equals(ls)) {
			lsGUI = new LittleSpiderGUI();
			lsGUI.lsGUI();
		}
		
	}
	/**
	 *getter for golf 
	 *
	 */
	public JMenuItem getGolf() {
		return golf;
	}
	/**
	 * setter for golf
	 * @param golf
	 */
	public void setGolf(JMenuItem golf) {
		this.golf = golf;
	}
	/**
	 * getter for ls
	 * @return
	 */
	public JMenuItem getLs() {
		return ls;
	}
	/**
	 * setter for ls
	 * @param ls
	 */
	public void setLs(JMenuItem ls) {
		this.ls = ls;
	}
	/**
	 * getter for exit
	 * @return
	 */
	public JMenuItem getExit() {
		return exit;
	}
	/**
	 * setter for exit
	 * @param exit
	 */
	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}
	/**
	 * getter for lsBoolean
	 * @return
	 */


}
