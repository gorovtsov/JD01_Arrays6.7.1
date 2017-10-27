// 6.7.1.5
package hw.gorovtsov.arrays.main;

public class Five {

	public static void main(String[] args) {
		int[] ar = new int[10];

		for (int i = 1; i < ar.length; i += 2) {
			ar[i - 1] = (int) (Math.random() * 10);
			ar[i] = (int) Math.pow(ar[i - 1], 2);
			System.out.printf("[%3d][%3d]\n", ar[i - 1], ar[i]);
		}

	}

}
