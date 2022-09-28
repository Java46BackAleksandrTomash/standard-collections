package telran.util;


import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			throw new IllegalArgumentException();
		}
		char[] wordArr = word.trim().toLowerCase().toCharArray();
		char[] anagramArr = anagram.trim().toLowerCase().toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (char c : wordArr) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : anagramArr) {
			int count = map.getOrDefault(c, 0);
			if (count != 0) {
				map.put(c, count - 1);
			} else
				return false;

		}

		return true;
	}

}
