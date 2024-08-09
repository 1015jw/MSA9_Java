package Day03;

import java.util.Scanner;

public class Ex01_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 입력받은 값이 홀수인지, 짝수인지 조건문으로 판단하시오.
		// if 조건문
		// * if ( 조건식 ) { }
		
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
