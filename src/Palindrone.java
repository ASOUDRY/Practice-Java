
public class Palindrone {
	/**
	  * @param str A String.
	     * @return true if str is a palindrome, false otherwise.
	     */
	    public static boolean pal(String str){
	    	
	    	
	    	String lower = str.toLowerCase();
	    	
	    	char[] c = lower.toCharArray();
	    	int v = c.length - 1;
	    	
	    	for (int i = 0; i < c.length; i++) {
	    		if (c[i] != c[v - i]) {
	    			return false;
	    		}
	    	}
	    	
	        return true ;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.print(pal("Nail"));
		
//		pal("girafarig");

	}

}
