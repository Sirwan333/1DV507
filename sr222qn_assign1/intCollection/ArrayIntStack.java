package sr222qn_assign1.intCollection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	@Override
	public void push(int n) {
		if (size==values.length) 
		{
			resize();
		}
		int i = size; 
		values[i]=n; 
		size++;
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		if (size == 0) 
		{
			throw new IndexOutOfBoundsException("Error");
		}
		else 
		{
			int top = values[size-1];
			values[size-1] =0;
			size--; 
			return top;
		}
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		if (size == 0) 
		{
			throw new IndexOutOfBoundsException("Error");
		}
		else 
		{
			int top = values[size-1];
			return top;
		}
	}
}
