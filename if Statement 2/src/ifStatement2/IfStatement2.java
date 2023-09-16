package ifStatement2;

public class IfStatement2 {

	public static void main(String[] args) {
		//Part 1 Test Cases
				numberCompare(5, 6);
				numberCompare(45, 66);
				numberCompare(-25, 10324);
				numberCompare(324, 12312);
				numberCompare(34, 33);
				//Part 2 Test Cases
				stringLength("hello", "goodbye");
				stringLength("one", "two");
				stringLength("three", "four");
				stringLength("TCEA", "UIL");
				stringLength("State", "Champions");
				stringLength("ABC", "DEF");
				stringLength("four", "five");
				stringLength("whoot", "what");
				//add more test cases shown in the lab instructions 
				
				//Part 3 Test Cases
				System.out.println("");
				stringEquality("hello", "goodbye");
				stringEquality("one", "two");
				stringEquality("three", "four");
				stringEquality("TCEA", "UIL");
				stringEquality("State", "Champions");
				stringEquality("ABC", "ABC");
				stringEquality("ABC", "CBA");
				stringEquality("Same", "Same");
				//add more test cases shown in the lab instructions 
			}
			
			/* * * * * Part 1 * * * Part 1 * * * * Part 1 * * * * * * 
			 * 
			 * Write a program (WAP) to compare two numbers to 
			 * determine which number is smallest and which number 
			 * is largest.
			 *
			 * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
			public static void numberCompare(int a, int b) {
				int num1 = a;
				int num2 = b;
				int large = num1;
				int small = num2;
				// use an if else statement to compare num1 & num2
				if(num1>num2){
					large = num1;
					small = num2;
				}else{
					large = num2;
					small = num1;
				}
				System.out.printf("%d -- %d\n",num1,num2);
				System.out.printf("largest == %d\n",large);
				System.out.printf("smallest == %d\n\n",small);
			}
			
			/* * * * * Part 2 * * * Part 2 * * * * Part 2 * * * * * *
			 * WAP to compare two Strings to see if each of the two 
			 * Strings contains the same number of letters.
			 *
			 *	Useful method: .length()
			 *
			 * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
			public static void stringLength(String string1, String string2) {
				String str1 = string1;
				String str2 = string2;
				int length = str1.length();
				int length2 = str2.length();
				if(length==length2){
					System.out.printf("%s has the same # of letters as %s\n",str1,str2);	
				}else{
					System.out.printf("%s does not have the same # of letters as %s\n",str1,str2);
				}
				
			}
			
			
			/* * * * * Part 3 * * * Part 3 * * * * Part 3 * * * * * *
			 * 
			 * WAP to compare two Strings to see if each of the two 
			 * Strings contains the same letters in the same order 
			 * (ie: the same word).
			 * 
			 * Useful Method: .equal()
			 * 
			 * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
			public static void stringEquality (String string1, String string2) {
				String str1 = string1;
				String str2 = string2;
			
				if(str1.equals(str2)){
					System.out.printf("%s has the same letters as %s\n",str1,str2);
				}else{
					System.out.printf("%s does not have the same letters as %s\n",str1,str2);
				}
			}

	}
