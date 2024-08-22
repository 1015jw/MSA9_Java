package _1000;

import java.util.Scanner;

public class _1093 {

	public static void main(String[] args) {

		int[] arr = new int[24];
				
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	

		for (int i = 0; i < n; i++) {
			arr[n] = n+1;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
