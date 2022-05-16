package codersclub;

public class VowelOrConsonant {
	public static String vow(String ch) {
		String str = "aeiouAEIOU";
        return (str.indexOf(ch) != -1) ? "Vowel": "Consonant";
		
	}

}
