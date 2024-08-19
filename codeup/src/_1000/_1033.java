package _1000;

import java.util.Scanner;

public class _1033 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int decimalNumber = scanner.nextInt();
        
        String hexadecimalNumber = Integer.toHexString(decimalNumber).toUpperCase();
        
        System.out.println(hexadecimalNumber);
        
        scanner.close();
    }
}