package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class Main {
	
	/**
	 * code to make the JFrame and gui
	 */
	public static void gameGUI() {
	
	
		JFrame frame = new JFrame("404 Name Not Found");
		frame.setSize(600, 400);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    GUI gui = new GUI();
	    MenuListener action = new MenuListener();
	    JMenuBar bar = new JMenuBar(); 
		JMenu menu = new JMenu("New Game");
		JMenuItem golf = new JMenuItem("Golf");
		action.setGolf(golf);
		JMenuItem ls = new JMenuItem("Little Spider");
		action.setLs(ls);
		JMenuItem exit = new JMenuItem("Exit");
		action.setExit(exit);
		exit.addActionListener(action);
		menu.add(golf);
		menu.add(ls);
		menu.add(exit);
		bar.add(menu);
		frame.setJMenuBar(bar);
	    frame.setVisible(true);
	}
	
	
	public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                gameGUI();
            }
        });
//		new Main();
	}

}
