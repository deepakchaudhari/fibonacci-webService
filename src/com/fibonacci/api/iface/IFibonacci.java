/**
 * 
 */
package com.fibonacci.api.iface;

/**
 * @author deepakchaudhari
 *
 */
public interface IFibonacci {
	  // Method to calculate the fibonacci sequence
    public int calculateFibonacci( int num );
    // Method to return an array of results
    public String calculateFibonacciRange(int range);
}
