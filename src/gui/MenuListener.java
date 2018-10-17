package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

public class MenuListener extends JFrame implements ActionListener{

	private JMenuItem golf = new JMenuItem("Golf");
	private JMenuItem ls = new JMenuItem("Little Spider");
	private JMenuItem exit = new JMenuItem("Exit");
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
