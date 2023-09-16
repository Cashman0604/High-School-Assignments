import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class arrayBasicsOne {
	public static void main(String[]args) throws FileNotFoundException{
		@SuppressWarnings("resource")
		Scanner file = new Scanner(new File("F:\\Files\\Eclipse\\School Eclipse\\Array Basics Lab\\food"));
		String s = file.nextLine();
		args = s.split(" ");
		//First
		System.out.println("First word:"+args[0]);
		//Last
		System.out.println("\nLast word:"+args[args.length-1]);
		//Original order
		for(int i = 0; i<args.length;i++){
				System.out.println(args[i]);
				
			}
		//First Alphabet
		Arrays.sort(args);
		System.out.println("First Alphabetical Word: "+ args[0]);
		System.out.println("\nLast Alphabetical Word: "+ args[args.length-1]);
		System.out.println("\nWords in Reverse alphabetical order ");
		for(int x=args.length-1;x>=0;x--){
			System.out.println(args[x]);
			
		}
	}
}
