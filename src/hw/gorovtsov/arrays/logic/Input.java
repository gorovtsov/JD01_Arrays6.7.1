package hw.gorovtsov.arrays.logic;

import java.util.Scanner;

public class Input {
	public static int nextInt() {
		
		Scanner sc = new Scanner(System.in);
		
		int x=0;
		
		System.out.println("¬ведите целое число: ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("¬ведите целое число: ");
		}
		x = sc.nextInt();
		
		sc.close();
		
		return x;
	}
}
