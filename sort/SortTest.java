package sr222qn_assign3.sort;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void insertionSortIntTest() {
		int[] intArray = {4, 12, 3, 69, 6, 15, 0};
		
		int[] testArray = SortingAlgorithms.insertionSort(intArray);
		assertEquals(testArray[0] ,0);
		assertEquals(testArray[6] ,69);
		
		for(int i=0; i<testArray.length-1; i++) 
		{
			assertTrue(testArray[i]<= testArray[i+1]);
		}
	}

	@Test
	 void insertionSortStringTest() {
	//	Comparator<String> largest = (s1,s2) ->Integer.compare(s1.length(), s2.length()); 
		Comparator<String> largest = (s1,s2) -> (s2.compareTo(s1) ); 

		String[] stringArray = {"b", "l", "r", "qn", "z", "a"};
		
		String[] stringArrayTest = SortingAlgorithms.insertionSort(stringArray,largest);
		assertEquals(stringArrayTest[0],"a");
		assertEquals(stringArrayTest[5],"z");
		

	}

}
