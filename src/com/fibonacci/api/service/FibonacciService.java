/**
 * 
 */
package com.fibonacci.api.service;

import com.fibonacci.api.iface.IFibonacci;

/**
 * @author deepakchaudhari
 *
 */
public class FibonacciService implements IFibonacci {

	/* (non-Javadoc)
	 * @see com.fibonacci.api.iface.IFibonacci#calculateFibonacci(int)
	 */
	public int calculateFibonacci(int number) {
		 if(number == 1 || number == 2){
	            return 1;
	        }
	        int fibo1=1, fibo2=1, fibonacci=1;
	        for(int i= 3; i<= number; i++){
	            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
	            fibo1 = fibo2;
	            fibo2 = fibonacci;
	          
	        }
	        return fibonacci; //Fibonacci number
	      
	}

	/* (non-Javadoc)
	 * @see com.fibonacci.api.iface.IFibonacci#calculateFibonacciRange(int, int)
	 */
	public String calculateFibonacciRange(int range) {
		StringBuilder fibonacciNumber = new StringBuilder();
		fibonacciNumber.append(" ");
		for(int i=1; i<=range; i++){
			fibonacciNumber.append(calculateFibonacci(i) +" ");
        }
		return fibonacciNumber.toString();
	}

}
