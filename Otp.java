package codersclub;

import java.util.Random;

public class Otp {
public static String otp(int num) {
	Random random = new Random();
	int number = random.nextInt(999999);
	 return String.format("%06d", number);
	}
}
