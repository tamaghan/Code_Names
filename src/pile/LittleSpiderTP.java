package pile;

import Deck.Card;
import Deck.Deck;
/**
 *  Class will define behavior of each Tableau pile in little spider game
 * @author tamaghan , dandrijje, fmdestin, 
 * @version 1.0 
 *
 */

public class LittleSpiderTP extends Pile{
	

	private boolean is;
	
	/**
	 * Class will define behavior of each Tableau pile in little spider game
	 */
//	public Card topCard() {
//		return super.topCard();
//	}
	
	@Override
	public void initialSetup(Deck d,Card[] c) {
		is=true;	
		for(int i = 0; i<6; i++) {
			this.pile[i]=c[i];
			size=size+1;
		}
	}

	@Override
	public boolean add(Card c) {
		boolean returnVal=false; 
		if(this.topCard().getRank()==c.getRank()+1||this.topCard().getRank()==c.getRank()-1) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}else if(this.topCard().getRank()==13&&c.getRank()==1) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}else if(this.topCard().getRank()==1&&c.getRank()==13) {
			pile[size]=c;
			size=size+1;
			returnVal=true;
		}
		return returnVal;
	}

	@Override
	public boolean remove() {
		if(size()==0) {
			return false;
		}
		pile[size()-1]=null;
		size=size-1;
		return true;
		
	}

	
	
	
	

}
