package codersclub;

import java.util.Scanner;

public class MaximumDemo {
	public static void main(String args[]) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the two numbers:\n");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		System.out.print(Maximum.findMax(a, b));
	}
}
