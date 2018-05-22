package com.microprofile.sample.todo.app;


import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/todo")
public class TodoResource extends Application {

    @GET
    @Produces("text/plain")
    public Response getTodo() {
        return Response.ok("Great,it works!").build();
    }


}
