package codersclub;

public class Reverse {
	public static String reverse(String word) {
		 byte[] strAsByteArray = word.getBytes();
		 byte[] result = new byte[strAsByteArray.length];
	      for (int i = 0; i < strAsByteArray.length; i++)
	        result[i] = strAsByteArray[strAsByteArray.length - i - 1];
	         System.out.println(new String(result));
			    return word;
	}

}
