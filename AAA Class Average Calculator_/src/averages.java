import static java.lang.System.*;
import java.util.Scanner;
public class averages {
	public String[] classes; //= new String[8];
	public double [][]grades; //= new double[5][8];
	public double[]overallAvg;
	//constructor (used to establish data fields
	public averages() {
		classes = new String[8];
		grades = new double[5][8];
		overallAvg = new double[8];
	}
	public void calculator() {
		Scanner kb = new Scanner(System.in);
		double avgClasses = 0;
		double avg=0;
		for(int i=0; i<8;i++){
			out.print("What class is period "+i);
			classes[i]=kb.nextLine();
			for(int j = 0;j<3;j++){
				out.print("Enter average of grading period "+j);
				grades[i][j] = kb.nextDouble();
			}
			out.print("What was the exam grade?");
			grades[i][3]=kb.nextDouble();
			avgClasses = (grades[i][0]+grades[i][1]+grades[i][2])/3;
			avg = avgClasses*.8+grades[i][3]*.2;
			out.print("P-AP,AP,or REG?");
			String level = kb.next();
			int bonus = 0;
			if(level.equals("AP")){
				bonus = 8;
			}else if(level.equals("P-AP")){
				bonus = 5;
			}else{
				bonus=0;
			}
			overallAvg[i]=avg+bonus;
		}

	}
	
	public String toString(){
		
		return "";
	}
	
	

}
