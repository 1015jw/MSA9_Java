package Day07.Review;

import java.util.Scanner;

/**
 * 더조은컴퓨터아카데미에서 김조은 팀장에게 예산을 주고 에어컨을 구매하라고 지시하였다. 이때 에어컨 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비 : 657825 50000 : 13개 10000 : 0개 5000 : 1개 1000 : 2개 500 : 1개 100 : 3개 50
 * : 0개 10 : 2개 5 : 1개 1 : 0개 위와 같이 입력하면, 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램을
 * 작성하시오
 */
public class Ex03_화폐매수 {

	public static void main(String[] args) {

		/*
		 * 1. 필요한 변수 선언 2. 구매비 입력 3. 화폐매수 계산 3-1. 화폐매수 계산 (화폐매수) = (입력금액) / (화폐단위) 3-2.
		 * 잔액 계산 657825 - (50000 * 13) i) (잔액) = (입력금액 - (화폐단위 * 화폐매수) ii) (잔액) = (입력금액
		 * % (입력금액) % (화폐단위) 3-3. 화폐 단위 변환 번갈아 가면서, /5, /2 연산을 반복 (화폐단위) = (화폐단위) / 5
		 * (화폐단위) = (화폐단위) / 2 4. 3번 과정을 반복
		 */

		/*
		 * Scanner sc = new Scanner(System.in); int cost = sc.nextInt(); sc.close();
		 * 
		 * System.out.println("50000 : " + cost/50000); int how50000 = cost/50000; int
		 * after50000 = cost-(how50000*50000);
		 * 
		 * System.out.println("10000 : " + after50000/10000); int how10000 =
		 * after50000/10000; int after10000 = cost-(how50000*50000)-(how10000*10000);
		 * 
		 * System.out.println("5000 : " + after10000/5000); int how5000 =
		 * after10000/5000; int after5000 =
		 * cost-(how50000*50000)-(how10000*10000)-(how5000*5000);
		 * 
		 * System.out.println("1000 : " + after5000/1000); int how1000 = after5000/1000;
		 * int after1000 =
		 * cost-(how50000*50000)-(how10000*10000)-(how5000*5000)-(how1000*1000);
		 * 
		 * System.out.println("500 : " + after1000/500); int how500 = after1000/500; int
		 * after500 =
		 * cost-(how50000*50000)-(how10000*10000)-(how5000*5000)-(how1000*1000)-(how500*
		 * 500);
		 * 
		 * System.out.println("100 : " + after500/100); int how100 = after500/100; int
		 * after100 =
		 * cost-(how50000*50000)-(how10000*10000)-(how5000*5000)-(how1000*1000)-(how500*
		 * 500)-(how100*100);
		 * 
		 * System.out.println("50 : " + after100/50); int how50 = after100/50; int
		 * after50 =
		 * cost-(how50000*50000)-(how10000*10000)-(how5000*5000)-(how1000*1000)-(how500*
		 * 500)-(how100*100)-(how50*50);
		 * 
		 * System.out.println("10 : " + after50/10); int how10 = after50/10; int after10
		 * =
		 * cost-(how50000*50000)-(how10000*10000)-(how5000*5000)-(how1000*1000)-(how500*
		 * 500)-(how100*100)-(how50*50)-(how10*10);
		 * 
		 * System.out.println("5 : " + after10/5); int how5 = after10/5; int after5 =
		 * cost-(how50000*50000)-(how10000*10000)-(how5000*5000)-(how1000*1000)-(how500*
		 * 500)-(how100*100)-(how50*50)-(how10*10)-(how5*5);
		 * 
		 * System.out.println("1 : " + after5/1); int how1 = after5/1; int after1 =
		 * cost-(how50000*50000)-(how10000*10000)-(how5000*5000)-(how1000*1000)-(how500*
		 * 500)-(how100*100)-(how50*50)-(how10*10)-(how5*5)-(how1*5);
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("구매비 : "); int input =
		 * sc.nextInt(); int money = 50000; boolean sw = true;
		 * 
		 * while (money >= 1) { // 화폐매수 계산 int count = input / money;
		 * System.out.println(money + "\t\t: " + count);
		 * 
		 * // 잔액 계산 input = input % money; // input = input - (50000 * count);
		 * 
		 * // 화폐단위 변환 if (sw) { money = money / 5; } else { money = money / 2; } sw =
		 * !sw; }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("구매비 : ");
		int input = sc.nextInt();
		// int money = 50000;
		int money[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		// boolean sw = true;
		int i = 0;

		while (i <= 9) {
			// 화폐매수 계산
			int count = input / money[i];
			System.out.println(money[i] + "\t\t: " + count + "개");

			// 잔액 계산
			input = input % money[i]; // input = input - (50000 * count);

			// 화폐단위 변환
			i++;
		}

		sc.close();

	}
}
