package Day03;

import java.util.Scanner;

public class Ex16_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 무한루프
		// : 반드시 종료조건을 추가해줘야 한다
		while(true) {
			System.out.println("입력 : ");
			String input = sc.nextLine(); // 문자열 한 줄 입력
			
			if ( input.equals("STOP")) {
				break;
			}
			System.out.println(">> " + input);
		}
		System.out.println("프로그램을 종료합니다");
		sc.close();
	}
}
