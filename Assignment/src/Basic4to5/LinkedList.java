package Basic4to5;
class ListNode {
	
	protected Object data;
    protected ListNode next;
	
	public void setData(Object data) {
		this.data = data; }

	public void setNext(ListNode next) {
		this.next = next; }

	ListNode(Object o) {
		data = o;
		next = null; }

	ListNode(Object o, ListNode nextNode) {
		data = o;
		next = nextNode;
	}

	public Object getData() {
		return data;
	}

	public ListNode getNext() {
		return next;
	}
} // class ListNode


//------------------------------------------------------------------

class EmptyListException extends RuntimeException {
	public EmptyListException() {
		super("List is empty");
	}
} // class EmptyListException


//-------------------------------------------------------------------

class LinkedList {
	
	private ListNode head;
	private ListNode tail;
	
	public LinkedList() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public void addToHead(Object item) {
		if (isEmpty()) {
			this.head = this.tail = new ListNode(item);
		} else {
			ListNode temp = this.head;
			this.head = new ListNode(item, temp);
			this.head.setNext(temp);
		}
	}

	public void addToTail(Object item) {
		if (isEmpty()) {
			this.head = this.tail = new ListNode(item);
		} else {
			this.tail.setNext(new ListNode(item));
			this.tail = this.tail.getNext();
		}
	}

	public Object removeFromHead() throws EmptyListException {

		Object item = null;

		if (isEmpty()) {
			throw new EmptyListException();
		}

		item = head.getData();

		if (this.head == this.tail) { //Check is head same as tail
			this.head = this.tail = null; 
		} else { // Set second note to head
			this.head = this.head.getNext();
		}
		return item;
	}

	public Object removeFromTail() throws EmptyListException {

		Object item = null; 

		if (isEmpty()) {
			throw new EmptyListException();
		}

		item = this.tail.getData();

		if (this.head == this.tail) {
			this.head = this.tail = null;
		} else {
			ListNode current = this.head; // It is TEMPORARY VARIABLE, it will change constantly when the Tail not found and we can not chage the head
			while (current.getNext() != tail) { // if the temporary variable not equal to tail, it will run constantly
				current = current.getNext();   
			}
			this.tail = current;
			this.tail.setNext(null);
		}
		return item;
	}

	public String toString() {
		String s = "[ ";
		ListNode current = head;
		while (current != null) {
			s += current.getData() + " ";
			current = current.getNext();
		}
		return s + "]";
	}
	
	public ListNode getHead() {
		return head;
	}

	public ListNode getTail() {
		return tail;
	}

} // class LinkedList
