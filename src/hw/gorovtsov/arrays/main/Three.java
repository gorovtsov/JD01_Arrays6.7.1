//6.7.1.3
package hw.gorovtsov.arrays.main;

import hw.gorovtsov.arrays.logic.*;

public class Three {

	public static void main(String[] args) {
		int[] ar = new int[15];
		int temp = 0;
		
		ArrayWork.initRandArr(ar);
		
		ArrayWork.printArInt(ar);
		
		for(int i = 1; i<ar.length;i+=2) {
			temp=ar[i];
			ar[i]=ar[i-1];
			ar[i-1]=temp;
		}
		
		System.out.println();
		ArrayWork.printArInt(ar);
	}

}
