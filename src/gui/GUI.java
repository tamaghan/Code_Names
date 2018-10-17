package gui;

import java.awt.event.ActionEvent;

public class GUI {
	
	public void exit(ActionEvent E) {
		if(E.getSource()=="Exit") {
			System.exit(0);
		}
	}
	
}
