package sr222qn_assign3.count_words;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashWordSet implements WordSet{
	private int size;
	private Node[] buckets;

	public HashWordSet() { 
		size = 0;
		buckets = new Node[1];
	}

	@Override
	public void add(Word word) { 

		if (contains(word)) 
		{ 
			return; 
		}
		int pos = getBucketsNo(word);
		Node node = new Node(word); 
		node.next = buckets[pos]; 
		buckets[pos] = node;
		size ++;
		if (size == buckets.length) 
		{ 
			rehash(); 
		} 
	}

	@Override
	public boolean contains(Word word) { 

		int pos = getBucketsNo(word); 
		Node node = buckets[pos]; 

		while (node != null) 
		{
			if (node.element.equals(word)) 
			{
				return true; 
			}
			node = node.next; 
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override 
	public String toString() { 
		StringBuilder sBuilder = new StringBuilder(); 
		Iterator<Word> itrator = iterator(); 
		Word wo; 
		while (itrator.hasNext()) 
		{ 
			wo = itrator.next(); 
			sBuilder.append(wo.toString()); 
			if(itrator.hasNext()) 
			{ 
				sBuilder.append(", "); 
			} 
		} 
		return sBuilder.toString(); 
	}

	private class Node { 
		public Word element;
		public Node next;

		public Node(Word word) {
			element = word;
		}
	}

	@Override
	public Iterator<Word> iterator() {
		return new QItrator();
	}

	private class QItrator implements Iterator<Word> {
		private Node currentNode;
		private int counter;

		public QItrator() {
			counter = -1;
			currentNode = null;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null && currentNode.next != null) 
			{
				return true;
			}

			for (int i = counter + 1; i < buckets.length; i++) 
			{
				if (buckets[i] != null) 
				{
					return true;
				}
			}
			return false;
		}

		@Override
		public Word next() {

			if  (currentNode == null || currentNode.next == null) 
			{
				counter++;
				while (buckets[counter] == null && counter < buckets.length) 
				{ 																	
					counter++;
				}
				if (counter < buckets.length) 
				{
					currentNode = buckets[counter];
				} 
				else 
				{
					throw new NoSuchElementException(); 
				}
			}
			else 
			{
				currentNode = currentNode.next; 
			}
			return currentNode.element; 
		}
	}

	private void rehash() { 
		Node[] buckets1 = buckets; 
		buckets = new Node[buckets1.length*2]; 
		size = 0;
		for (int i = 0;i<buckets1.length;i++) 
		{
			Node node = buckets1[i];
			if (node == null)
				continue; 
			while (node != null) 
			{
				add(node.element); 
				node = node.next;
			}
		}
	}

	private int getBucketsNo(Word word) {
		int hCode = word.hashCode();
		if (hCode < 0) 
		{
			hCode = -hCode; 
		}
		hCode = hCode % buckets.length;
		return hCode;
	}

}
