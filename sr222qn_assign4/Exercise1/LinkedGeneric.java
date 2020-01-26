package sr222qn_assign4.Exercise1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedGeneric<T> implements Queue<T>, Iterable<T> {
	private int size;
	private Node head;
	private Node tail;

	public LinkedGeneric() {
		size = 0;
		head = null;
		tail = null;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size <= 0) 
		{
			return true;
		}
		return false;
	}

	public void enqueue(T element) {
		if (size == 0) 
		{
			head = new Node(element);
			tail = head;
		}

		else 
		{
			tail.next = new Node(element);
			tail = tail.next;
		}
		size++;
	}

	public T dequeue() {
		T t = head.value;
		if(!isEmpty()) 
		{
			Node node = head;
			head = head.next;
			while(node.next!= null) 
			{
				node= node.next;
			}
			size--;
		}
		else 
		{
			throw new IndexOutOfBoundsException();
		}	
		return t;
	}


	public T first() throws NoSuchElementException {
		if (size < 1) 
		{
			throw new NoSuchElementException();
		}
		return head.value;
	}

	public T last() throws NoSuchElementException {
		if (size < 1) 
		{
			throw new NoSuchElementException();
		}
		return tail.value;
	}

	public Iterator<T> iterator() {
		return new LinkedIterator(head);
	}

	private class Node {
		T value;
		Node next;

		public Node(T val) {
			value = val;
			next = null;
		}
	}

	private class LinkedIterator implements Iterator<T> {
		Node c;
		public LinkedIterator(Node first) {
			c = first;
		}

		public boolean hasNext() {
			return c != null;
		}

		public T next() throws NoSuchElementException {
			if (c == null) 
			{
				throw new NoSuchElementException();
			}
			T t = c.value;
			c = c.next;
			return t;
		}
	}
}
