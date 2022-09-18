package telran.collections.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.StackInt;

class StackIntTest {
	
	StackInt list = new StackInt();
	
	
	
	@Test
	void testPop() {
		assertThrows(NoSuchElementException.class, () -> list.pop());
		list.push(1);
		list.push(2);
		assertEquals(2, list.pop());
	}

	@Test
	void testPush() {
		assertTrue(list.isEmpty());
		list.push(1);
		assertFalse(list.isEmpty());
	}	

	@Test
	void testIsEmpty() {
		assertTrue(list.isEmpty());
	}

	@Test
	void testGetMaxNumber() {
		assertThrows(NoSuchElementException.class, () -> list.getMaxNumber());
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		assertEquals(4, list.getMaxNumber());
	}

}