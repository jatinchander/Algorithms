package searchingAlgorithms;

public class naiveSearch {
	/*
	 * Given two strings, check how many times the smaller string appears in the
	 * longer string Example: naiveSearch("lorie loled", "lol") // 1
	 */

	public static void main(String[] args) {
		String s1 = "abbbbbabbbbabbbbbab";
		String s2 = "ab";
		
		System.out.println("The number of times " + s2 + " appears in " + s1 + " is: " + NaiveSearch(s1, s2));

	}

	public static int NaiveSearch(String s1, String s2) {
		// initialize counter
		int count = 0;
		// loop through larger string
		for (int i = 0; i < s1.length(); i++) {
			// loop through shorter string
			for (int j = 0; j < s2.length(); j++) {
				// check if the index of j is equal to i
				if (s2.charAt(j) != s1.charAt(i + j)) { // the reason we do i+j is because i doesn't increment until the
														// inner loop is done, so this is a way to get around that
					break;
				}
				// if we're at the end of our inner loop, we have a match
				if (j == s2.length() - 1) {
					count++;
				}
			}
		}

		return count;
	}

}
