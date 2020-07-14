/*The process of of rearranging the items in a collection, so that the items are in some kind of order.*/
package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
	/*
	 * Builds up the sort by gradually creating a larger left half which is always
	 * sorted
	 * Example: 1. [5, 3, 4, 1, 2]
	 *          2. [3, 5, 4, 1, 2]
	 *          3. [3, 4, 5, 1, 2]
	 *          4. [1, 3, 4, 5, 2]
	 *          5. [1, 2, 3, 4, 5]
	 */

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 7, 8, 4, 9, 6, 10, 5 };

		System.out.println("Before sort: " + Arrays.toString(array));
		System.out.println("Sorting...");
		System.out.println("After sort: " + Arrays.toString(insertionSort(array)));

	}
	
	public static int[] insertionSort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			// start by picking the second element
			int currentValue = array[i];
			// element that proceeds it
			int j = i - 1;
	
			// first condition is so we don't swap with itself
			// second condition is swapping when the proceeding element is greater
			while (j >= 0 && array[j] > currentValue) {
				array[j + 1] = array[j];
				j--;
			}
			
			array[j + 1] = currentValue;
			System.out.println("Array " +  i + ": " + Arrays.toString(array));
		}

		return array;
	}

}
