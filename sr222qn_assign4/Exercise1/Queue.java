package sr222qn_assign4.Exercise1;

import java.util.Iterator;

public interface Queue<T> {  
	public int size();                     // current queue size 
	public boolean isEmpty();              // true if queue is empty 
	public void enqueue(T element);   	  // add element at end of queue 
	public T dequeue();              	  // return and remove first element. 
	public T first();              	      // return (without removing) first element 
	public T last();                 	  // return (without removing) last element 
	public String toString();              // return a string representation of the queue content
	public Iterator<T> iterator();         // element iterator
}
