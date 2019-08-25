package sr222qn_assign3.count_words;

import java.util.Iterator;

public class TreeWordSet implements WordSet {

	private BST root=null; 
	private int size=0;;

	public TreeWordSet() { 

	}

	private class BST { 
		BST lBST;   
		BST rBST;
		Word word;

		BST(Word wor) {
			word = wor;
		}

		public String toString() {
			return word.toString();
		}

		private void addBST(Word wor) {
			if(word.compareTo(wor) > 0) 
			{
				if(rBST == null) 
				{
					rBST = new BST(wor);
					size++;
				}
				else 
				{
					rBST.addBST(wor);
				}
			}
			if(word.compareTo(wor) < 0) 
			{
				if(lBST == null) 
				{
					lBST = new BST(wor);
					size++;
				}
				else 
				{
					lBST.addBST(wor);
				}
			}
		}

		private boolean contains(Word wor) {
			if(word.compareTo(wor) > 0)
			{
				if(rBST == null) 
				{
					return false;
				}
				else
				{
					return rBST.contains(wor);
				}
			}
			if(word.compareTo(wor) < 0) 
			{
				if(lBST == null) 
				{
					return false;
				}
				else 
				{
					return lBST.contains(wor);
				}
			}
			return true;
		}

		private BST bstS(Word wd) {
			BST bstN = null;
			if(rBST != null) 
			{ 
				bstN = rBST.bstS(wd);
			}
			if(bstN != null) 
			{
				return bstN;
			}
			else if(wd.compareTo(word) < 0) 
			{
				return this;
			}
			else if(lBST != null) 
			{ 
				bstN = lBST.bstS(wd);
			}
			if(bstN != null) 
			{
				return bstN;
			}

			return null;
		}
	}

	@Override
	public void add(Word word) {
		BST bst1 = new BST(word);
		if(root == null) 
		{ 
			root = bst1;
			size++;
		}
		else 
		{
			root.addBST(word);
		}
	}

	@Override
	public boolean contains(Word word) { 
		return root.contains(word);
	}

	@Override
	public int size() { 
		return size;
	}

	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		Iterator itrator = iterator();
		Object next;
		while(itrator.hasNext()) 
		{
			next = itrator.next();
			sBuilder.append(next.toString() + ", ");
		}
		return sBuilder.toString();
	}

	@Override
	public Iterator<Word> iterator() {
		return new QTreeItrator();
	}

	private class QTreeItrator implements Iterator { 
		BST bst2 = null;

		@Override
		public boolean hasNext() {
			if(bst2 == null) 
			{
				return root != null;
			}
			return root.bstS(bst2.word) != null;
		}

		@Override
		public BST next() { 
			if(bst2 == null) 
			{
				bst2 = root;
				while(bst2.rBST != null) 
				{
					bst2 = bst2.rBST;
				}
				return bst2;
			}
			bst2 = root.bstS(bst2.word);
			return bst2;
		}
	}

}
