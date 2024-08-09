package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		// 성적을 입력받아서, 성적에 따른 학점 A~F를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade = 'f';
		
		//90점 이상 A
		//80점 이상 B
		//70점 이상 C
		//60점 이상 D
		//60점 미만 F
		
		if(score >= 90) {
			System.out.println("A");
		}		
		else if(score >= 80) {
			System.out.println("B");	
		}		
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
		
		// if만 사용해서 만들기
		if(score >= 90) {
			grade = 'a';
		}		
		if(score >= 80 && score < 90) {
			grade = 'b';
		}	
		if(score >= 70 && score < 80) {
			grade = 'c';
		}
		if(score >= 60 && score < 70) {
			grade = 'd';
		}
		if(score < 60) {
			grade = 'f';
		}
		
		System.out.println("학점 : " + grade);
		
		sc.close();
	}
}
