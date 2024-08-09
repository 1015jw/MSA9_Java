package Day03;

public class Ex12_For {

	public static void main(String[] args) {
		// for( 초기식 ; 조건식 ; 증감식 ) { }
		// - 실행 순서 : 1 → 반복(2 → 3 → 4)
		
		// 1. 1~10까지 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2. 50~100 정수
		for (int a = 50; a <= 100; a++) {
			System.out.print(a + " ");
			if( (a+1) % 10 == 0 )
				System.out.println();
		}
		System.out.println();		
		
		
		// 3. 1~20 정수 중 짝수
		for (int b = 2; b <= 20; b+=2) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		// 4. 1~20 정수 중 홀수
		for (int c = 1; c <= 20; c+=2) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
}
