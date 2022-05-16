package codersclub;

import java.util.Scanner;

public class NumberOfWordsDemo {
	public static void main(String[] args) {
		String sentence;
		System.out.println("Enter the sentence:");
		Scanner scanner = new Scanner(System.in);
		sentence=scanner.nextLine();
		scanner.close();
		System.out.print(NumberOfWords.countWords(sentence));
		
	}

}
