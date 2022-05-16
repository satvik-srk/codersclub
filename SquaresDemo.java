package codersclub;

import java.util.Scanner;

public class SquaresDemo {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the number of terms:");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		System.out.print(Squares.sqr(n));

	}

}
