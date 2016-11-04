/**
 *
 */

public class Pair<E> {
    private E first;
    private E second;
    public Pair( E f, E sec ) {
	this.first = f;
	this.second = sec;
    }
    public E getFirst( ) {
	return first;
    }
    public E getSecond( ) {
	return second;
    }
}
