package _1000;

import java.util.Scanner;

public class _1357 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= 2*n-1; i++) {
			if( i <= n ) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			}
			else {
				// 5 6 7 : i
				// 3 2 1 : 8-i
				for (int j = 1; j <= (2*n)-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}