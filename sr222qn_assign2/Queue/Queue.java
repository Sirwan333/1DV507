package sr222qn_assign2.Queue;
import java.util.Iterator;
public interface Queue {
	  
		   public int size();                     // current queue size 
		   public boolean isEmpty();              // true if queue is empty 
		   public void enqueue(Object element);   // add element at end of queue 
		   public Object dequeue();               // return and remove first element. 
		   public Object first();                 // return (without removing) first element 
		   public Object last();                  // return (without removing) last element 
		   public String toString();              // return a string representation of the queue content
		   public Iterator<Object> iterator();    // element iterator
		
}
