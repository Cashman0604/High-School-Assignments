/** 
 * 
 * @author 
 *
 */
import static java.lang.System.*;

public class ArrayBasicsLab3Runner {
	public static void main(String [] args) {
		int [] arr1 ={1,2,3,4,5,6,7,8,9,10};
		int [] arr2 ={1,2,3,9,11,20,30};
		int [] arr3 ={9,8,7,6,5,4,3,2,0,-2};
		int [] arr4 ={3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
		//Write your test cases for part 1
		out.print("************ Part 1 ************");
		System.out.print("\nArray 1: ");
		ArrayBasicsLab3.arrFormat(arr1);
		System.out.println("\n\tArray 1 is going Up?  "+ArrayBasicsLab3.isGoingUp(arr1));
		System.out.print("\nArray 2: ");
		ArrayBasicsLab3.arrFormat(arr2);
		System.out.println("\n\tArray 2 is going Up?  "+ArrayBasicsLab3.isGoingUp(arr2));
		System.out.print("\nArray 3: ");
		ArrayBasicsLab3.arrFormat(arr3);
		System.out.println("\n\tArray 3 is going Up?  "+ArrayBasicsLab3.isGoingUp(arr3));
		System.out.print("\nArray 4: ");
		ArrayBasicsLab3.arrFormat(arr4);
		System.out.println("\n\tArray 4 is going Up?  "+ArrayBasicsLab3.isGoingUp(arr4));
		
		//Write your test cases for part 2
		out.print("\n************ Part 2 ************");
		System.out.print("\nArray 1: ");
		ArrayBasicsLab3.arrFormat(arr1);
		System.out.println("\n\tArray 1 is going Down?  "+ArrayBasicsLab3.isGoingDown(arr1));
		System.out.print("\nArray 2: ");
		ArrayBasicsLab3.arrFormat(arr2);
		System.out.println("\n\tArray 2 is going Down?  "+ArrayBasicsLab3.isGoingDown(arr2));
		System.out.print("\nArray 3: ");
		ArrayBasicsLab3.arrFormat(arr3);
		System.out.println("\n\tArray 3 is going Down?  "+ArrayBasicsLab3.isGoingDown(arr3));
		System.out.print("\nArray 4: ");
		ArrayBasicsLab3.arrFormat(arr4);
		System.out.println("\n\tArray 4 is going Down?  "+ArrayBasicsLab3.isGoingDown(arr4));
		
		
		//Write your test cases for part 3
		out.println("\n************ Part 3 ************");
		ArrayBasicsLab3.arrFormat(arr4);
		System.out.print("\nFirst 7 values greater that 9 ");
		ArrayBasicsLab3.getCountBiggerThanX(arr4, 7, 9);
		System.out.print("\nFirst 5 values greater that 15 ");
		ArrayBasicsLab3.getCountBiggerThanX(arr4, 5, 15);
		
		
	}
}