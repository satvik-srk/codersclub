package codersclub;

import java.util.Scanner;

public class SentenceReverseDemo {
	public static void main (String[] args) {
		String sentence;
		System.out.println("Enter a sentence:");
		Scanner scanner = new Scanner(System.in);
		sentence=scanner.nextLine();
		scanner.close();
		System.out.println(SentenceReverse.reverseWords(sentence));
	}
}
