package _1000;

import java.util.Scanner;

public class _1253 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
		
		/*
		if( a < b ) {
			while (a <= b)
			{
			System.out.print(a + " ");
			a++;
			}
		}
		else {
			while (b <= a)
			{
			System.out.print(b + " ");
			b++;
			}
		}
		*/
		sc.close();
	}
}
