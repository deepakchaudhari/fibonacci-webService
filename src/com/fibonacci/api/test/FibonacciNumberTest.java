package com.fibonacci.api.test;

import com.fibonacci.api.service.FibonacciService;

import junit.framework.TestCase;

public class FibonacciNumberTest extends TestCase {

	public void testfibonacciNumber(){
		
		int range = 5;
		FibonacciService fibonacciService = new FibonacciService();
		System.out.println(fibonacciService.calculateFibonacciRange(range));
		
	}
}
