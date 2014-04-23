package com.fibonacci.customexception;

public class FibonacciException extends Exception {
	 
    private static final long serialVersionUID = 4351720088030656859L;
    private int errorId;
 
    public int getErrorId() {
        return errorId;
    }
 
    public FibonacciException(String msg, int errorId) {
        super(msg);
        this.errorId = errorId;
    }
 
    public FibonacciException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
