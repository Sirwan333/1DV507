package sr222qn_assign1.intCollection;

public class ArrayIntList extends AbstractIntCollection implements IntList {



	@Override
	public void add(int n) {
		if (size==values.length) 
		{
			resize();
		}

		values[size]=n;
		size++;
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
    	if(checkIndex(index, values.length)) 
		 {
			if (size==values.length) 
			{
				resize();
			}
		    for (int i = size + 1; i > index ; i--) 
		    {
				values[i] = values[i - 1];
			}
			values[index]=n;
			size++;
		}

	}
	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		if(checkIndex(index, size)) {
			for (int i =index; i<values.length-1; i++) {
				values[i]=values[i+1];
			}
			values[size-1]=0;
			size--;

		}

	}
	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		if (checkIndex(index, values.length)) 
		{
			return values[index];
		}
		return 0;
	}

	@Override
	public int indexOf(int n) {
		for (int i =0; i<values.length; i++) 
		{
			if (values[i]==n) 
			{
				return i;
			}
		}
		return-1;
	}
}
