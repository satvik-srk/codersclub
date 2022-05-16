package codersclub;

import java.util.Scanner;

public class SimpleinterestDemo {
	public static void main(String[] args) {
		double p,r,t,si;
		System.out.println("Enter the values of principle,rate,time");
		Scanner scanner = new Scanner(System.in);
		p=scanner.nextDouble();
		r=scanner.nextDouble();
		t=scanner.nextDouble();
        scanner.close();
		System.out.print(Simpleinterest.simpleinterest(p, r, t));
	}

}
