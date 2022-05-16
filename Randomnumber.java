package codersclub;
import java.util.Random;
public class Randomnumber {
	public static int random(int a) {
		Random random = new Random();
	int x=random.nextInt(100);
	return x;
	}
}
