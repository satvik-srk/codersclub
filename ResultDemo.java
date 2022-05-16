package codersclub;

import java.util.Scanner;

public class ResultDemo {
	public static void main(String argd[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks:");
		int marks = scanner.nextInt();
		scanner.close();
		System.out.print(Result.result(marks));
	}

}
