import java.util.Scanner;
public class MultiplicationStuff {
	public static void main(String[]args){
		mult();
		mult();
		mult();
		mult();
	}
	public static void mult(){
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the multiplication table number and then how many numbers to print.");
		int multNum=kb.nextInt();
		int numAmt=kb.nextInt();
		System.out.println("Multiplication table for "+multNum);
		for(int x=1;x<=numAmt;x++){
		System.out.printf("%d\t%d\n",x,x*multNum);
		}
	}
}
