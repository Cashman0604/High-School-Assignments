package moreYay;

public class MoreOperations {

	public static void main(String[] args) {
		//Part 1 - Operations
		int num1=12;
		int num2=5;
		
		int sum= num1 +num2;
		int difference= num1-num2;
		int product=num1 *num2;
		int integerQuotient=num1/num2;
		double decimalQuotient=num1/(double)num2;
		int integerModulusValue=num1%num2;
		double decimalModulusValue=num1%(double)num2;
		
		System.out.println("****.****.****.****.*");
		System.out.printf("%22d + %d = %d",num1,num2,sum);
		System.out.printf("\n%22d - %d = %d",num1,num2,difference);
		System.out.printf("\n%22d * %d = %d",num1,num2,product);
		System.out.printf("\n%22d / %d = %d",num1,num2,integerQuotient);
		System.out.printf("\n%22d / %.1f = %.2f",num1,(double)num2,decimalQuotient);
		System.out.printf("\n%22d %% %d = %d",num1,num2,integerModulusValue);
		System.out.printf("\n%22d %% %.1f = %.2f",num1,(double)num2,(double)decimalModulusValue);
		
		num1=256;
		num2=17;
		System.out.println("\n****.****.****.****.*");
		System.out.printf("%23d + %d = %d",num1,num2,sum);
		System.out.printf("\n%23d - %d = %d",num1,num2,difference);
		System.out.printf("\n%23d * %d = %d",num1,num2,product);
		System.out.printf("\n%23d / %d = %d",num1,num2,integerQuotient);
		System.out.printf("\n%23d / %.1f = %.2f",num1,(double)num2,decimalQuotient);
		System.out.printf("\n%23d %% %d = %d",num1,num2,integerModulusValue);
		System.out.printf("\n%23d %% %.1f = %.2f\n",num1,(double)num2,(double)decimalModulusValue);
		
		//Part2 - Circles!!
		double num3=1.7;
		double pi=Math.PI;
		double ans1=Math.pow(num3,2) * pi;
		
		System.out.println("\n****.****.****.****.****.");
		System.out.printf("%21.4f * %.4f * %.4f = %.4f",num3,num3,pi,ans1);
		num3=10.25;
		ans1=Math.pow(num3,2) * pi;
		System.out.printf("\n%22.4f * %.4f * %.4f = %.4f",num3,num3,pi,ans1);
		
		//Part 3 - Squares!!
		int area =144;
		double side=Math.sqrt(area);
		
		System.out.println("\n****.*");
		System.out.printf("     The side length of a square with an area of %d is %.2f",area,side);
		
		area=200;
		side=Math.sqrt(area);
		
		System.out.printf("\n     The side length of a square with an area of %d is %.2f",area,side);
		
		//Part 4 - Birthday Magic :)
		int bMonth=06;
		bMonth +=18;
		bMonth *=25;
		bMonth -=333;
		bMonth *=8;
		bMonth -=554;
		bMonth /=2;
		bMonth += 16;
		bMonth *=5;
		bMonth +=692;
		bMonth *=20;
		bMonth += 04;
		bMonth -=32940;
		System.out.println("\n\n"+bMonth);
		System.out.printf("%02d/%2d/%02d",(bMonth / 10000),(bMonth / 100)% 20, (bMonth% 10));
		
		//Part 5 - NAAC
		String name ="Cash";
		String age ="15";
		char c1 = name.charAt(0);
		char c2 = name.charAt(1);
		char c3 = name.charAt(2);
		char c4 = name.charAt(3);
		System.out.printf("\n\n%s = %s + %s + %s + %s\n",name,c1,c2,c3,c4);
		System.out.printf("Age = %s\n",age);
		System.out.printf("%s+%s = %d + %d + %d + %d + %d",name,age,(int)c1,(int)c2,(int)c3,(int)c4,Integer.parseInt(age));
		System.out.printf("\nTotal = %d",(int)c1+(int)c2+(int)c3+(int)c4+Integer.parseInt(age));
		System.out.printf("\nAverage = %.1f",((double)c1+(double)c2+(double)c3+(double)c4+Integer.parseInt(age))/5);
		System.out.printf("\n\"%s\"s NAAC is \"%s\", the ASCII value %s",name,(char)((c1+c2+c3+c4+Integer.parseInt(age))/5),((int)c1+(int)c2+(int)c3+(int)c4+Integer.parseInt(age))/5);
	}

}
