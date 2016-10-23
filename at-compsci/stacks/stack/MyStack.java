package stack;

public class MyStack {

	private Object[] a;
	private int size;

	public Object push(Object item){
		int index=size;
		if (size < a.length) {
			System.arraycopy(a, index, a, index + 1, size - index);
		} else {
			Object[] bigger = new Object[a.length * 2 + 1];
			System.arraycopy(a, 0, bigger, 0, index);
			System.arraycopy(a, index, bigger, index + 1, size - index);
			a = bigger;
		}
		size++;
		a[index] = item;
		return item;
	}; 
	
	public MyStack() {
		a = new Object[10];
	}

	public Object pop(){
		int index=size-1;
		Object previous = a[index];
		System.arraycopy(a, index + 1, a, index, size - index - 1);
		size--;
		a[size] = null;
		return previous;
		
	}; 
	
	private void check(int index, int bound) {
		if (index < 0 || index >= bound) {
			throw new IndexOutOfBoundsException();
		}
	}

	public Object peek(){
		
		return a[size-1];
		
	};

	public boolean isEmpty(){
		
		return a[0]==null;
		
	};

	public int size(){
		
		return size;
		
	}; 


	public boolean contains(Object element) {
		for (int x = 0; x < size; x++) {
			if (a[x] == element || a[x].equals(element)) {
				return true;
			}
		}
		return false;
	}

	public int search (Object x){
		
		if (contains(x)) {
			for (int i = 0; i < size; i++) {
				if (a[i] == x || x.equals(a[i])) {
					return size-i;
				}
			}
		}
		return -1;
	}
		

	public String toString(){
		String stack="";
		for (int x = size-1; x >= 0; x--) 
			stack+=a[x]+" ";
		
	return stack;
}}
