package codersclub;

public class Gcd {
	public static int findgcd(int a, int b) {
		while(a!=b)
			if (a>b)
				a=a-b;
			else
				b=b-a;
		return a;
		
	}

}
