public class ArrayBasicsLab2 {

	/** 
	 * Part 1 - getSectionSum(int[] arr, int start, int end)
	 * WAM (write a method) that sums up a section of a provided array
	 */
	public static int getSectionSum(int[] arr, int start, int end){
		return arr[start]-arr[end];
	}
	
	
	/** 
	 * Part 2 - getCount(int[] arr, int num)
	 * WAM that will count how many times a certain number occurs in 
	 * a given array.
	 */
	public static int getCount(int[] arr, int num){
		int i =0;
		for(int x : arr){
			if(x==num){
				i++;
			}
		}
		return i;
	}
	
	
	/** 
	 * Part 3 - removeVal(int[] arr, int num)
	 * WAM that will remove all of a certain value from an array & 
	 * return a new array.
	 */
	public static int[] removeVal(int[] arr, int num){
		int i = 0;
		int [] newArr=new int[arr.length-getCount(arr, num)];
		for(int x : arr){
			if(x!=num){
				newArr[i] = x;
				i++;
			}
		}
		return newArr;
	}
	
}