package codersclub;

import java.util.Scanner;

public class VowelOrConsonantDemo {
	public static void main(String args[]) {
		System.out.println("Enter an alphabet");
		Scanner scanner = new Scanner(System.in);
		String alphabet = scanner.next();
		scanner.close();
		System.out.print(VowelOrConsonant.vow(alphabet));
		
	}

}
