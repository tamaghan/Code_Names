package pile;

public interface Pile {
	abstract void initialSetup();
	abstract boolean add(Card c);
	abstract boolean remove(Card c);

}
