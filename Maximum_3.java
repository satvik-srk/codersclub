package codersclub;

public class Maximum_3 {
	public static  int findMax(int m, int n, int o) {
		if(m>n & m>o)
			return m;
		if(n>m & n>o) 
			return n;
		else
		    return o;	
	}

}
