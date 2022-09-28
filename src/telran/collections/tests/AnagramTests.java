package telran.collections.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.util.Anagram.*;
class AnagramTests {

	String word = "Hello";
	@Test
	void anagramTest() {
		
		assertTrue(isAnagram(word, "hello"));
		assertTrue(isAnagram(word, "helol"));
		assertTrue(isAnagram(word, "ellho"));
		assertTrue(isAnagram(word, "lelho"));
		assertTrue(isAnagram(word, "olleh"));
		
		assertFalse(isAnagram(word, "hella"));
		assertFalse(isAnagram(word, "helly"));
		assertFalse(isAnagram(word, "heloo"));
		assertFalse(isAnagram(word, "oleho"));
		assertFalse(isAnagram(word, "helll"));
	}
	}


