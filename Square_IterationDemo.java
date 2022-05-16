package codersclub;

import java.util.Scanner;

public class Square_IterationDemo {

		public static void main(String[] args) {
			int n;
			System.out.println("Enter the number of terms:");
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
			scanner.close();
			System.out.print(Square_Iteration.sum(n));
		}
		
}
