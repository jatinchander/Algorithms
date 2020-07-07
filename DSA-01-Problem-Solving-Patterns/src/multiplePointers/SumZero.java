/*
 * Create pointers or values that correspond to an index or position 
 * & move towards the beginning, end, or 
 * middle based on a certain condition
 */
package multiplePointers;

import java.util.Arrays;

public class SumZero {
	/*
	 * Write a function called sumZero which accepts a sorted array of integers. The
	 * function should find the first pair where the sum is 0. Return an array that
	 * includes both values that sum to zero or undefined if a pair does not exist.
	 */

	/*
	 * Example: sumZero([-3,-2,-1,0,1,2,3]) // [-3,3] 
	 * Example: sumZero([-2,0,1,3]) // undefined 
	 * Example: sumZero([-1,2,3]) // undefined
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayOne = {-3,-2,-1,0,1,2,3};
		int [] arrayTwo = {-2,0,1,3};
		int [] arrayThree = {-1,2,3};
		
		System.out.println(Arrays.toString(sumZero(arrayOne)));
		System.out.println(Arrays.toString(sumZero(arrayTwo)));
		System.out.println(Arrays.toString(sumZero(arrayThree)));

	}

	public static int[] sumZero(int[] array) {
		// set index for first element
		int left = 0;

		// set index for last element
		int right = array.length - 1;
		
		while(left < right) {
			int sum = array[left] + array[right];
			if(sum == 0) {
				int[] arrayIndex = new int[2];
				arrayIndex[0] = array[left];
				arrayIndex[1] = array[right];
				return arrayIndex;
			}
			else if(sum > 0) {
				right--;
			}
			else {
				left++;
			}
		}
		return null;
	}

}
