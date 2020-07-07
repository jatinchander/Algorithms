/*
 * Create a window which can either be an array or number from one position to another 
 * Depending on a certain condition, the window either increases or closes (and a new window is created)
 * Very useful for keeping track of a subset of data in an array/string
 */
package slidingWindow;

public class maxSubarraySum {
	/*
	 * Write a function called maxSubarraySum which accepts an array of integers and
	 * a number called n. The function should calculate the maximum sum of n
	 * consecutive elements in an array.
	 */

	/*
	 * Example: maxSubarraySum([1,2,5,2,8,1,5] , 2) // 10 
	 * Example: maxSubarraySum([1,2,5,2,8,1,5] , 4) // 17
	 */

	public static void main(String[] args) {
		
		int[] array = {1,2,5,2,8,1,5};
		
		System.out.println(maxSubArraySum(array,2));
		System.out.println(maxSubArraySum(array,4));

	}

	public static int maxSubArraySum(int[] array, int n) {
		// placeholder for max
		int maxSum = 0;

		// placeholder for initial sum
		int tempSum = 0;

		if (array.length < n) {
			return -1;
		}

		// add first n digits & assume it is the max
		for (int i = 0; i < n; i++) {
			maxSum += array[i];
		}

		tempSum = maxSum;

		for (int i = n; i < array.length; i++) {
			tempSum = tempSum - array[i - n] + array[i];
			maxSum = Math.max(maxSum, tempSum);
		}

		return maxSum;

	}

}
