package id.kawahedukasi.controller;


import id.kawahedukasi.model.Faktorial;
import id.kawahedukasi.service.FaktorialServiceImpl;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/get")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FaktorialControllerImpl {

    @Inject
    FaktorialServiceImpl faktorialServiceImpl;


    // get data faktorial by n
    @GET
    @Path("/{id}")
    public List<Faktorial> getById(@PathParam("id") int id) {
        return faktorialServiceImpl.getById(id);
    }
}
