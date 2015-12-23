
public class OperationsStack {

	public double SumStack(double a, double b) {
		
    	return a + b;
    }
	
	public double MinStack(double a, double b) {
		
    	return b - a;
    }
	
	public double MulStack(double a, double b) {
		
    	return a * b;
    }
	
	public double DivStack(double a, double b) {
	    if (a != 0) {
	        return b / a;
	    } else {
	        throw new ArithmeticException("Division by zero");
	    }
    }
}
