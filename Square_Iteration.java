package codersclub;

public class Square_Iteration {
	public static int sum(int n) {
		int sum = 0,i;
        for (i = 1; i <= n; i++)
            sum += (i * i);
        return sum;
	}

}
