import static java.lang.System.out;

/** 
 * 
 * @author 
 *
 */
public class ArrayBasicsLab3 {
	public static void arrFormat(int [] arr){
		out.print("[");
		int x= 0;
		for(int i: arr) {
			 out.print(i);
			 x++;
			 if(x<arr.length){
				 out.print(", ");
			 }
		 }
		 out.print("]");
	}

	/** 
	 * Part 1 - isGoingUp(int [] arr) 
	 * @param arr is the array to traverse 
	 * @return boolean if the list is increasing or not
	 * ex:  [1,2,6,9,23] returns true
	 *   	[9, 11, 13, 8] returns false
	 */
	public static boolean isGoingUp(int [] arr){
		int [] arr1 = arr;
		int x= arr1[0];
		boolean y= true;
		for(int i=0;i<arr1.length;i++){
			if(x<=arr1[i]){
				y=true;
			}else{
				y=false;
			}
			x=arr1[i];
			if(y==false){
				i=arr1.length-1;
			}
		}
		return y;
	}
	
	
	/** 
	 * Part 2 - isGoingDown(int [] arr) 
	 * @param arr is the array to traverse
	 * @return boolean if the list is decreasing or not
	 * ex:  [31,12,6,2,1] returns true
	 *		[31, 20, 10, 15, 9] returns false
	 */
	public static boolean isGoingDown(int [] arr){
		int [] arr1 = arr;
		int x= arr1[0];
		boolean y= true;
		for(int i=0;i<arr.length;i++){
			if(x>=arr1[i]){
				y=true;
			}else{
				y=false;
			}
			x=arr1[i];
			if(y==false){
				i=arr1.length-1;
			}
		}
		return y;
	}

	/** 
	 * Part 3 - getCountBiggerThanX(int [] arr, int count, int x) 
	 * @param arr is the array to traverse
	 * @param count is the number of values that should be returned in 
	 * 			your new array
	 * @param x is the number that the values must be larger than
	 */
	public static void getCountBiggerThanX(int [] arr, int count, int x){
		int [] arr1=arr;
		int [] arr2 =new int[count];
		int y = -1;
		int z=0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]>x){
				y++;
				z++;
				arr2 [y]=arr1[i];
			}
			if(z>=count){
				i=arr1.length-1;
			}
			
		}
		arrFormat(arr2);
	}
}