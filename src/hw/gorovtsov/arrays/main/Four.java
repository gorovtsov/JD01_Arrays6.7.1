//6.7.1.4
package hw.gorovtsov.arrays.main;

public class Four {

	public static void main(String[] args) {
		int[] ar = { 2, 4, 3, 4, 5, 2, 3, 2, 2, 5, 5, 4, 5, 2 };
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] <= 2) {
				count++;
			}
		}

		System.out.print(count);
	}

}
