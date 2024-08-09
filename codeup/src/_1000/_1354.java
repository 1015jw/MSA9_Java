package _1000;

import java.util.Scanner;

public class _1354 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for (int A = n; A >= 1; A--) {
			
			for (int B = 1; B <= A; B++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		sc.close();
	}
}