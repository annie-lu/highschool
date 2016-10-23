package myArrayList;

public class MyArrayList<E> {

	private Object[] a;
	private int size;

	public MyArrayList() {
		a = new Object[10];
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 1) {
			throw new IllegalArgumentException();
		} else {
			a = new Object[initialCapacity];
		}
	}

	private void check(int index, int bound) {
		if (index < 0 || index >= bound) {
			throw new IndexOutOfBoundsException();
		}
	}

	public int size() {
		return size;
	}

	public E get(int index) {
		check(index, size);
		return (E) a[index];
	}

	public E set(int index, E element) {
		check(index, size);
		E previous = (E) a[index];
		a[index] = element;
		return previous;
	}

	public boolean contains(Object element) {
		for (int x = 0; x < size; x++) {
			if (a[x] == element || a[x].equals(element)) {
				return true;
			}
		}
		return false;
	}

	public void trimToSize() {
		Object[] trimmed = new Object[size];
		System.arraycopy(a, 0, trimmed, 0, size);
		a = trimmed;
	}

	public void add(E element) {
		add(size, element);
	}

	public void add(int index, E element) {
		check(index, size + 1);
		if (size < a.length) {
			System.arraycopy(a, index, a, index + 1, size - index);
		} else {
			Object[] bigger = new Object[a.length * 2 + 1];
			System.arraycopy(a, 0, bigger, 0, index);
			System.arraycopy(a, index, bigger, index + 1, size - index);
			a = bigger;
		}
		size++;
		a[index] = element;
	}

	public E remove(int index) {
		check(index, size);
		E previous = (E) a[index];
		System.arraycopy(a, index + 1, a, index, size - index - 1);
		size--;
		a[size] = null;
		return previous;
	}

	public boolean remove(Object element) {
		if (contains(element)) {
			for (int i = 0; i < size; i++) {
				if (a[i] == element || element.equals(a[i])) {
					remove(i);
					return true;
				}
			}
		}
		return false;
	}

}