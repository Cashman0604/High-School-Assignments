package projects;

public class projects {
	public static void main(String[]args){
		final int NUM1 = 3;
		final int NUM2 = 7;
		final int NUM3 = 6;
		int answer = NUM1 + NUM2*NUM3;
		System.out.println("****.****.****.****.*");
		System.out.println("                    "+NUM1 +" + "+NUM2+" * "+NUM3 +" = "+answer);
		System.out.println("");
		
		char let1 = 'C';
		char let2 = 'A';
		char let3 = 'S';
		char let4 = 'H';
		System.out.println("****.***");
		System.out.println("       "+let1+"  "+let2+"  "+let3+"  "+let4);
		System.out.println("       "+(int)let1 +" "+ (int)let2 +" "+ (int)let3 +" "+ (int)let4);
		System.out.println("       "+((int)let1 + (int)let2 + (int)let3 + (int)let4));
		System.out.println("");
		
		double doub1=9.2;
		double doub2=8.45;
		double doub3=.29;
		double doub4=27;
		double answer_= (doub1-doub2)+doub3*doub4;
		System.out.println("****.****.****.*");
		System.out.printf("               (%.3f - %.3f) + %.3f * %.3f = %.3f",doub1,doub2,doub3,doub4,answer_);
	}
}