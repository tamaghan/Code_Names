package pile;

import Deck.Card;
import Deck.Deck;

/**
 *   Class will define behavior of each Tableau pile in golf game
 * @author tamaghan , dandrijje, fmdestin, 
 * @version 1.0 
 *
 */

public class GolfTP extends Pile{

	@Override
	public void initialSetup() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean add(Card c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}
	public Card topCard() {
		return super.topCard();
	}
	
	
}
