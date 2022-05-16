package codersclub;

import java.util.Scanner;

public class EvenorOddDemo {
	public static void main(String args[]) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		a=scanner.nextInt();
	    scanner.close();
		System.out.print(EvenorOdd.findevenorodd(a));
	}

}
