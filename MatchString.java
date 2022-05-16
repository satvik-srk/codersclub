package codersclub;
import java.util.regex.*;

public class MatchString {
		public static String main(String match)
		{
			String regex = "(Bangalore)";
			Pattern pattern = Pattern.compile(regex);
			String stringToBeMatched= "I Live In Bangalore";
			Matcher matcher= pattern.matcher(stringToBeMatched);
			String stringToBeReplaced = "Mysore";
			StringBuilder builder= new StringBuilder();
			System.out.println("After Replacement: "+ matcher.replaceAll(stringToBeReplaced));
			return "Before Replacement: " + match;
		}
	}



