package codersclub;

import java.util.Scanner;

public class Maximum_3Demo {
     public static void main(String args[]) {
    	 int a,b,c;
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("Enter the 3 numbers:");
    	 a=scanner.nextInt();
    	 b=scanner.nextInt();
    	 c=scanner.nextInt();
    	 scanner.close();
    	 System.out.print(Maximum_3.findMax(a, b, c));
     }
}
