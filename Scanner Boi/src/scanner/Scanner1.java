package scanner;
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		//Part 1
		
		System.out.println("Enter a number");
		int num1 = kb.nextInt();
		System.out.println("Enter another number");
		int num2 = kb.nextInt();
		System.out.println("Enter another number again");
		int num3 = kb.nextInt();
		System.out.println("You entered:");
		System.out.println("****.****.****.**");
		System.out.printf("%d\t%d\t%d\n",num1,num2,num3);
		System.out.printf("Sum = %d",num1+num2+num3);
		
		//Part 2
		System.out.println("\n----------------------------------------------------------------");
		System.out.println("\nEnter a Radius");
		double rad1=kb.nextDouble();
		System.out.println("Enter another Radius");
		double rad2=kb.nextDouble();
		
		double area1=Math.PI*Math.pow(rad1,2);
		double area2=Math.PI*Math.pow(rad2,2);
		
		double circ1=Math.PI*(rad1*2);
		double circ2=Math.PI*(rad2*2);
		
		System.out.println("****.****.****.****.****");
		System.out.println("                Radius = "+rad1);
		System.out.println("                  Area = "+area1);
		System.out.println("         Circumference = "+circ1);
		System.out.println("****.****.****.****.****");
		System.out.println("                Radius = "+rad2);
		System.out.println("                  Area = "+area2);
		System.out.println("         Circumference = "+circ2);
		
		//Part 3
		System.out.println("\n----------------------------------------------------------------");
		System.out.println("Enter Your First Name");
		String firstName=kb.next();
		System.out.println("\nEnter Your Middle Initial");
		String midInitial=kb.next();
		System.out.println("\nEnter Your Last Name");
		String lastName=kb.next();
		System.out.printf("%s %s. %s\n",firstName,midInitial.charAt(0),lastName);
		System.out.printf("%s, %s %s.\n",lastName,firstName,midInitial.charAt(0));
		System.out.printf("%s%s%s",firstName.charAt(0),midInitial.charAt(0),lastName.charAt(0));
		kb.close();
	}

}
