package codersclub;

import java.util.Scanner;

public class DivisionDemo {
	public static void main(String[] args) {
		float div,dvd,q,r;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dividend and divisor");
		div=scanner.nextFloat();
		dvd=scanner.nextFloat();
		scanner.close();
		System.out.print(Division.divide(dvd, div));
	}
}
