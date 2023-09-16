public class WelcomeBacc {
	public static void main(String []args){
		partOne();
		System.out.print("\n\n");
		partTwo();
		
	}
	public static void partOne(){
		int num=10;
		while(num>0){
			System.out.printf("%d ",num);
			num=num-2;
		}
	}
	public static void partTwo(){
		int num=0;
		do{
			num=(int)(Math.random()*10)+1;
			System.out.printf("%d\n",num);
		}while(num!=10);
	}
}
