import java.util.Scanner;
@SuppressWarnings("resource")
public class average {
	public static void loginOrNew(){
	Scanner kb = new Scanner(System.in);	
		System.out.print("Login or Create a New Account?	(Login/New)");
		String start =kb.next();
		if(start=="Login"){
			
		}else if(start=="New"){
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void welcome() {
		System.out.println("\n\n\n\n");
	}
	public static void overallAvges() {
		System.out.println("Please list your classes from 1st-8th period.");
		String class1 = class1();
		String class2 = class2();
		String class3 = class3();
		String class4 = class4();
		String class5 = class5();
		String class6 = class6();
		String class7 = class7();
		String class8 = class8();
		System.out.println("Now for the class averages going from 1st to 8th not including your Lunch");
		double avg1st= avg1st();
		double avg2nd= avg2nd();
		double avg3rd= avg3rd();
		double x= 0;
		double y= 0;
		if(class4.equals("Lunch")||class4.equals("lunch")) {
			x=Math.pow(74,220);
			y=avg5th();
		}else {
			y=Math.pow(74,220);
			x=avg4th();
		}
		double avg4th= x;
		double avg5th= y;
		if((double)x==Math.pow(74,220)){
			avg4th = avg4th/Math.pow(74,218);
		}else if((double)y==Math.pow(74,220)){
			avg5th = avg5th/Math.pow(74,218);
		}
		double avg6th= avg6th();
		double avg7th= avg7th();
		double avg8th= avg8th();
		System.out.println("Here's the report:");
		System.out.printf("%s: %.2f\n",class1,avg1st);
		System.out.printf("%s: %.2f\n",class2,avg2nd);
		System.out.printf("%s: %.2f\n",class3,avg3rd);
		System.out.printf("%s: %.2f\n",class4,avg4th);
		System.out.printf("%s: %.2f\n",class5,avg5th);
		System.out.printf("%s: %.2f\n",class6,avg6th);
		System.out.printf("%s: %.2f\n",class7,avg7th);
		System.out.printf("%s: %.2f\n",class8,avg8th);
		double overallAverage=0;
		if((double)x==Math.pow(74,220)){
			overallAverage= (avg1st+avg2nd+avg3rd+avg5th+avg6th+avg7th+avg8th)/7;
		}else if ((double)y==Math.pow(74,220)){
			overallAverage= (avg1st+avg2nd+avg3rd+avg4th+avg6th+avg7th+avg8th)/7;
		}
		System.out.printf("Overall Average: %.2f*\n",overallAverage);
		System.out.println("Note: Lunch is not factored into average");
	}
	public static String class1() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your 1st Period?");
		String per1 = kb.nextLine();
		return per1;
	}
	public static String class2() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your 2nd Period?");
		String per2 = kb.nextLine();
		return per2;
	}
	public static String class3() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your 3rd Period?");
		String per3 = kb.nextLine();
		return per3;
	}
	public static String class4() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your 4th Period?");
		String per4 = kb.nextLine();
		return per4;
	}
	public static String class5() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your 5th Period?");
		String per5 = kb.nextLine();
		return per5;
	}
	public static String class6() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your 6th Period?");
		String per6 = kb.nextLine();
		return per6;
	}
	public static String class7() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your 7th Period?");
		String per7 = kb.nextLine();
		return per7;
	}
	public static String class8() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your 8th Period?");
		String per8 = kb.nextLine();
		return per8;
	}
	public static double avg1st(){
		Scanner grades = new Scanner(System.in);
		System.out.println("1st Period\n");
		System.out.println("	Enter your 1st 6 weeks average");
		double first=grades.nextDouble();
		
		System.out.println("	Enter your 2nd 6 weeks average");
		double second=grades.nextDouble();
		
		System.out.println("	Enter your 3rd 6 weeks average");
		double third=grades.nextDouble();
		
		System.out.println("	Enter your final or midterm score");
		double finalTest=grades.nextDouble();
		
		System.out.println("	Enter your class type(ap,pap,none)");
		String classType=grades.next();
	
		double semesterAverage = (first+second+third)/3;
		double average = (semesterAverage*.8)+(finalTest*.2);
		
		if(classType.equals("ap")){
			average+=8;
		}else if(classType.equals("pap")){
			average+=5;
		}else{
			average+=0;
		}
	
		System.out.printf("	Your average for 1st period is: ");
		System.out.printf("%.2f \n",average);
		
		return average;
	}
	public static double avg2nd(){
		Scanner grades = new Scanner(System.in);
		System.out.println("2nd Period\n");
		System.out.println("	Enter your 1st 6 weeks average");
		double first=grades.nextDouble();
		
		System.out.println("	Enter your 2nd 6 weeks average");
		double second=grades.nextDouble();
		
		System.out.println("	Enter your 3rd 6 weeks average");
		double third=grades.nextDouble();
		
		System.out.println("	Enter your final or midterm score");
		double finalTest=grades.nextDouble();
		
		System.out.println("	Enter your class type(ap,pap,none)");
		String classType=grades.next();
	
		double semesterAverage = (first+second+third)/3;
		double average = (semesterAverage*.8)+(finalTest*.2);
		
		if(classType.equals("ap")){
			average+=8;
		}else if(classType.equals("pap")){
			average+=5;
		}else{
			average+=0;
		}
	
		System.out.printf("	Your average for 2nd period is: ");
		System.out.printf("%.2f \n",average);
		
		return average;
	}
	public static double avg3rd(){
		Scanner grades = new Scanner(System.in);
		System.out.println("3rd Period\n");
		System.out.println("	Enter your 1st 6 weeks average");
		double first=grades.nextDouble();
		
		System.out.println("	Enter your 2nd 6 weeks average");
		double second=grades.nextDouble();
		
		System.out.println("	Enter your 3rd 6 weeks average");
		double third=grades.nextDouble();
		
		System.out.println("	Enter your final or midterm score");
		double finalTest=grades.nextDouble();
		
		System.out.println("	Enter your class type(ap,pap,none)");
		String classType=grades.next();
	
		double semesterAverage = (first+second+third)/3;
		double average = (semesterAverage*.8)+(finalTest*.2);
		
		if(classType.equals("ap")){
			average+=8;
		}else if(classType.equals("pap")){
			average+=5;
		}else{
			average+=0;
		}
	
		System.out.printf("	Your average for 3rd period is: ");
		System.out.printf("%.2f \n",average);
		
		return average;
	}
	public static double avg4th(){
		Scanner grades = new Scanner(System.in);
		System.out.println("4th Period\n");
		System.out.println("	Enter your 1st 6 weeks average");
		double first=grades.nextDouble();
		
		System.out.println("	Enter your 2nd 6 weeks average");
		double second=grades.nextDouble();
		
		System.out.println("	Enter your 3rd 6 weeks average");
		double third=grades.nextDouble();
		
		System.out.println("	Enter your final or midterm score");
		double finalTest=grades.nextDouble();
		
		System.out.println("	Enter your class type(ap,pap,none)");
		String classType=grades.next();
	
		double semesterAverage = (first+second+third)/3;
		double average = (semesterAverage*.8)+(finalTest*.2);
		
		if(classType.equals("ap")){
			average+=8;
		}else if(classType.equals("pap")){
			average+=5;
		}else{
			average+=0;
		}
	
		System.out.printf("	Your average for 4th period is: ");
		System.out.printf("%.2f \n",average);
		
		return average;
	}
	public static double avg5th(){
		Scanner grades = new Scanner(System.in);
		System.out.println("5th Period\n");
		System.out.println("	Enter your 1st 6 weeks average");
		double first=grades.nextDouble();
		
		System.out.println("	Enter your 2nd 6 weeks average");
		double second=grades.nextDouble();
		
		System.out.println("	Enter your 3rd 6 weeks average");
		double third=grades.nextDouble();
		
		System.out.println("	Enter your final or midterm score");
		double finalTest=grades.nextDouble();
		
		System.out.println("	Enter your class type(ap,pap,none)");
		String classType=grades.next();
	
		double semesterAverage = (first+second+third)/3;
		double average = (semesterAverage*.8)+(finalTest*.2);
		
		if(classType.equals("ap")){
			average+=8;
		}else if(classType.equals("pap")){
			average+=5;
		}else{
			average+=0;
		}
	
		System.out.printf("	Your average for 5th period is: ");
		System.out.printf("%.2f \n",average);
		
		return average;
	}
	public static double avg6th(){
		Scanner grades = new Scanner(System.in);
		System.out.println("6th Period\n");
		System.out.println("	Enter your 1st 6 weeks average");
		double first=grades.nextDouble();
		
		System.out.println("	Enter your 2nd 6 weeks average");
		double second=grades.nextDouble();
		
		System.out.println("	Enter your 3rd 6 weeks average");
		double third=grades.nextDouble();
		
		System.out.println("	Enter your final or midterm score");
		double finalTest=grades.nextDouble();
		
		System.out.println("	Enter your class type(ap,pap,none)");
		String classType=grades.next();
	
		double semesterAverage = (first+second+third)/3;
		double average = (semesterAverage*.8)+(finalTest*.2);
		
		if(classType.equals("ap")){
			average+=8;
		}else if(classType.equals("pap")){
			average+=5;
		}else{
			average+=0;
		}
	
		System.out.printf("	Your average for 6th period is: ");
		System.out.printf("%.2f \n",average);
		
		return average;
	}
	public static double avg7th(){
		Scanner grades = new Scanner(System.in);
		System.out.println("7th Period\n");
		System.out.println("	Enter your 1st 6 weeks average");
		double first=grades.nextDouble();
		
		System.out.println("	Enter your 2nd 6 weeks average");
		double second=grades.nextDouble();
		
		System.out.println("	Enter your 3rd 6 weeks average");
		double third=grades.nextDouble();
		
		System.out.println("	Enter your final or midterm score");
		double finalTest=grades.nextDouble();
		
		System.out.println("	Enter your class type(ap,pap,none)");
		String classType=grades.next();
	
		double semesterAverage = (first+second+third)/3;
		double average = (semesterAverage*.8)+(finalTest*.2);
		
		if(classType.equals("ap")){
			average+=8;
		}else if(classType.equals("pap")){
			average+=5;
		}else{
			average+=0;
		}
	
		System.out.printf("	Your average for 7th period is: ");
		System.out.printf("%.2f \n",average);
		
		return average;
	}
	public static double avg8th(){
		Scanner grades = new Scanner(System.in);
		System.out.println("8th Period\n");
		System.out.println("	Enter your 1st 6 weeks average");
		double first=grades.nextDouble();
		
		System.out.println("	Enter your 2nd 6 weeks average");
		double second=grades.nextDouble();
		
		System.out.println("	Enter your 3rd 6 weeks average");
		double third=grades.nextDouble();
		
		System.out.println("	Enter your final or midterm score");
		double finalTest=grades.nextDouble();
		
		System.out.println("	Enter your class type(ap,pap,none)");
		String classType=grades.next();
	
		double semesterAverage = (first+second+third)/3;
		double average = (semesterAverage*.8)+(finalTest*.2);
		
		if(classType.equals("ap")){
			average+=8;
		}else if(classType.equals("pap")){
			average+=5;
		}else{
			average+=0;
		}
	
		System.out.printf("	Your average for 8th period is: ");
		System.out.printf("%.2f \n",average);
		
		return average;
	}
	public static double schoolAvg(){
		
		
		return 0;
	}
}

