package _1000;

import java.util.Scanner;

public class _1503 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// System.out.print(n);
		
		int arr[][];
		arr = new int[n][n];
		
		int n2 = n;
		
		// arr[0][0] = n2;
		
		for (int i2 = 0; i2 < n; i2++) {
			for (int j2 = 0; j2 < arr[i2].length; j2++) {
				arr[n2][n2] = n2;
				n2= n2-1;
			}
		}
			
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}					
			System.out.println();
		}
		sc.close();
	}
}
