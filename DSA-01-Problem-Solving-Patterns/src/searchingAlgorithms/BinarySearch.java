package searchingAlgorithms;

public class BinarySearch {
	/*
	 * Eliminate half of the elements instead of one element at a time. Only works
	 * on sorted arrays.
	 * Best Case - O(1)
	 * Average Case - O(log n)
	 * Worst Case - O(log n)
	 */

	public static void main(String[] args) {
		int[] array = { 2, 5, 6, 9, 13, 15, 28, 30 };
		int num = 28;
		if (binarySearch(array, num) == -1) {
			System.out.println("Value is not in the array!");
		} else {
			System.out.println("The index of the value is: " + binarySearch(array, num));
		}
	}

	public static int binarySearch(int[] array, int num) {
		// Starting index
		int beg = 0;
		// End index
		int end = array.length - 1;
		// Middle index
		int middle = (int) Math.floor((beg + end) / 2);

		// Check if the middle element is equal to the number
		while (array[middle] != num && beg <= end) {
			// if our number is lower than the middle
			if (num < array[middle]) {
				// shift the end to the lower half of the array
				end = middle - 1;
				// if our number is higher than the middle
			} else {
				// shift the start to the upper half of the array
				beg = middle + 1;
			}
			// shift the middle no matter what
			middle = (int) Math.floor((beg + end) / 2);
		}
		if (array[middle] == num) {
			return middle;
		} else {
			return -1;
		}
	}

}
