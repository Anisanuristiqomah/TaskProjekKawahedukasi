package id.kawahedukasi.controller;

import id.kawahedukasi.model.Faktorial;
import id.kawahedukasi.service.FaktorialService;
import io.vertx.core.json.JsonObject;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/item")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class FaktorialaController {

    @Inject
    FaktorialService faktorialService;

    // post data faktorial dari n
    @POST
    public Response create(@QueryParam("nilai") String nilai){
        return faktorialService.create(nilai);
    }


}
