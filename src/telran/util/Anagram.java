package telran.util;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

//	public static boolean isAnagram(String word, String anagram) {
//		if (word.length() != anagram.length()) {
//			throw new IllegalArgumentException();
//	}
//		char[] wordArr = word.trim().toLowerCase().toCharArray();
//		char[] anagramArr = anagram.trim().toLowerCase().toCharArray();
//
//		Map<Character, Integer> map = new HashMap<>();
//
//		for (char c : wordArr) {
//			map.put(c, map.getOrDefault(c, 0) + 1);
//		}
//		for (char c : anagramArr) {
//			int count = map.getOrDefault(c, 0);
//			if (count != 0) {
//				map.put(c, count - 1);
//			} else
//				return false;
//
//		}
//
//		return true;
//	}
//}
	///////////////////// another solution///////////////////

//	public static boolean isAnagram(String word, String anagram) {
//		boolean res = false;
//		if(word.length() == anagram.length()) {
//			HashMap<Character, Integer> mapLetters = getMapLetters(word);
//			res = true;
//			for(char letter: anagram.toCharArray()) {
//				Integer count = mapLetters.getOrDefault(letter, 0);
//				if(count == 0) {
//					res = false;
//					break;
//				}
//				mapLetters.put(letter, count - 1);
//			}
//			
//		}
//		
//	return res;
//}
//
//private static HashMap<Character, Integer> getMapLetters(String word) {
//	HashMap<Character, Integer> res = new HashMap<>();
//	for(char letter: word.toCharArray()) {
//		Integer count = res.getOrDefault(letter, 0);
//		res.put(letter, count + 1);
//	}
//	return res;
//}
//}
	
	

	
	

/////////////////////solution with methods marge and compute///////////////////

public static boolean isAnagram(String word, String anagram) {
	
	if(word.length() != anagram.length()) {
		return false;
	}
	HashMap<Character, Integer> charCountsMap = getCharCounts(word);
	for(char c: anagram.toCharArray()) {

		if (charCountsMap.compute(c, (k, v) -> v == null ? -1 : v - 1 ) < 0 )
			return false;
	}
	return true;
}

private static HashMap<Character, Integer> getCharCounts(String word) {
	HashMap<Character, Integer> res = new HashMap<>();
	for(char c: word.toCharArray()) {
		res.merge(c, 1, (a, b) -> a + b);
	}
	return res;
}


}
