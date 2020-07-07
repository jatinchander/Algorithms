// This pattern uses objects or sets to collect values/frequencies of values
// This can often avoid the need for nested loops or O(n^2) operations with arrays/strings
package frequencyCounter;

import java.util.HashMap;

public class Same {
	/*
	 * Write a function called same, which accepts two arrays. The function should
	 * return true if every value in the array has its corresponding value squared
	 * in the second array. The frequency of values must be the same.
	 */

	/*
	 * Example: same([1,2,3], [4,1,9]) // true 
	 * Example: same([1,2,3], [1,9]) // false 
	 * Example: same([1,2,1], [4,4,1]) // false
	 */

	public static void main(String[] args) {
		System.out.println("Results: ");
		int [] arr1 = {1, 2, 3};
		int [] arr2 = {4, 1, 9};
		int [] arr3 = {1, 9};
		int [] arr4 = {4, 4, 1};
		int [] arr5 = {1, 2, 2, 3, 3, 3};
		int [] arr6 = {9, 9, 9, 4, 4, 1};
		
		System.out.println(isSame(arr1, arr2)); // Example: same([1,2,3], [4,1,9]) // true 
		System.out.println(isSame(arr1, arr3)); // Example: same([1,2,3], [1,9]) // false
		System.out.println(isSame(arr1, arr4)); // Example: same([1,2,1], [4,4,1]) // false
		System.out.println(isSame(arr5, arr6)); // Example: same([1,2,2,3,3,3], [9,9,9,4,4,1]) // true
		
	}

	public static boolean isSame(int[] arrayOne, int[] arrayTwo) {
		// HashMap for first array
		HashMap<Integer, Integer> hmapOne = new HashMap<>();

		// HashMap for second array
		HashMap<Integer, Integer> hmapTwo = new HashMap<>();

		// check length of both arrays
		if (arrayOne.length != arrayTwo.length) {
			return false;
		}

		// add value & occurrences from first array to hmapOne
		for (int i = 0; i < arrayOne.length; i++) {
			if (hmapOne.containsKey(arrayOne[i])) {
				hmapOne.put(arrayOne[i], (hmapOne.get(arrayOne[i])) + 1);
			} // end if
			else {
				hmapOne.put(arrayOne[i], 1);
			} // end else
		} // end for

		// add value & occurrences from second array to hmapTwo
		for (int i = 0; i < arrayTwo.length; i++) {
			if (hmapTwo.containsKey(arrayTwo[i])) {
				hmapTwo.put(arrayTwo[i], (hmapTwo.get(arrayTwo[i])) + 1);
			} // end if
			else {
				hmapTwo.put(arrayTwo[i], 1);
			} // end else
		} // end for

		
		// traverse through first array
		for (int i = 0; i < arrayOne.length; i++) {
			// value of first index
			int current = arrayOne[i];
			// value first index squared
			int currentSquared = current * current;
			// check if the squared value is in hmapTwo
			if(!(hmapTwo.containsKey(currentSquared))) {
				return false;
			}
			// check if the occurrences match
			if (hmapOne.get(current) != hmapTwo.get(currentSquared)) {
				return false;
			} // end if
		} // end for

		return true;

	}
}
