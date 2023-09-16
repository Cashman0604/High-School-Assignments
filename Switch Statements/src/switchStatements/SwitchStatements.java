package switchStatements;

import java.io.*;
import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("F:\\Eclipse\\School Eclipse\\Switch Statements\\Conversion"));
		while (file.hasNext()) {
			char code = file.next().charAt(0);
			double num = file.nextDouble();

			String oldLabel = "";
			String newLabel = "";
			double outputNum = 0;

			switch (code) {
			case 'M':
				oldLabel = "Miles";
				outputNum = num * 1.61;
				newLabel = "Kilometers";
				break;
			case 'F':
				oldLabel = "Feet";
				outputNum = num * .30488;
				newLabel = "Meters";
				break;
			case 'P':
				oldLabel = "Pounds";
				outputNum = num * 4.9;
				newLabel = "Newtons";
				break;

			}
			System.out.printf("%.2f %s = %.2f %s\n", num, oldLabel, outputNum, newLabel);
		}
		file.close();
	}

}
