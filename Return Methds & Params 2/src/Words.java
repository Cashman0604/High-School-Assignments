public class Words {

	/** 
	 * Part 1 - getFirstAndLast( String word ) 
	 * WAM that will accept a word as a parameter 
	 * & return the first and last letter of the 
	 * word separated by a space.
	 */
	public static String getFirstAndLast(String word){
		String word1=word;
		int wordLength=word1.length();
		return word1.charAt(0)+" "+word1.charAt(wordLength-1);
	}
	
	
	
	/**
	 * Part 2 - getFirstHalf( String word )
	 * WAM that will accept a word as a parameter 
	 * and return the first half of the word.
	 */
	public static String getFirstHalf(String word){
	 String word1=word;
	 int wordLength= word1.length()+1;
	 int halfLength= wordLength/2;
	 
		return word1.substring(0,halfLength);
	}
	
	/**
	 * Part 3 - greeting( String name ) 
	 * WAM that will accept a name as a parameter 
	 * and return a greeting that incorporates the name.
	 */
	public static String greeting(String name){
		 String name1= name;
		 
			return "Hello World! My name is "+name1+".";
		}
	
	
	
}