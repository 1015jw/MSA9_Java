package _1000;

import java.util.Scanner;

public class _1032 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        
        int decimalNumber = scanner.nextInt();
        
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        
        System.out.println(hexadecimalNumber);
        
        scanner.close();
    }
}
