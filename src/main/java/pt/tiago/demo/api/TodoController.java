package pt.tiago.demo.api;

import pt.tiago.demo.api.service.TaskService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 */
@Path("/todo")
@Singleton
public class TodoController {

    @Inject
    TaskService service;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTask(@PathParam("id") int id){
        return Response.ok(service.getTask(id)).build();
    }

    @POST
    @Path("{taskName}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTask(@PathParam("taskName") String taskName) {
        return Response.ok(service.addTask(taskName)).build();
    }

    @GET
    public Response getTasks() {
        return Response.ok(service.getAllTasks()).build();
    }
}
