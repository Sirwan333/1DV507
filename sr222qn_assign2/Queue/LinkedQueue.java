package sr222qn_assign2.Queue;

import java.util.Iterator;

/** 
 * @author Sirwan Rasoul
 *
 */

public class LinkedQueue implements Queue {
	
	private  Node head = null;
	private Node tail = null;
	private int size = 0;

	private class Node {
		Object elem;
		Node next = null;
		Node(Object e) {
			elem = e;
		}
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(head == null) 
		{
			return true;
		}
		else 
		{
			return false;
		}

	}
	
	public void enqueue(Object element) {
		if(head == null) 
		{
			head = new Node(element);
			tail = head;
			size++;
		}
		else 
		{
			tail.next = new Node(element);
			tail = tail.next;
		}
		size++;
	}
	
	public Object dequeue() throws IndexOutOfBoundsException {
		Node ut = head;
		head = head.next;
		size--;
		return ut.elem;
	}
	
	public Object first() {
		return head.elem; 
	}
	
	public Object last() {
		return tail.elem;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Object> iter = iterator();
		while(iter.hasNext()) 
		{
			sb.append(iter.next());
			if(iter.hasNext() != false) 
			{
				sb.append("|");
			}
		}
		return sb.toString();
	}
	
	public Iterator<Object> iterator() {
		return new iteratorQueue();
	}

	private class iteratorQueue implements Iterator<Object> {
		private Node no = head;
		public Object next() {
			Object obj = no.elem; 
			no = no.next; 
			return obj ;
		}
		
		public boolean hasNext() {
			if (no != null)
                return true;
            else
                return false;
		}
	}
}



