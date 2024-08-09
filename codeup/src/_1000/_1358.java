package _1000;

import java.util.Scanner;

public class _1358 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <=(n+1)/2; i++) {
			for (int j = 1; j <= (n+1)/2 -i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		sc.close();
	}
}
