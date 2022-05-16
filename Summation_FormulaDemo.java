package codersclub;

import java.util.Scanner;

public class Summation_FormulaDemo {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the number of terms:");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		System.out.print(Summation_Formula.sum(n));

	}

}
