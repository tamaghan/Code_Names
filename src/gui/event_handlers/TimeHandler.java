package gui.event_handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.Timer;

import GUI.GUI;
import code.Board;
import code.Location;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class TimerHandler implements ActionListener{
	/** Refers to present GUI instance. */
	private GUI _gui;
	/** A Board instance control the logic of this game. */
	private Board _b;
	/** Refers to the time which game player has to wait before the hint appears. */
	private int _timeForWaiting;
	/** True - during waiting period. False - showing the hint. */
	private boolean state;
	private boolean beforeturn;
	
	public TimerHandler(GUI gui, Board b) {
		_gui = gui;
		_b = b;
		_timeForWaiting = 3;
		state = true;
		beforeturn = _b.getTurn();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Timer timer = _gui.getTimer();
		boolean nowturn = _b.getTurn();
		if(state) {
			System.out.println(_timeForWaiting);
	        if(_timeForWaiting == 1) {
	        	timer.stop();
	        	if(beforeturn == nowturn && _b.getStatus() == 0) {
	        		try {
	        			FileInputStream assassinsound = new FileInputStream("hint.mp3");
	        			Player player = new Player(assassinsound);
	        			player.play();
	        			}catch (FileNotFoundException e1) {
	        				e1.printStackTrace();
	        			}catch (JavaLayerException e2) {
	            			e2.printStackTrace();
	            	    }   
	        
		        	JButton[][] btns = _gui.getLocButtons();
		        	Location[][] locs = _b.getlocations();
		        	for(int i = 0; i < 5; i++)
		        		for(int j = 0; j < 5; j++) {
		        			_gui.setLocationColor(btns[i][j], locs[i][j].getId());
		        			btns[i][j].setEnabled(false);
		        		}
			    	timer.setInitialDelay(5000);
			    	timer.restart();
		        	state = false;
	        	}
	        }
			_timeForWaiting --;
		}
		else{
	    	_gui.boardInTeamTurn();
	    	timer.stop();
		}
	}

}
