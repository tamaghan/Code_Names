package Games;

import gui.SelectingCardsListener;
import pile.GolfTP;
import pile.Pile;
/**
 *creates new instance of SelectingCardsListener
 * @author  tamaghan , dandrijje, fmdestin, thomas
 *
 */
public abstract class Game {
	/**
	 * 
	 */
	SelectingCardsListener scl = new SelectingCardsListener();
	
	/**
	 * 
	 * @param ogPile original pile
	 * @param newPile pile where the user wants to place the card
	 * @return boolean whether the move is valid
	 */
	public boolean validMove(Pile ogPile, Pile newPile) {
		boolean returnVal=false;
		if(newPile.add(ogPile.topCard())) {
			returnVal = true; 
		}
		return returnVal;
	}
	

}
