package scannerLabTwo;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class scannerLab2 {

	public static void main(String[] args) throws IOException {
		//Part 1 - Integers
		
		Scanner file1=new Scanner(new File("E:\\School Eclipse\\Scanner Lab 2\\numbers.txt"));
		
		int num1 = file1.nextInt();
		int num2 = file1.nextInt();
		int num3 = file1.nextInt();
		
		System.out.println("****.****.****.**");
		System.out.printf("%d\t%d\t%d\n",num1,num2,num3);
		System.out.printf("Sum = %d\n",num1+num2+num3);
		
		file1.close();
		
		//Part 2 - Doubles
		
		Scanner file2=new Scanner(new File("E:\\School Eclipse\\Scanner Lab 2\\circle.txt"));
		
		double rad1 =file2.nextDouble();
		double rad2 =file2.nextDouble();
		double area1 = Math.PI*Math.pow(rad1,2);
		double area2 = Math.PI*Math.pow(rad2,2);
		double circ1 = Math.PI*(rad1*2);
		double circ2 = Math.PI*(rad2*2);
		
		System.out.printf("****.****.****.****.****\n");
		System.out.printf("                Radius = %.1f\n",rad1);
		System.out.printf("                  Area = %.1f\n",area1);
		System.out.printf("         Circumference = %.1f\n",circ1);
		System.out.printf("****.****.****.****.****\n");
		System.out.printf("                Radius = %.1f\n",rad2);
		System.out.printf("                  Area = %.1f\n",area2);
		
		System.out.printf("         Circumference = %.1f\n",circ2);
		file2.close();
		
		//Part 3 - Strings
		
		Scanner file3=new Scanner(new File("E:\\School Eclipse\\Scanner Lab 2\\name.txt"));
		
		String first =file3.next();
		String middle =file3.next();
		String last =file3.next();
		
		System.out.printf("\n%s %s. %s\n",first,middle.charAt(0),last);
		System.out.printf("%s, %s %s.\n",last,first,middle.charAt(0));
		
		System.out.printf("%s%s%s\n",first.charAt(0),middle.charAt(0),last.charAt(0));
		file3.close();
		
		//Part 4 - Receipt
		Scanner file4=new Scanner(new File("E:\\School Eclipse\\Scanner Lab 2\\receipt.txt"));
		
		String item1 = file4.nextLine();
		Double cost1 = file4.nextDouble();
		file4.nextLine();
		String item2 = file4.nextLine();
		Double cost2 = file4.nextDouble();
		file4.nextLine();
		String item3 = file4.nextLine();
		Double cost3 = file4.nextDouble();
		
		System.out.printf("\n%s %s. %s - Mon Oct 28 13:04:44 CDT 2019\n",first,middle.charAt(0),last);
		System.out.printf("\"Receipt\" lab\n");
		System.out.printf("		Ace Hardware\n");
		System.out.printf("Item			Amount\n");
		System.out.printf("%s		$ %.2f\n",item1,cost1);
		System.out.printf("%s			$  %.2f\n",item2,cost2);
		System.out.printf("%s		$  %.2f\n\n",item3,cost3);
		System.out.printf("Subtotal		$%.2f\n",cost1+cost2+cost3);
		System.out.printf("Tax			$  %.2f\n",(cost1+cost2+cost3)*.0625);
		System.out.printf("\nTotal			$%.2f",(cost1+cost2+cost3)+((cost1+cost2+cost3)*.0625));
		file4.close();
	}

}
