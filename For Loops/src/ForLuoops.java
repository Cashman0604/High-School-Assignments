import java.util.Scanner;
public class ForLuoops {
	public static void main (String [] args) {
		/**
		 * All test cases are provided. 
		 * Uncomment each part as you finish & are ready to test
		 */
		//Part 1 Test
		row5Stars();
		
		//Part 2 Test
		row5Stars2();
		
		//Part 3 Tests
		rowNStars();
		rowNStars();
		rowNStars();
		
		//Part 4 Tests
		colNStars();
		colNStars();
		colNStars();
		
		//Part 5 Tests
		colNValues();
		colNValues();
		colNValues();
		
		//Part 6 Tests
		MtoNValues();
		MtoNValues();
		MtoNValues();
	}
	
	//Part 1
	/**
	 * WAM (write a method) that will output 
	 * five stars in a row using a while loop. 
	 */
	public static void row5Stars() {
		int x =0;
		while(x<5){
			x++;
			System.out.print("*");
		}
		System.out.println("");
	}
	
	/**
	 * WAM (write a method) that will output 
	 * five stars in a row using a for loop. 
	 */
	//Part 2
	public static void row5Stars2() {
		for(int x=0; x<5;x++){
			System.out.print("*");
		}
		System.out.println("");
	}
	
	/**
	 * WAM (write a method) that will ask the
	 *  user how many stars to print in a row 
	 *  using a for loop. You will need a Scanner. 
	 *  Remember to prompt the user.
	 */
	//Part 3
	public static void rowNStars() {
		Scanner kb = new Scanner(System.in);
		System.out.print("How Many Stars Fren?\n");
		int x=kb.nextInt();
		for(;x>0;x--){
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	/**
	 * WAM (write a method) that will ask the 
	 * user how many stars to print in a COLUMN 
	 * using a for loop. You will need a Scanner. 
	 * Remember to prompt the user.
	 */
	//Part 4
	public static void colNStars() {
		Scanner kb = new Scanner(System.in);
		System.out.print("How Many Stars Fren?\n");
		int x=kb.nextInt();
		for(;x>0;x--){
			System.out.print("*\n");
		}
	}
	
	/**
	 * WAM (write a method) that will ask the 
	 * user how many numbers to print in a column 
	 * using a for loop.
	 */
	//Part 5
	public static void colNValues() {
		Scanner kb = new Scanner(System.in);
		System.out.print("How Many Numbers Fren?\n");
		int x=kb.nextInt();
		int y=x;
		for(;x>0;x--){
			System.out.print(y+"\n");
			y--;
		}
	}
	
	/**
	 * WAM (write a method) that will ask the user 
	 * for two integers then print the numbers 
	 * within that range one a single line using 
	 * a for loop.
	 */
	//Part 6
	public static void MtoNValues() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Two Numbers Pls(smol 1st, lorge 2nd)\n");
		int x=kb.nextInt();
		int y=kb.nextInt();
		for(;x<y;x++){
			System.out.print(x+"\n");
		}
		System.out.print(y+"\n");
	}
}