//6.7.1.2
package hw.gorovtsov.arrays.main;

import hw.gorovtsov.arrays.logic.*;

public class Two {

	public static void main(String[] args) {
		int[] ar = new int[25];
		int plus = 0;
		int minus = 0;
		int zero = 0;

		ArrayWork.initRandArr(ar);

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				plus++;
			}
			
			if (ar[i] == 0) {
				zero++;
			}
			
			if(ar[i] <0) {
				minus++;
			}
		}

		System.out.print("������������� - " + plus + "\n������������� - " + minus + "\n����� ���� - " + zero);

	}
}
