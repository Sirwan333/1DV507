package sr222qn_assign4.binheap;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryIntHeapTest {
	@Test
	final void testInsert() {
		BinaryIntHeap bHeap = new BinaryIntHeap();

		bHeap.insert(4);
		bHeap.insert(3);

		assertEquals(bHeap.pullHighest(),4);

	}

	@Test
	final void testPullHighest() {
		BinaryIntHeap bHeap = new BinaryIntHeap();
		bHeap.insert(4);
		bHeap.insert(3);
		assertEquals(bHeap.pullHighest(),4);
		assertEquals(bHeap.pullHighest(),3);

	}

	@Test
	final void testSize() {
		BinaryIntHeap bHeap = new BinaryIntHeap();
		for(int i=0; i<10; i++) {
			bHeap.insert(i);
		}
		assertEquals(bHeap.size(),10);
		for(int i=0; i<10; i++) {
			bHeap.pullHighest();
		}
		assertEquals(bHeap.isEmpty(),true);

	}



}
