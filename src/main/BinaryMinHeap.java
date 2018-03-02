package main;

import java.util.ArrayList;
import java.util.List;

/*
 * Reference:
 * http://interactivepython.org/runestone/static/pythonds/Trees/BinaryHeapImplementation.html
 */
/**
 * - A simple BinaryHeap where the heap structure is represented as a single
 * list.<br>
 * - The children of a node at index i are at the indices 2i and 2i+1.<br>
 * - The current root is always at index = 1. <br>
 * - Index 0 is not used (equals null), so simple integer division can be used.
 * <br>
 * - the index of the parent is always the result of the integer division of
 * n/2, where n is the index of a children.<br>
 * 
 * @author Etienne Onasch
 *
 */
public class BinaryMinHeap<T extends Comparable<? super T>> {

	private List<T> heapList = new ArrayList<>();
	private int currentSize;
	private static final Object NO_ELEM = null;

	@SuppressWarnings("unchecked")
	public BinaryMinHeap() {
		heapList.add((T) NO_ELEM);
		currentSize = 0;
	}

	private void percUp(int i) {
		while (i / 2 > 0) {
			if (heapList.get(i).compareTo(heapList.get(i / 2)) < 0) {
				T tmp = heapList.get(i / 2);
				heapList.set(i / 2, heapList.get(i));
				heapList.set(i, tmp);
			}
			i /= 2;
		}
	}

	private void percDown(int i) {
		while (i * 2 <= currentSize) {
			int mc_index = minChild(i);
			if (heapList.get(i).compareTo(heapList.get(mc_index)) > 0) {
				T tmp = heapList.get(i);
				heapList.set(i, heapList.get(mc_index));
				heapList.set(mc_index, tmp);
			}
			i = mc_index;
		}
	}

	private int minChild(int i) {
		if ((i * 2 + 1) > currentSize) {
			return i * 2;
		} else if (heapList.get(i * 2).compareTo(heapList.get(i * 2 + 1)) < 0) {
			return i * 2;
		} else {
			return i * 2 + 1;
		}
	}

	public void insert(T elem) {
		heapList.add(elem);
		currentSize++;
		percUp(currentSize);
	}

	public T extractMin() {
		T retVal = heapList.get(1);
		heapList.set(1, heapList.get(currentSize));
		heapList.remove(currentSize);
		currentSize--;
		percDown(1);
		return retVal;
	}

	public void buildHeap(List<? extends T> keys) {
		if (keys == null || keys.size() == 0) {
			throw new IllegalArgumentException("Argument must not be empty or null.");
		}
		currentSize = keys.size();
		int i = currentSize / 2;
		heapList.addAll(1, keys);
		while (i > 0) {
			percDown(i);
			i--;
		}
	}
	public int size() {
		return currentSize;
	}

}
