/*The process of of rearranging the items in a collection, so that the items are in some kind of order.*/
package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
	/*
	 * Similar to bubble sort, but instead of first placing large values into sorted
	 * position, it places small values into sorted position
	 */

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 7, 8, 4, 9, 6, 10, 5 };

		System.out.println("Before sort: " + Arrays.toString(array));
		System.out.println("Sorting...");
		System.out.println("After sort: " + Arrays.toString(selectionSort(array)));

	}

	public static int[] selectionSort(int[] array) {
		// Traverse through entire array
		for (int i = 0; i < array.length; i++) {
			// assume first element is smallest
			int minIndex = i;
			// start at next element
			for (int j = i + 1; j < array.length; j++) {
				// compare this item to the next item in the array until you find a smaller number
				if (array[j] < array[minIndex]) {
					// if a smaller number is found, make that the new min & continue to the end of the array
					minIndex = j;
				}
			}
			// if the min is not the value (index) you initially began with, swap the two values 
			// we do this to avoid swapping with itself
			if (minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}

		}
		
		return array;

	}

}
