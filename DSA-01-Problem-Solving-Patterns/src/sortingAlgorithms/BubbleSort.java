/*The process of of rearranging the items in a collection, so that the items are in some kind of order.*/
package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
	/* A sorting algorithm where the largest values bubble up to the top. */

	public static void main(String[] args) {
		int [] array = {1, 3, 2, 7, 8, 4, 9, 6, 10, 5};
		
		System.out.println("Before sort: " + Arrays.toString(array));
		System.out.println("Sorting...");
		System.out.println("After sort: " + Arrays.toString(optimizedBubbleSort(array)));

	}
	
	public static int[] optimizedBubbleSort(int[] array) {
		/*
		 * This is optimized because you're doing less comparisons
		 */		
		
		// outer loop traverse from end
		for (int i = array.length; i > 0; i--) {
			// inner loop traverse from beginning
			for (int j = 0; j < i-1; j++) {
				// check to see if the current element is greater than the next element
				if (array[j] > array[j + 1]) {
					// swap
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		return array;
	} // end naiveBubbleSort

	public static int[] naiveBubbleSort(int[] array) {
		/*
		 * This is naive because you're doing redundant comparisons
		 */		
		
		// outer loop traverse from beginning
		for (int i = 0; i < array.length; i++) {
			// inner loop traverse from beginning
			for (int j = 0; j < array.length; j++) {
				// check to see if the current element is greater than the next element
				if (array[j] > array[j + 1]) {
					// swap
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		return array;
	} // end naiveBubbleSort

}
