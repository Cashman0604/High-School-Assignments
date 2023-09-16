import java.util.Scanner;
import static java.lang.System.*;

public class methodAndParamRunner {
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		
		//Test for Part 1 - Distance
		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();

		//uncomment when you are ready to test part 1
		//System.out.println( "Distance == "+Distance.getDistance( x1, y1, x2, y2 ) );
		
		
		// Tester for Part 2 - Quadratics 
		out.print("Enter a :: ");
		int quadA = keyboard.nextInt();
		out.print("Enter b :: ");
		int quadB = keyboard.nextInt();
		out.print("Enter c :: ");
		int quadC = keyboard.nextInt();
		
		
		//call the methods, pass appropriate parameters & print results
		System.out.println("rootOne == "+ (double)Quadratic.rootOne( quadA,quadB,quadC) );
		System.out.println("rootTwo == "+ (double)Quadratic.rootTwo( quadA,quadB,quadC) );
		
	}
}