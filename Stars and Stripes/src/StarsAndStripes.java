
public class StarsAndStripes {
	//is is a special method called a constructor.
	   // This method allows you to use this class in other classes
	   public StarsAndStripes()
	   {
	  	System.out.println("StarsAndStripes");
	  	printTwoBlankLines();
	   }
	 
	   // Write at least five other methods
	   // All methods should be a reasonable use of abstraction
	    public void printTwoBlankLines(){
	  			System.out.print("\n\n");
	  	}
	  	public void printBlankLines(int numOfLines){
	  		for(int y=numOfLines;y>0;y--){
	  			System.out.println();
	  		}
	  	}
	  	public void stripesChoose(int numOfStripes){
	  		for(int y=numOfStripes;y>0;y--){
	  			System.out.print("-");
	  		}
	  		System.out.print("\n");
	  	}
	  	public void stripes(){
	  		for(int y=20;y>=0;y--){
	  			System.out.print("-");
	  		}
	  		System.out.print("\n");
	  	}
	  	public void starsChoose(int numOfStars){
	  		for(int y=numOfStars;y>0;y--){
	  			System.out.print("*");
	  		}
	  		System.out.print("\n");
	  	}
	  	public void stars(){
	  		for(int y=20;y>=0;y--){
	  			System.out.print("*");
	  		}
	  		System.out.print("\n");
	  	}
	  	public void starPlusStripeChoose(int numOfStars,int numOfStripes){
	  		for(int y=numOfStars;y>0;y--){
	  			System.out.print("*");
	  		}
	  		System.out.print("\n");
	  		for(int y=numOfStripes;y>0;y--){
	  			System.out.print("-");
	  		}
	  		System.out.print("\n");
	  	}
	  	public void stripePlusStar(){
	  		stripes();
	  		stars();
	  	}
	  	public void smallBox(){
	  		stripePlusStar();
	  		stripePlusStar();
	  		stripePlusStar();
	  		stripes();
	  	}
	  	public void bigBox(){
	  		smallBox();
	  		smallBox();
	  	}
}
