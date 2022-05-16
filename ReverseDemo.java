package codersclub;

import java.util.Scanner;

public class ReverseDemo {
	public static void main(String[] args) {
		String word;
		System.out.println("Enter a word");
		Scanner scanner = new Scanner(System.in);
	 word= scanner.nextLine();
	 scanner.close();
	 System.out.print(Reverse.reverse(word));
	}
}
