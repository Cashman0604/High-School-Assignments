import java.util.Scanner;
import static java.lang.System.*;
@SuppressWarnings("resource")
public class ReturnMethodsAndParamRunner2 {
	public static void main (String [] args) {
		firstLast();
		firstLast();
		firstLast();
		firstHalf();
		firstHalf();
		firstHalf();
		greeting();
		greeting();
		greeting();
	}
	public static void firstLast(){
		Scanner kb = new Scanner(System.in);
		
			//Part 1 Testers
			out.println("\n************* Part 1 ***************");
			out.print("Enter a word :: ");
			//uncomment when you are ready to test
			out.print(Words.getFirstAndLast(kb.next()));
		
	}
	
	public static void firstHalf(){
		Scanner kb = new Scanner(System.in);
		
			//Part 2 Testers
			out.println("\n************* Part 2 ***************");
			out.print("Enter a word :: ");
			//uncomment when you are ready to test
			out.print(Words.getFirstHalf(kb.next()));
			
	}
	public static void greeting(){
		Scanner kb = new Scanner(System.in);
			//Part 3 Testers
			out.println("\n************* Part 3 ***************");
			out.print("Enter a name :: ");
			//uncomment when you are ready to test
			out.print(Words.greeting(kb.next()));
			
}
}