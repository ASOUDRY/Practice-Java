
public class finaltest {

	public static void main(String[] args) {
		throwUncheckedException();
		// TODO Auto-generated method stub
		    /**
		     * An exception is an unexpected event that occurs during our program.
		     * Most likely, you have already encountered an Exception (ArrayIndexOutOfBounds, etc).
		     * In order for our program to compile, Java needs to be prepared for how to handle an exception -
		     * for instance, you could use a try/catch block to prepare some code in a 'catch' for the event that an exception
		     * fires, or you can use a throws declaration to pass on an exception to whatever called the method.
		     * (if an exception is thrown from main, Java will crash.) Correctly managing and throwing exceptions actually
		     * makes our application more robust as we can't expect operations on files, databases, or the internet to always
		     * succeed. For instance, if the development of a new method would require a FileNotFoundException to be thrown in
		     * a certain situation, the line throw new FileNotFoundException();
		     *
		     * Write a method that throws an Exception (you will also need to add a 'throws Exception' declaration to allow the
		     * method to compile. This notifies Java that this method is *capable* of throwing an exception.) Notice also that
		     * this method has a void return type - it doesn't need to return anything since the test cases are just checking
		     * for a thrown exception!
		     *
		     * This also means that you should NOT write a try/catch block in this method, as the tests are expecting to have
		     * a method thrown to it. A try/catch block would handle the exception within the method.
		     *
		     * Check out this guide on throwing exceptions: https://rollbar.com/guides/java/how-to-throw-exceptions-in-java/#
		     */
		 
	}
	   public void mustThrow() throws Exception {
	    
	    }
	   
	   /**
	     * This method must throw an unchecked exception.
	     * unchecked means that you do not need to wrap the method in a try/catch or a throws declaration.
	     * Unchecked exceptions may include situations like arithmetic errors like dividing by zero,
	     * accessing an index of an array which is out of bounds, stack overflow (result of infinite recursion), etc.
	     *
	     * For this challenge, I recommend creatively causing such an exception rather than using the 'throws' keyword,
	     * which would also work since RuntimeExceptions are still technically Exceptions.
	     *
	     * You could view the entire Exception family here: https://programming.guide/java/list-of-java-exceptions.html
	     * Notice that errors are separate from exceptions. Errors are external to Java and can occur when some external
	     * event happens, like running out of computer memory.
	     */
	    public static void throwUncheckedException(){
	    	int[] numbers = {1, 2, 3, 4, 5};
	    	int index = 6;
	    	if (index < 0 || index >= numbers.length) {
	    	    throw new ArrayIndexOutOfBoundsException("Your Index is out of bounds: " + index);
	    	}
	    	System.out.println(numbers[index]);


	    }
	


}
