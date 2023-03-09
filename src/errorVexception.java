
public class errorVexception {
	
	public static void main(String[] args) {
	    double dividend = 10;
	    double divisor = 0;
	    try {
	        double result = divide(dividend, divisor);
	        System.out.println(result);
	    } catch (ArithmeticException e) {
	        System.out.println("Caught arithmetic exception: " + e.getMessage());
	        divisor = 1; // Handle the error by setting the divisor to a non-zero value
	        double result = divide(dividend, divisor); // Retry the operation
	        System.out.println("Result after retry: " + result);
	    }
	}

	public static double divide(double dividend, double divisor) throws ArithmeticException {
	    if (divisor == 0) {
	        throw new ArithmeticException("Division by zero error");
	    }
	    return dividend / divisor;
	}


}