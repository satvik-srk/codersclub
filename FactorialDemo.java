package codersclub;

import java.util.Scanner;

public class FactorialDemo {
	public static void main(String[] args) {
		int a;
		System.out.println("Enter the number:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		scanner.close();
		System.out.print(Factorial.factorial(a));
	}

}
