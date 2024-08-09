package Day03;

import java.util.Scanner;

public class Ex02_IfElse {

	public static void main(String[] args) {		
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if ( num == 0) {
				System.out.println("0");
			}		
			else if ( (num % 2) == 0) {
				System.err.println("짝");
			}
			else {
				System.out.println("홀");
			}
			sc.close();
	}
}
