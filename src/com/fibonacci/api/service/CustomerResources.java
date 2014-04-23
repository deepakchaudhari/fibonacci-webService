package com.fibonacci.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.fibonacci.api.model.Customer;

@Path("customers")
public class CustomerResources {

//	@GET
//	@Path("{id}")
//	public List<Customer> getCustomers(@PathParam("id") int cId) {
//		throw new UnsupportedOperationException("Not yet implemented.");
//	}

	@GET
	@Path("{id}")
	public Customer getCustomrer(@PathParam("id") int cId) {
		throw new UnsupportedOperationException("Not yet implemented.");
	}
}