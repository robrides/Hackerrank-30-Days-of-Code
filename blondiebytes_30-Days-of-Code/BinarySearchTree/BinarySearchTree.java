package binarysearchtree;

public interface Tree<D extends Comparable>{
	public boolean isEmpty();
	public int cardinality();
	public boolean member(D elt);
	public NonEmptyBST<D> add(D elt);
	
}

public class BinarySearchTree {

	public static void main(String[] args) {
		
	}
}
