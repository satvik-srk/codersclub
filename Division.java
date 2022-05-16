package codersclub;
public class Division {
	public static float[] divide(float dvd, float div) {
		float[] result = new float[3];
	    result[0] = dvd/div;
	    result[1] = dvd%div;
	     return result;
	  }
}
