package codersclub;

public class Pallindrome {
	public static boolean pallindrome(String word) {
		int i = 0, j = word.length()- 1;
		while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
      }     
            return true;
	}
 }
