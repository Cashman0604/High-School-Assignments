package whileLoopLab2;

public class WhileLoop2 {
public static void main(String [] args) {
		
		Integer [] list = {234, 10000, 111, 9005, 84645, 8547, 123456789};
		
		System.out.println("********** Part 1 **********");
		for (int num : list) {
			digitCounter(num);	
		}
		
		System.out.println("\n\n********** Part 2 **********");
		for (int num : list) {
			reverseNumber(num);
		}
			
	}
	
	/**
	 * Part 1
	 * Write a program that will take an integer number 
	 * and count up how many digits the number contains.  
	 * You must use a while loop and % to access each of 
	 * the individual digits.  Use / to reduce the number 
	 * so that you can count all of the digits.
	 * */
	
	public static void digitCounter(int num) {
		
		int digits = 0;
		int numb=num;
		while(numb>0){
			digits++;
			numb=numb/10;
		}
		System.out.println(num + " contains " + digits + " digits\n");
	}
	
	/**
	 * Part 2
	 * Write a program that will take an integer and reverse it.  
	 * You must use a while loop and % to perform the reverse.
	 * */
	
	public static void reverseNumber(int num) {
		int reverseNum=0;
		int numb=num;
		while(numb>0){
			reverseNum=reverseNum*10+numb%10;
			numb=numb/10;
		}
		
		System.out.println(num + " reversed is " + reverseNum + "\n");
	}
}
