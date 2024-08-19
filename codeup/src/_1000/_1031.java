package _1000;

import java.util.Scanner;

public class _1031 {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int decimalNumber = scanner.nextInt();
	        
	        String octalNumber = Integer.toOctalString(decimalNumber);
	        
	        System.out.println(octalNumber);
	        
	        scanner.close();
	    }
	}