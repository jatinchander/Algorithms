package searchingAlgorithms;

public class LinearSearch {
	/*
	 * Look at every element in the array and check if it's the value we want.
	 * Best Case - O(1)
	 * Average Case - O(n)
	 * Worst Case - O(n)
	 */
	public static void main(String[] args) {
		int[] array = {5, 8, 1, 100, 12, 3, 12};
		int num = 10;
		if(linearSearch(array, num) == -1) {
			System.out.println("Value is not in the array!");
		}
		else {
			System.out.println("The index of the value is: " + linearSearch(array, num));
		}

	}

	public static int linearSearch(int[] array, int num) {
		/*
		 * Loop through an array & and check if the current array element is equal to
		 * the value. If it is, return the index
		 */
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				return i;
			}
		}
		return -1;
	}

}
