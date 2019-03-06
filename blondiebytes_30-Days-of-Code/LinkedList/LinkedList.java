package linkedlist;

public class LinkedList<D> {

	// Properties
	Node<D> head;
	int count;
	
	// Constructors
	//public LinkedList() {
	 // must modify public void add() to handle the null case to use this
	//	head = null;
	//	count = 0;
		
	//}
	
	public LinkedList(Node<D> newHead) {
		head = newHead;
		count = 1;  
	}
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	// Methods
	// add
	public void add(D newData) {
		Node<D> temp = new Node(newData);
		Node<D> current = head;
		while(current.getNext() !=null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
		
	}
	
	//get
	public D get(int index) {
		//if (index <=0 ) {
		//	return -1; // better to return null but null isn't an 
			// int so you would have to handle the error which isn't being covered here
		// }
		Node<D> current = head;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
			
		}
		return current.getData();
	}
	
	//size
	public int size() {
		return count;
		
	}
	
	//isEmpty
	public boolean isEmpty() {
		return head == null;
		
	}
	
	//remove
	public void remove() {
		// remove from the back of the list
		Node<D> current = head;
		while (current.getNext().getNext() != null) {
			//won't work for a list of one node
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Alice");
		System.out.println(linkedlist);
		linkedlist.add("Alicey");
		System.out.println(linkedlist);
		
	}

}
