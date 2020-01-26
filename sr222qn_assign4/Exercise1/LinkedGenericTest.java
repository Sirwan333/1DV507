package sr222qn_assign4.Exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Iterator;


public class LinkedGenericTest {
	LinkedGeneric<Integer> integetTest = new LinkedGeneric<>();
	LinkedGeneric<String> stringTest = new LinkedGeneric<>();

	@Test
	public void testSize() {

		for(int i=0; i<5; i++) {
			integetTest.enqueue(i);
		}

		assertEquals(5,integetTest.size());

	}

	@Test
	public void testEnqueue() {

		for(int i=0; i<5; i++) {
			integetTest.enqueue(i);
			stringTest.enqueue(Integer.toString(i));
		}

		Integer testCase = 0;
		assertEquals(testCase,integetTest.first());
		assertEquals("0",stringTest.first());
	}

	@Test
	public void testDequeue() {

		for(int i=0; i<5; i++) {
			integetTest.enqueue(i);
			stringTest.enqueue(Integer.toString(i));
		}

		assertEquals((Integer)0,integetTest.dequeue());
		assertEquals("0",stringTest.dequeue());
		assertEquals(4,integetTest.size());
		assertEquals(4,stringTest.size());
	}

	@Test
	public void testFirst() {

		for(int i=0; i<5; i++) {
			integetTest.enqueue(i);
			stringTest.enqueue(Integer.toString(i));
		}

		Integer testCase = 0;
		assertEquals(testCase,integetTest.first());
		assertEquals("0",stringTest.first());
	}

	@Test
	public void testIsEmpty() {

		for(int i=0; i<5; i++) {
			integetTest.enqueue(i);
			stringTest.enqueue(Integer.toString(i));
		}
		for(int i=0; i<5; i++) {
			integetTest.dequeue();
			stringTest.dequeue();
		}
		assertEquals(true,integetTest.isEmpty());
		assertEquals(true,stringTest.isEmpty());
	}

	@Test
	public void testLast() {

		for(int i=0; i<5; i++) {
			integetTest.enqueue(i);
			stringTest.enqueue(Integer.toString(i));
		}
		Integer test = 4;
		assertEquals(test,integetTest.last());
		assertEquals("4",stringTest.last());
	}


	@Test
	public void testIterator() {

		for(int i=0; i<5; i++) {
			integetTest.enqueue(i);
			stringTest.enqueue(Integer.toString(i));
		}
		Integer counter = 0;
		Iterator<Integer> itrator1 = integetTest.iterator();
		Iterator<String> itrator2 = stringTest.iterator();
		while(itrator1.hasNext()) {
			assertEquals(counter,itrator1.next());
			assertEquals(Integer.toString(counter),itrator2.next().toString());
			counter++;
		}
	}

}