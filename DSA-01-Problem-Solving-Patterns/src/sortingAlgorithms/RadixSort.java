/*The process of of rearranging the items in a collection, so that the items are in some kind of order.*/
package sortingAlgorithms;

public class RadixSort {
	/*
	 * Sorting algorithm that doesn't use comparisons, but instead exploits the fact
	 * that information about the size of a number is encoded in the number of
	 * digits. More digits mean bigger number
	 *      1. Buckets of 0-9
	 *      2. Place numbers in these buckets starting with the right most digit
	 *      3. Reform list
	 *      4. Repeat with the tens digits and so on  
	 * Best case: O(n log n) 
	 * Average case: O(n log n) 
	 * Worst case: O(n^2)
	 */

	public static void main(String[] args) {

	}
	
	// helper getDigit method - returns digit at a certain place (from right)
	public static int getDigit(int number, int place) {
		return (int) (Math.floor(Math.abs(number) / Math.pow(10, place)) % 10);
		/*
		 * Example: getDigit(7323, 2) 
		 * 7323 / 10^2 = 7323 / 100 = 73.23 
		 * Floor(73.23) = 73 
		 * 73 %10 = 3
		 */
	}
	
	// helper digitCount method - returns number of digits in a number
	public static int digitCount(int number) {
		if(number == 0) {
			return 1;
		}
		return (int) (Math.floor(Math.log10(Math.abs(number))) + 1);
	}
	
	// helper mostDigits method - returns the max number of digits for a number in list
	public static int mostDigits(int[] array) {
		int maxDigits = 1;
		for (int i = 0; i < array.length; i++) {
			maxDigits = Math.max(maxDigits, digitCount(array[i]));
		}

		return maxDigits;
	}
	
	/*
	 * public static int[] radixsort(int[] array) { // gets biggest number of digits
	 * - this let's us know how many times to repeat int maxDigitCount =
	 * mostDigits(array);
	 * 
	 * for(int k = 0; k < maxDigitCount; k++) {
	 * 
	 * } }
	 */

}
