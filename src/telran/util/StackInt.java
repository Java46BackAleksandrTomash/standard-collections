package telran.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

//public class StackInt {
//
//	List<Integer> list = new ArrayList<>();
//
//	public int pop() {
//		if (list.isEmpty()) {
//			throw new NoSuchElementException();
//		}
//		return list.remove((list.size() - 1));
//	}
//
//	public void push(int number) {
//
//		if (list.isEmpty() || number >= list.size() - 1) {
//			list.add(number);
//		}
//	}
//
//	public boolean isEmpty() {
//
//		return list.isEmpty();
//	}
//
//	public int getMaxNumber() {
//		if (list.isEmpty()) {
//			throw new NoSuchElementException();
//		}
//		Collections.sort(list);
//
//		return (list.get(list.size() - 1));
//	}
//}
public class StackInt {
	private LinkedList<Integer> numbers = new LinkedList<>();
	private LinkedList<Integer> maxNumbers = new LinkedList<>();
public int pop() {
	//removes last number and returns removed number
	//throws exception NoSuchElementException for empty stack
	if (numbers.isEmpty()) {
		throw new NoSuchElementException();
	}
	int res = numbers.removeLast();
	if (res == maxNumbers.getLast()) {
		maxNumbers.removeLast();
	}
	return res;
}
public void push(int number) {
	//adds number at end of a stack
	numbers.add(number);
	if (maxNumbers.isEmpty() || number >= maxNumbers.getLast()) {
		maxNumbers.add(number);
	}
}
public boolean isEmpty() {
	//returns true if a stack is empty
	return numbers.isEmpty();
}
public int getMaxNumber() {
	//returns maximal number existing in a stack
	//throws exception NoSuchElementException for empty stack
	if (maxNumbers.isEmpty()) {
		throw new NoSuchElementException();
	}
	return maxNumbers.getLast();
}
}
