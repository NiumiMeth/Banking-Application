package bankingApplication;

import java.util.Scanner;

public class ScannerTest {
	public static void main (String[] arge) {
		//TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character ");
		//int a = scanner.nextInt();
		char c = scanner.next().charAt(0);
		System.out.println("value = "+c);
		
	}
}
