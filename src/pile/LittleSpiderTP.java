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
	
	@Override
	public void initialSetup(Deck d,Card[] c) {
		is=true;
		int size = d.getDeckSize();
		for(int i = 0; i<6; i++) {
			this.getPile()[i]=c[size-1-i];
			this.setSize(this.size()+1);
			d.setDeckSize(d.getDeckSize()-1); 
		}
	}

	@Override
	public boolean add(Card c) {
		boolean returnVal=false; 
		if(this.topCard().getRank()==c.getRank()+1||this.topCard().getRank()==c.getRank()-1) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}else if(this.topCard().getRank()==13&&c.getRank()==1) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}else if(this.topCard().getRank()==1&&c.getRank()==13) {
			this.getPile()[size()]=c;
			this.setSize(size()+1);
			returnVal=true;
		}
		return returnVal;
	}

	@Override
	public boolean remove() {
		if(size()==0) {
			return false;
		}
		this.getPile()[size()-1]=null;
		this.setSize(size()-1);
		return true;
		
	}

	
	
	
	

}
