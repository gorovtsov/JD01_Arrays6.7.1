//6.7.1.1
package hw.gorovtsov.arrays.main;

import hw.gorovtsov.arrays.logic.*;

public class One {

	public static void main(String[] args) {
		int[] ar = { 5, 3, 5, 0, 7, 8, 0, 1, 2, 0 };

		int count = ArrayWork.getZeroCount(ar);

		int[] rezAr = new int[count];
		
		
		for (int i = 0; i < rezAr.length; i++) {
			for (int j = 0; i < ar.length; j++) {
				if(ar[j]==0) {
					rezAr[i]=j;
					ar[j]++;
					break;
				}
			}
		}
		
		ArrayWork.printArInt(rezAr);
	}
}
