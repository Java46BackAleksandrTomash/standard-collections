package telran.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;
import java.util.NoSuchElementException;

public class StackInt {

	List<Integer> list = new ArrayList<>();

	public int pop() {
		if (list.isEmpty()) {
			throw new NoSuchElementException();
		}
		return list.remove((list.size() - 1));
	}

	public void push(int number) {

		if (list.isEmpty() || number >= list.size() - 1) {
			list.add(number);
		}
	}

	public boolean isEmpty() {

		return list.isEmpty();
	}

	public int getMaxNumber() {
		if (list.isEmpty()) {
			throw new NoSuchElementException();
		}
		Collections.sort(list);

		return (list.get(list.size() - 1));
	}
}