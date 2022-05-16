package codersclub;

public class Result {
	public static int result(int marks) {
		if(marks>=70 && marks<=100 )
			System.out.println("FCD");
		if(marks>=60 && marks<=70)
			System.out.println("FC");
		if(marks>=50 && marks<=60)
			System.out.println("SC");
		if(marks>=35 && marks<=60)
			System.out.println("PASS");
		if(marks<35)
			System.out.println("FAIL");
		return marks;
		
	}

}
