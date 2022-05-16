package codersclub;

import java.util.Scanner;

public class PallindromeDemo {
	public static void main (String[] args) {
		String word;
		System.out.println("Enter the word");
		Scanner scanner = new Scanner(System.in);
		word = scanner.nextLine();
		scanner.close();
		System.out.print(Pallindrome.pallindrome(word));
	}

}
