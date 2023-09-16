package guessingGame;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int numAmt=0;
		char cont;
		
		do{
			System.out.printf("Guessing Game - how many numbers? ");
			numAmt=kb.nextInt();
			playGame(numAmt);
			
			System.out.printf("Do you want to play again? (y/n)");
			cont = kb.next().charAt(0);
		}while(cont=='y'||cont=='Y');
		System.out.printf("Goodbye ;(");
	}
	
	public static void playGame(int numAmt){
		Scanner kb = new Scanner(System.in);
		int guesses=0;
		int correctAns=0;
		int userAns=0;
		correctAns=(int)(Math.random()*(numAmt-1))+1;
		do{
		
			System.out.printf("Enter a number between 1 and %d ",numAmt);
			userAns=kb.nextInt();
			
			if(userAns>numAmt||userAns<1){
				System.out.printf("Number out of range!\n");
			}else{
			guesses++;}
		
		}while(userAns!=correctAns);
		int guessPrct=(int)(((guesses-1)/(double)numAmt)*100);
		System.out.printf("It took %d guesses to guess %d.\n",guesses,correctAns);
		System.out.printf("You guessed wrong %d percent of the time.\n\n",guessPrct);
	}

}
