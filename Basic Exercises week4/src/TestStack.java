
import java.util.Stack;
import java.util.Iterator;

public class TestStack {
	public static void main (String args[]) {
		//Stack s = new Stack();				// <== comment this for Q1 and Q2
		ListStack s = new ListStack();  // <== uncomment this for Q1
		//ListStackComp s = new ListStackComp();	// <== uncomment this for Q2

		System.out.println(s);
		
		System.out.println("------secarh()------");
		System.out.println("Patrick is at " + s.search("Patrick"));

		System.out.println("------push()------");
		s.push(new Character('A'));
		System.out.println("push(A) " + s + " top");
		s.push(new Character('B'));
		System.out.println("push(B) " + s + " top");
		s.push("Cat");
		System.out.println("push(Cat) " + s + " top");
		s.push("Dog");
		System.out.println("push(Dog) " + s + " top");
		s.push(new Integer(123));
		System.out.println("push(Patrick) " + s + " top");
		s.push("Patrick");
		System.out.println("push(Patrick) " + s + " top");
		s.push(new Character('E'));
		System.out.println("push(E) " + s + " top");
		s.push(new Double(789.123));
		System.out.println("push(789.123) " + s + " top");
		s.push(new Double(789.123));
		System.out.println("push(BB) " + s + " top");
	
		System.out.println();
		
		System.out.println("peek() returns: " + s.peek());
		System.out.println(s + " top");
		System.out.println();
		
		System.out.println("pop() returns: " + s.pop());
		System.out.println(s + " top");
		System.out.println();
		
		
		System.out.println("------search()------");
		System.out.println("Patrick is at " + s.search("Patrick"));
		System.out.println("A is at " + s.search(new Character('A')));
		System.out.println("789.123 is at " + s.search(new Double(789.123)));
		System.out.println("Peter is at " + s.search("Peter"));
		
		System.out.println("empty() " + s.empty());

		//System.out.println("\nList items via iterator:");     <== no need these statements for Q1 and Q2
		//Iterator iter = s.iterator();
		//while (iter.hasNext()) {
		//	System.out.print(" => " + iter.next());
		//}
		
	}

} // class TestStack