package sr222qn_assign4.binheap;

import java.util.Arrays;

public class BinaryIntHeap {
	// I got some help from https://github.com/GustavAndersson/1DV507/blob/master/src/ga222gb_assign4/binheap/BinaryIntHeap.java

	private int arr[] = new int[8];
	private int size = 0;
	public BinaryIntHeap() {

	}

	public void insert( int n )
	{
		if( size == arr.length - 1 ) 
		{
			resize();
		}
		int current = size++;
		while(current>1 && n<( arr[current/2] ))
		{ 
			arr[ current ] = arr[ current / 2 ];
			current = current/2;
		}
		arr[current] = n; 
	}

	private void percolatingDown() { 
		int start = 0;
		int roote;
		int pos = arr[ 0 ];
		while (2 * start + 1 < size)
		{
			roote = getChild(start);
			if (arr[roote] < pos) 
			{
				arr[start] = arr[roote];
			}
			else
				break;
			start = roote;
		}
		arr[start] = pos;
	}


	public int pullHighest(){ // Pull the int with highest priority
		if (isEmpty()) 
		{
			throw new RuntimeException();
		}

		int rsult = arr[0];
		arr[0] = arr[size - 1];
		size--;
		percolatingDown();        
		return rsult;
	}

	private int getChild(int i) { 
		int child = 2 * i +1 ;
		int n = 2;
		int p = 2 * i + n;
		while ((n <= 2) && (p < size)) 
		{
			if (arr[p] < arr[child]) 
				child = p;
			p = 2 * i + (n+=1); 
		}    
		return child;
	}


	public int size() {

		return this.size;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	private void resize() { 
		int doubleSize = size*2;
		arr = Arrays.copyOf(arr, doubleSize);
	}

}
