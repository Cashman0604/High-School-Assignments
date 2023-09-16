package test;
import java.util.Scanner;
public class Test {
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		/*System.out.println("Enter an integer: ");
		int data = kb.nextInt();
		System.out.println("You entered: " + data);
		
		System.out.println("Enter a double: ");
		double data2 = kb.nextDouble();
		System.out.println("You entered: " + data2);*/
		
		System.out.println("Enter your name: ");
		String name = kb.nextLine();
		System.out.println("Hello "+name+"!");
		System.out.println("Your name starts with: " + name.charAt(0));
		kb.close();
	}
}