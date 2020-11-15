/*A process (a function in our case) that calls itself*/
package recursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibRecursive(8));

	}
	
	public static int fibRecursive(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return fibRecursive(n-1) + fibRecursive(n-2);
		}
	}

}
