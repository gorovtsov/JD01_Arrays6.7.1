package hw.gorovtsov.arrays.logic;

public class ArrayWork {

	public static int[] initRandArr(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) ((Math.random() * 500) - 250);
		}

		return ar;
	}

	public static int getZeroCount(int[] ar) {
		int count = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				count++;
			}
		}
		return count;
	}

	public static void printArInt(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%4d] ",ar[i]);
		}
	}

}
