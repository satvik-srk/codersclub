package codersclub;

import java.util.regex.Pattern;

public class SentenceReverse {
	 static String reverseWords(String str)
	    {
	        Pattern pattern = Pattern.compile("\\s");
	        String[] temp = pattern.split(str);
	        String result = "";
	        for (int i = 0; i < temp.length; i++) {
	            if (i == temp.length - 1)
	                result = temp[i] + result;
	            else
	                result = " " + temp[i] + result;
	        }
	        return result;
	    }

}
