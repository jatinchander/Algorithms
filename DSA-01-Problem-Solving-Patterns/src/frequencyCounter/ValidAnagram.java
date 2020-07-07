// This pattern uses objects or sets to collect values/frequencies of values
// This can often avoid the need for nested loops or O(n^2) operations with arrays/strings
package frequencyCounter;

import java.util.HashMap;

public class ValidAnagram {
	/*
	 * Given two strings, write a function to determine if the second string is an
	 * anagram of the first. An anagram is a word, phrase, or name formed by
	 * rearranging the letters of another, such as cinema, formed from iceman.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("cinema", "iceman"));
		System.out.println(isAnagram("silent", "listen"));
		System.out.println(isAnagram("abc", "bcd"));

	}

	public static boolean isAnagram(String s1, String s2) {
		// HashMap for first string
		HashMap<Character, Integer> hmapOne = new HashMap<>();

		// HashMap for second string
		HashMap<Character, Integer> hmapTwo = new HashMap<>();
		
		// check if both strings have same length
		if(s1.length() != s2.length()) {
			return false;
		}

		// Traverse through first string
		for (int i = 0; i < s1.length(); i++) {
			if (hmapOne.containsKey(s1.charAt(i))) {
				hmapOne.put(s1.charAt(i), hmapOne.get(s1.charAt(i)) + 1);
			} else {
				hmapOne.put(s1.charAt(i), 1);
			}
		}

		// Traverse through first string
		for (int i = 0; i < s2.length(); i++) {
			if (hmapTwo.containsKey(s2.charAt(i))) {
				hmapTwo.put(s2.charAt(i), hmapOne.get(s2.charAt(i)) + 1);
			} else {
				hmapTwo.put(s2.charAt(i), 1);
			}
		}

		if (hmapOne.equals(hmapTwo)) {
			return true;
		}

		return false;
	}

}
