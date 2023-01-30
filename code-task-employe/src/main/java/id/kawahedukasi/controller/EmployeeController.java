package id.kawahedukasi.controller;


import id.kawahedukasi.model.Employee;
import id.kawahedukasi.service.EmployeeService;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeController {

    @Inject
    EmployeeService employeeService;

    // query data by id tapi manager id asc untuk mendapat data bawahan
    @GET
    @Path("/{id}")
    public List<Employee> getById(@PathParam("id") int id) {
        return employeeService.getById(id);
    }

    //menghitung semua rata - rata score dari employee_score
    @GET
    @Path("/average")
    public List<Object> getAverageScore() {
        return employeeService.getAverageScore();
    }

}