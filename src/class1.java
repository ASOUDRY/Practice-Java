import java.util.HashMap;
import java.util.Map;

public class class1 {
	/*
	   * @param nums a list of ints.
	     * @return the largest possible sum of separate numbers from nums.
	     */

//public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public static String recurringChar(String str) {
  //  	public static char mostCommonCharacter(String str) {
    	    HashMap<Character, Integer> charCounts = new HashMap<>();

    	    // loop through each character in the string and update the HashMap
    	    for (char c : str.toCharArray()) {
    	        if (charCounts.containsKey(c)) {
    	            charCounts.put(c, charCounts.get(c) + 1);
    	        } else {
    	            charCounts.put(c, 1);
    	        }
    	    }

    	    // find the key with the highest value in the HashMap
    	    char mostCommonChar = ' ';
    	    int highestCount = 0;
    	    for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
    	        if (entry.getValue() > highestCount) {
    	            mostCommonChar = entry.getKey();
    	            highestCount = entry.getValue();
    	        }
    	    }

    	 //   return mostCommonChar;
    	    return "The most common character is: " + mostCommonChar + " and the count for this character is: " + highestCount;
    	    
    	}
 
	public static void main(String[] args) {	
		String string = "avarra Kedavra";
		System.out.println(recurringChar(string));
	}
}