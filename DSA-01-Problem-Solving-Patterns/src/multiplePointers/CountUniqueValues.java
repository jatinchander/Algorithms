/*
 * Create pointers or values that correspond to an index or position 
 * & move towards the beginning, end, or 
 * middle based on a certain condition
 */
package multiplePointers;

public class CountUniqueValues {
	/*
	 * Implement a function called countUniqueValues, which accepts a sorted array,
	 * and counts the unique values in the array. There can be negative numbers in
	 * the array, but it will always be sorted.
	 */

	/*
	 * Example: countUniqueValues([1,1,1,1,1,2]) // 2 
	 * Example: countUniqueValues([1,2,3,4,4,4,7,7,12,12,13]) // 7
	 */
	public static void main(String[] args) {
		int [] arrayOne = {1,1,1,1,1,2};
		
		//                 i, j
		int [] arrayTwo = {1, 2, 3, 4, 4, 4, 7, 7, 12, 12, 13};
		System.out.println(countUniqueValues(arrayOne));
		System.out.println(countUniqueValues(arrayTwo));

	}

	public static int countUniqueValues(int[] array) {
		// initialize count
		int count = 0;

		// first index
		int i = 0;
		
		
		for(int j = 1; j < array.length; j++) {
			if(array[i] != array[j]) {
				count++;
				i++;
				array[i] = array[j];
			}
		}



		return count+1;
	}

}
