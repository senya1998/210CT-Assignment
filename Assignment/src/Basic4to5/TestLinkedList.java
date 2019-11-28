package Basic4to5;
public class TestLinkedList {
	public static void main (String args[]) {
		LinkedList s = new LinkedList();
		System.out.println(s);
		System.out.println();
		//s.addToTail (new datatype(enter string or number or ...));
		s.addToTail (new Integer(42));
		System.out.println(s);
		System.out.println();
		//Add the character 'n' into the tail of linkedlist
		s.addToTail (new Character('n'));
		System.out.println(s);
		System.out.println();
		//Add the String "hello" into the tail of linkedlist
		s.addToTail (new String("hello"));
		System.out.println(s);
		System.out.println();
		//if linkedlist is not empty, remove the object from the head of linkedlist until the linkedlist is empty
		while (!s.isEmpty()) {						
			System.out.println("removed: " + s.removeFromHead());
			System.out.println(s);
			System.out.println();
		}
		//Add a integer 42 into the head of linkedlist
		s.addToHead (new Integer(42));
		System.out.println(s);
		System.out.println();
		//Add a character 'n' into the head of linkedlist
		s.addToHead (new Character('n'));
		System.out.println(s);
		System.out.println();
		//Add the String "hello" into the head of linkedlist
		s.addToHead (new String("hello"));
		System.out.println(s);
		System.out.println();
		//remove the object from the tail of the linkedlist until the linkedlist is empty
		while (!s.isEmpty()) {
			//
			System.out.println("removed: " + s.removeFromTail());
			System.out.println(s);
			System.out.println();
		}
	}
} // End of TestLinkedList