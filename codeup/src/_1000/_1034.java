package _1000;

import java.util.Scanner;

public class _1034 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String octalNumber = scanner.next();
        
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        
        System.out.println(decimalNumber);
        
        scanner.close();
    }
}
