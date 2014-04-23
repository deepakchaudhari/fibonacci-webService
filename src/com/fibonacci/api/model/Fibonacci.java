/**
 * 
 */
package com.fibonacci.api.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author deepakchaudhari
 *
 */
@XmlRootElement
public class Fibonacci {
	
	private int inputRange;
	private String fibonacciNumber;
	
	

	
	public String getFibonacciNumber() {
		return fibonacciNumber;
	}
	public void setFibonacciNumber(String fibonacciNumber) {
		this.fibonacciNumber = fibonacciNumber;
	}
	public int getInputRange() {
		return inputRange;
	}
	public void setInputRange(int inputRange) {
		this.inputRange = inputRange;
	}	

}
