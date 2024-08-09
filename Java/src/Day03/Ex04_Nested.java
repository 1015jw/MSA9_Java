package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 합격 기준
		// (조건) 4학년, 60점 이상
		System.out.print("학년 : ");
		int year = sc.nextInt();

		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// ** 중첩 if문은 권장하지 않습니다
		/*
		if(year == 4) {
			if(score >= 60) {
				System.out.println("합격!");
			}
			else {
				System.out.println("불합격!");
			}
		}
		else {
			System.out.println("응시 자격이 없습니다.");
		}
		*/
		
		if(year < 4) {
			System.out.println("응시 자격이 없습니다");
		}
		else if(score >= 60){
			System.out.println("합격!");
		}
		else {
			System.out.println("불합격!");
		}
		
		if( year == 4 && score >= 60) {
			// 합
		}
		else if (year == 4) {
			// 불합
		}
		else {
			// 응시 자격 없음
		}
		
		sc.close();
	}
}
