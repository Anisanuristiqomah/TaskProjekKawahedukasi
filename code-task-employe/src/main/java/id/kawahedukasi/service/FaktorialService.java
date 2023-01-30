package id.kawahedukasi.service;

import id.kawahedukasi.model.Faktorial;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class FaktorialService {

    @Transactional
    public Response create(@QueryParam("nilai") String nilai){
        Integer n = Integer.parseInt(nilai);
        if(n < 0) {
            return Response.status(400).build();
        }
        Integer factorial = 1;
        for ( Integer i = 1 ; i <= n ; i++) {
            factorial *= i;
        }
        Faktorial faktorial = new Faktorial();
        faktorial.n = n;
        faktorial.factorial = factorial;
        faktorial.persist();
        return Response.ok(factorial).build();
    }
}
