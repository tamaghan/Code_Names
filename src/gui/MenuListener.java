package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

import Games.Game;

public class MenuListener extends JFrame implements ActionListener{

	private JMenuItem golf;
	private JMenuItem ls;
	private JMenuItem exit;
	private GUI gui;
	private JFrame frame;
	
	public MenuListener(JFrame frame) {
		golf = new JMenuItem("Golf");
		ls = new JMenuItem("Little Spider");
		exit = new JMenuItem("Exit");
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(exit)) {
			System.exit(0);
		}
		if(arg0.getSource().equals(golf)) {
			
		}
		if(arg0.getSource().equals(golf)) {
			
		}
		
	}
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
