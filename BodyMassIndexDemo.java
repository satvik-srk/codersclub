package codersclub;

import java.util.Scanner;

public class BodyMassIndexDemo {
	public static void main(String args[]) {
		float h,w,bmi;
		System.out.println("Enter the values of weight and height:");
		Scanner scanner = new Scanner(System.in);
		 w = scanner.nextFloat();
		 h = scanner.nextFloat();
		scanner.close();
		System.out.print(BodyMassIndex.bmi(h, w));
	}
}
