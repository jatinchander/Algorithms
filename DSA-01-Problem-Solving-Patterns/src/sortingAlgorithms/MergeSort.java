/*The process of of rearranging the items in a collection, so that the items are in some kind of order.*/
package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
	/*
	 * Recursive algorithm which divides array into smaller arrays until you get a
	 * single element, then merge the array back up.
	 * Example: 1. [10, 24, 76, 73]
	 *          2. [10, 24] [76,73] divided original array into halves
	 *          3. [10] [24] [76] [73] divide again by half
	 *          4. [10, 24] [76] [73] merge the left half (10, 24)
	 *          5. [10, 24] [76, 73] merge the right half (76, 73)
	 *          6. [10, 24] [73, 76] sort the right half 
	 *          7. [10, 24, 73, 76] sort both halves
	 * Best case: O(n log n)
	 * Average case: O(n log n)
	 * Worst case: O(n log n)
	 * Space: O(n)
	 */
		
	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 7, 8, 4, 9, 6, 10, 5 };

		System.out.println("Before sort: " + Arrays.toString(array));
		System.out.println("Sorting...");
		System.out.println("After sort: " + Arrays.toString(mergeSort(array)));
	}
	
	// merge method
	public static int[] merge(int[] left, int[] right) {
		// placeholder for results
		int[] result = new int[left.length + right.length];
		
		// placeholder for pointers
		int leftPointer = 0;
		int rightPointer = 0;
		int resultPointer = 0;
		
		// continue merging until pointer is at end of one of the arrays
		while(leftPointer < left.length || rightPointer < right.length) {
			
			// case 1: both sub-arrays have elements in them
			if(leftPointer < left.length && rightPointer < right.length) {
				// when the element in the left sub-array is smaller
				if(left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				}
				else { // when element in the right sub-array is smaller
					result[resultPointer++] = right[rightPointer++];
					
				}
			} // end if
			
			// case 2: if there are only elements in the left sub-array
			else if(leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			}
			
			// case 3: if there are only elements in the right sub-array
			else if(rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}
			
		} // end while
		
		return result;
		
		
	}
	
	
	public static int[] mergeSort(int[] array) {
		// base case
		if(array.length <= 1) {
			return array;
		}
		
		int midpoint = array.length / 2;
		
		// placeholder for left sub-array
		int[] left = new int[midpoint];
		
		// placeholder for right sub-array
		int[] right;
		
		// if initial array is even
		if(array.length % 2 == 0) {
			right = new int[midpoint];
		}
		else { // if initial array is odd
			right = new int[midpoint + 1];
		}
		
		// populate left sub-array
		for(int i = 0; i < midpoint; i++) {
			left[i] = array[i];
		}
		
		// populate right sub-array
		for(int j = 0; j < right.length; j++) {
			right[j] = array[midpoint+j];
		}
		
		// placeholder for results
		int[] result = new int[array.length];
		
		// recursive calls
		left = mergeSort(left);
		right = mergeSort(right);
		
		result = merge(left, right);
		
		return result;
	}

}
