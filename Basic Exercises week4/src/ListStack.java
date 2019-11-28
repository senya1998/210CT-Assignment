
public class ListStack extends LinkedList {

	protected  int length;    
	
	public ListStack() {
		super();
		length = 0;     
	}
	
	public boolean empty() { // stack empty method in Java is used to check whether a stack is empty or not. The method is of boolean type and returns true if the stack is empty else false.
		return isEmpty();
	}

	public void push(Object o) { //stack push method is used to push an element into the Stack. The element gets pushed onto the top of the Stack.
		addToTail(o);
		length = length + 1;
	}

	public Object pop() { // stack pop method in Java is used to pop an element from the stack. The element is popped from the top of the stack and is removed from the same
		if (!isEmpty()) { length = length - 1; }
		return removeFromTail();
	}

	public Object peek() { // The method returns the element at the top of the Stack else returns NULL if the Stack is empty.
		return this.getTail().getData();
	}

	public int search(Object item) { 

		ListNode current = getHead();
		 int num=-1;
         for(int i = 1;i<=length;i++){
             if(item.equals(current.getData())){
                 num = length - i + 1;
                 return num;
             }
             else{
                 current = current.getNext();
             }       
         }
         return num;
	}
}
