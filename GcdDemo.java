package codersclub;

import java.util.Scanner;

public class GcdDemo {
	public static void main(String args[]) {
		int a,b;
		System.out.println("Enter the two numbers:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b=scanner.nextInt();
		scanner.close();
		System.out.print(Gcd.findgcd(a, b));
		
	}

}
