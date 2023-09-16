
public class arrayBasicsLab4 {

	public static void main(String[] args) {
		int [] arr1 ={1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
		int [] arr2 ={2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		int [] arr3 ={2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		format(arr1);
		System.out.println("");
		format(arr2);
		System.out.println("");
		format(arr3);
		System.out.println("");
	}
	public static int [] histogram(int[] arr){

		int [] arrEnd= new int[10];
		int [] arr1=arr;
		int num=0;
		int x = 0;
		int cnt=0;
		for(int o=0;o<10;o++){
			cnt=0;
		for(int i:arr1){
			x=i;
			if(x==num){
				cnt++;
			}
		}
		arrEnd[o]=cnt;
		num++;
	}
		return arrEnd;

}
	public static void format (int [] arr){
		int x = 0;
		for(int i: histogram(arr)){
			System.out.print(x+" - ");
				for(int y =i;y>0;y--){
				System.out.print("*");
				}
			x++;
			System.out.print("\n");
		}
		
	}
}