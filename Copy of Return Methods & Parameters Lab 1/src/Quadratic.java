
public class Quadratic {
	/**
	 * create two methods, one for root one and one for root two
	 * each method must have an appropriate return type & 
	 * parameters
	 * */

	public static double rootOne(double a, double b, double c) {
	double bSqr=Math.pow(b,2);
	double descrimPt2=-4*a*c;
	double bottom = 2*a;
	double descrim = bSqr+descrimPt2;
	return (-(b*-1)+Math.sqrt(descrim))/bottom;
	}
	public static double rootTwo(double a, double b, double c) {
		double bSqr=Math.pow(b,2);
		double descrimPt2=-4*a*c;
		double bottom = 2*a;
		double descrim = bSqr+descrimPt2;
		return (-(b*-1)+Math.sqrt(descrim))/bottom;
		}
}
