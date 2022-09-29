package telran.util;

import java.util.HashMap;
import java.util.Map;

//public class MyArray<T> {
//
//	public int size;
//	private T valueToSet;
//	private Map<Integer, T> mapValues = new HashMap<>();
//
//	public MyArray(int size) {
//		if (size < 0) {
//			throw new IllegalArgumentException();
//		}
//		this.size = size;
//	}
//
//	public void setAll(T value) {
//		//mapValues = new HashMap<>();
//		valueToSet = value;
//	}
//
//	public T get(int index) {
//		if (!isIndexTrue(index)) {
//			throw new ArrayIndexOutOfBoundsException();
//
//		}
//		return mapValues.get(index);
//	}
//
//	public void set(int index, T value) {
//		if (!isIndexTrue(index)) {
//			throw new ArrayIndexOutOfBoundsException();
//	}
//		mapValues.put(index, value);
//	}
//	
//	public boolean isIndexTrue(int index) {
//		return index >= 0 && index < size;
//	}
//}
public class MyArray<T> {
	private T allValues;
	private int size;
	private HashMap<Integer, T> mapOfSets;
	public MyArray(int size) {
		this.size = size;
		mapOfSets = new HashMap<>();
	}
	/**
	 * sets all array's elements with a given value
	 * @param value
	 */
	public void setAll(T value) {
		mapOfSets = new HashMap<>();
		allValues = value;
		
	}
	/**
	 * 
	 * @param index
	 * @return value at given index or null if index is wrong
	 */
	public T get(int index) {
		T res = null;
		if (index > -1 && index < size) {
			res = mapOfSets.getOrDefault(index, allValues);
		}
		return res;
	}
	/**
	 * sets a given value at a given index
	 * throws IndexOutOfBoundsException in the case of wrong index
	 * @param index
	 * @param value
	 */
	public void set(int index, T value) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(index);
		}
		mapOfSets.put(index, value);
	}
}