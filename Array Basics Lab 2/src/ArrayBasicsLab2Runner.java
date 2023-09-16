import static java.lang.System.*;

public class ArrayBasicsLab2Runner {
	public static void main(String [] args) {
		
		/** 
		 * Create two arrays. arr1 & arr2
		 */
		int [] arr1= {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
		int [] arr2= {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
		/** 
		 * Part 1 Test Cases
		 * Remember to format your print statements & add more to match 
		 * the sample output 
		 */
		out.printf("arr1:");
	out.printf("\nsum of spots 3-6 = %d",ArrayBasicsLab2.getSectionSum(arr1, 3, 6));
		out.printf("\nsum of spots 2-9 = %d",ArrayBasicsLab2.getSectionSum(arr1, 2, 9));
		out.printf("\n\narr2:");
		out.printf("\nsum of spots 3-6 = %d",ArrayBasicsLab2.getSectionSum(arr2, 3, 16));
		out.printf("\nsum of spots 2-9 = %d",ArrayBasicsLab2.getSectionSum(arr2, 2, 9));
		/** 
		 * Part 2 Test Cases
		 */
		out.printf("\n\narr1:");
		out.print("\n# of 4s = "+ArrayBasicsLab2.getCount(arr1, 4));
		out.print("\n# of 9s = "+ArrayBasicsLab2.getCount(arr1, 9));
		out.print("\n# of 7s = "+ArrayBasicsLab2.getCount(arr1, 7));
		out.printf("\n\narr2:");
		out.print("\n# of 0s = "+ArrayBasicsLab2.getCount(arr2, 0));
		out.print("\n# of 3s = "+ArrayBasicsLab2.getCount(arr2, 3));
		out.print("\n# of 7s = "+ArrayBasicsLab2.getCount(arr2, 7));	
		/** 
		 * Part 3 Test Cases
		 */
	
		 int [] newArr = ArrayBasicsLab2.removeVal(arr1, 7);
		 out.print("\n\narr1: \nNew array with all 7s removed = [");
		 int x = 0;
		 for(int i: newArr) {
			 out.print(i);
			 x++;
			 if(x<newArr.length){
				 out.print(", ");
			 }
		 }
		 out.print("]");
		
		//Verify that all 7's have been removed
		out.print("\n# of 7s = "+ArrayBasicsLab2.getCount(newArr, 7));
		
		 newArr = ArrayBasicsLab2.removeVal(arr2, 7);
		 out.print("\n\narr1: \nNew array with all 7s removed = [");
		  x = 0;
		 for(int i: newArr) {
			 out.print(i);
			 x++;
			 if(x<newArr.length){
				 out.print(", ");
			 }
		 }
		 out.print("]");
		
		//Verify that all 7's have been removed
		out.print("\n# of 7s = "+ArrayBasicsLab2.getCount(newArr, 7));
	
	}
}