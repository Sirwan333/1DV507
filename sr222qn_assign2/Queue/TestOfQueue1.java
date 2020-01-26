package sr222qn_assign2.Queue;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

class TestOfQueue1 {

	@Test
	public void sizeTest() {
		
		LinkedQueue queue1 = new LinkedQueue();
		assertEquals(true, queue1.isEmpty());
		
		LinkedQueue queue3 = queueBuild(90000);
		assertEquals(90000, queue3.size());
				
	}
	
	@Test
	public void FirstAndLastTest() {
		LinkedQueue queue1 = queueBuild(20);
		assertEquals(19, queue1.last());
		assertEquals(0, queue1.first());
	}
	
	@Test
	public void enqueueTest() {
		LinkedQueue queue1 = queueBuild(20);
		queue1.enqueue(5);
		assertEquals(5,queue1.last());
	}
	
	@Test
	public void dequeueTest() {
		LinkedQueue queue1 = queueBuild(20);
		assertEquals(0,queue1.dequeue());
		assertEquals(19,queue1.size());
		LinkedQueue queue2 = new LinkedQueue();
		assertThrows(NullPointerException.class, () -> queue2.dequeue());
	}
	
	@Test
	public void iteratorTest() {
		LinkedQueue queue1 = new LinkedQueue();
		Iterator<Object> it1 = queue1.iterator();
		assertEquals(false, it1.hasNext());

		LinkedQueue queue2 = queueBuild(50);
		Iterator<Object> it2 = queue2.iterator();
		int cou = 0;
		while(it2.hasNext()) 
		{
			assertEquals(cou++, it2.next());
		}
	}
	
	@Test
	public void toStringTest() {	
		LinkedQueue queue = new LinkedQueue();
		String s = "";
		assertEquals(s, queue.toString());
		s = "0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19";
		LinkedQueue queue1 = queueBuild(50);
		assertEquals(s, queue1.toString());
	}
	
	private LinkedQueue queueBuild (int element) {
		LinkedQueue qu = new LinkedQueue();
		for(int i = 0; i < element; i++) 
		{
			qu.enqueue(i);
		}
		return qu;
		
	}
}