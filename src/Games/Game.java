package Games;

import gui.SelectingCardsListener;
import pile.GolfTP;
import pile.Pile;

public abstract class Game {
	
	SelectingCardsListener scl = new SelectingCardsListener();
	
	public boolean validMove(Pile ogPile, Pile newPile) {
		boolean returnVal=false;
		if(newPile.add(ogPile.topCard())) {
			returnVal = true; 
		}
		return returnVal;
	}
	

}
