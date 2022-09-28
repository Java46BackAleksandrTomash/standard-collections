package telran.util;

import java.util.HashMap;
import java.util.Map;

public class MyArray<T> {

	private int size;
	private T valueToSet;
	private Map<Integer, T> mapValues = new HashMap<>();

	public MyArray(int size) {
		if (size < 0) {
			throw new IllegalArgumentException();
		}
		this.size = size;
	}

	public void setAllValue(T value) {

		valueToSet = value;
	}

	public T get(int index) {
		if (!isIndexTrue(index)) {
			throw new ArrayIndexOutOfBoundsException();

		}
		return mapValues.get(index);
	}

	public void set(int index, T value) {
		if (!isIndexTrue(index)) {
			throw new ArrayIndexOutOfBoundsException();
	}
		mapValues.put(index, value);
	}
	
	public boolean isIndexTrue(int index) {
		return index >= 0 && index < size;
	}
}
