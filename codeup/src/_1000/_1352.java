package _1000;

import java.util.Scanner;

public class _1352 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for (int A = 1; A <= n; A++) {
			
			for (int B = 1; B <= n; B++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
		sc.close();
	}
}

