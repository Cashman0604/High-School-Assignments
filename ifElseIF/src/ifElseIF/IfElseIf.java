package ifElseIF;
import java.util.Scanner;
public class IfElseIf {
public static void main(String[]args){
	ifElseIF();
	ifElseIF();
	ifElseIF();
	ifElseIF();
	ifElseIF();
	ifElseIF();
	ifElseIF();
	ifElseIF();
}
public static void ifElseIF(){
	Scanner grd=new Scanner(System.in);
	String grade = "";
	System.out.printf("Enter a number grade: ");
	int nbGrade=grd.nextInt();
	String notes =". ";
	if(nbGrade>=90){
		grade = "A";
		notes = ". Awesome work!";
	}else if(nbGrade>=80&&nbGrade<90){
		grade = "B";
	}else if(nbGrade>=75&&nbGrade<80){
		grade = "C";
	}else if(nbGrade>=70&&nbGrade<75){
		grade = "D";
	}else{
		grade = "F";
		notes =". Study more next time.";
	}
		System.out.printf("\n%d is a %s%s\n\n",nbGrade,grade,notes);
		
}
}
