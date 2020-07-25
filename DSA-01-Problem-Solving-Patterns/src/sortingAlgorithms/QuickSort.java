/*The process of of rearranging the items in a collection, so that the items are in some kind of order.*/
package sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
	/*
	 * Select an element ("pivot") Find index where the pivot should end up, by
	 * moving smaller elements to the left and larger elements to the right 
	 * When you see a smaller number, you swap
	 * Keep track of how many numbers you swapped & move the pivot to that index, then repeat
	 * Best case: O(n log n) 
	 * Average case: O(n log n) 
	 * Worst case: O(n^2) 
	 */

	public static void main(String[] args) {
		int[] array = {9,4,8,2,1,5,7,6,3};
		
		System.out.println("Before sort: " + Arrays.toString(array));
		System.out.println("Sorting..."); System.out.println("After sort: " +
		Arrays.toString(quicksort(array, 0, array.length - 1)));
	}
	
	// helper swap method
	public static int[] swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
		return array;
	}
	
	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	public static int partition(int[] array, int start, int end) {
		// choose last element as pivot
		int pivot = array[end];
		// placeholder for pivot index (eventually will be swapped to after this index)
		int i = start - 1;
		
		// traverse through array
		for(int j = start; j < end; j++) {
			// compare pivot with elements in array
			if(array[j] < pivot) {
				// increment pivotIndex
				i++;
				// swap
				swap(array, i, j);
			}
		}
		
		// move the pivot to it's correct spot
		swap(array, i+1, end);	
		
		return i+1;
		
	}
	
	public static int[] quicksort(int[] array, int start, int end) {
		// base case, as long as there as more than one element
		if (start < end) {
			// returns correct index for pivot
			int pivotIndex = partition(array, start, end);
			// recursively sort from start until pivot
			quicksort(array, start, pivotIndex - 1);
			// recursively sort from after pivot to end
			quicksort(array, pivotIndex + 1, end);
		}

		return array;
	}

}
