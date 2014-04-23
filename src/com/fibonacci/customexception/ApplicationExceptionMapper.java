
package com.fibonacci.customexception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ApplicationExceptionMapper implements
        ExceptionMapper<FibonacciException> {
 
    public ApplicationExceptionMapper() {
    }
     
    public Response toResponse(
    		FibonacciException empNotFoundException) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorId(empNotFoundException.getErrorId());
        errorResponse.setErrorCode(empNotFoundException.getMessage());
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(
                errorResponse).type(
                MediaType.APPLICATION_JSON).build();
 
    }
 
}