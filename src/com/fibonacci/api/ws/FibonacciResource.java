package com.fibonacci.api.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.fibonacci.api.model.Fibonacci;
import com.fibonacci.api.service.FibonacciService;
import com.fibonacci.customexception.FibonacciException;


@Path("fibonacci")
public class FibonacciResource {

	@GET
	@Path("{range}")
	@Produces("application/json")
	public Fibonacci getFibonacci(@PathParam("range") int range) throws FibonacciException{
		
		System.out.println("range is ::"+ range);
		if(range<=0 || range>=50){
			/*
			 * Upper boundary is 50
			 */
			throw new FibonacciException("Invalid range : "+range, 500);
		}
		FibonacciService fibonacciService = new FibonacciService();
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.setInputRange(range);
		fibonacci.setFibonacciNumber(fibonacciService.calculateFibonacciRange(range));
		return fibonacci;
		
	}
}