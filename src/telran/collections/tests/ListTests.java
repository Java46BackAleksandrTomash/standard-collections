package telran.collections.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class ListTests {
	Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	List<Integer> list = Arrays.asList(numbers);
	List<Integer> listMutable = new ArrayList<>(list);
	
	@BeforeEach
	void setUp() {
		List<Integer> listMutable = new ArrayList<>(list);
	}
	@Test
	void listImmutableTest() {
 
		
		assertThrows(UnsupportedOperationException.class, () -> list.remove(0));
		Integer[] expected = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		assertEquals(1, listMutable.remove(0));
		assertArrayEquals(expected, listMutable.toArray(new Integer[0]));

	}
	@Test
	void listViewTest() {
		List<Integer> subList = listMutable.subList(2, 9);
		Integer[] expected = { 3, 4, 5, 6, 7, 8, 9};
		assertArrayEquals(expected, subList.toArray(new Integer[0]));
	}
void queueTest() {
	Stack<Integer> stack = new Stack<>();
	stack.add(1);
	stack.add(2);
	stack.add(3);
	stack.remove(1);
}
}
