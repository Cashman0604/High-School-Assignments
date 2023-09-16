package ifStatement;
import java.util.Scanner;
public class IfStatement {
	public static void main(String[]args){
		bigSmall(10,20);
		bigSmall(20,10);
		bigSmall(20,20);
		bigSmall(10,10);
		leapYear();
		leapYear();
		leapYear();
		leapYear();
		oddEven();
		oddEven();
		oddEven();
	}
	public static void bigSmall(int a, int b){
		if(a>b){
			System.out.printf("yes\n");
		}
		if(a<b){
			System.out.printf("no\n");
		}
		if(a==b){
			System.out.printf("equal\n");
		}
	}
	public static void leapYear(){
		Scanner year = new Scanner(System.in);
		System.out.printf("\nEnter a year: \n");
		int yeer = year.nextInt();
		if(yeer%4==0){
			System.out.println(yeer+" is a leap year.");
		}
		if(yeer%4!=0){
			System.out.println(yeer+" is not a leap year.");
		}
		//year.close();
	}
	public static void oddEven(){
		Scanner nums2 = new Scanner(System.in);
		System.out.printf("\nEnter a whole number: ");
		int num =nums2.nextInt();
		if(num%2==1||num%2==-1){
			System.out.printf("%d is odd: true\n",num);
			System.out.printf("%d is even: false",num);
		}
		if(num%2==0){
			System.out.printf("%d is odd: false\n",num);
			System.out.printf("%d is even: true",num);
		}
		//nums2.close();
	}
}
