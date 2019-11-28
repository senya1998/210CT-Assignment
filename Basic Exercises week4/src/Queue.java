
public class Queue extends LinkedList{

	public Queue() {
		super();
		// TODO Auto-generated constructor stub
	}
	//chedk is empty or not
	public boolean empty() {
		return this.isEmpty();
	}
	//add an object to the tail of the queue
	public void enqueue(Object o) {
		this.addToTail(o); 
	}
	//remove an object from the head of the queue
	public Object dequeue() {
		return this.removeFromHead();
	}

}
