package _1000;

import java.util.Scanner;

public class _1035 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String hexNumber = scanner.next();

		int decimalNumber = Integer.parseInt(hexNumber, 16);

		String octalNumber = Integer.toOctalString(decimalNumber);
		System.out.println(octalNumber);

		scanner.close();
	}
}