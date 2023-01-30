package id.kawahedukasi.service;

import id.kawahedukasi.model.Employee;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.ws.rs.PathParam;
import java.util.List;

@ApplicationScoped
public class EmployeeService {

    @Inject
    EntityManager entityManager;

    @Transactional
    public List<Employee> getById(@PathParam("id") int id) {
        String sql = "SELECT e.id, e.name, e.manager_id FROM employee e WHERE e.id >= :id ORDER BY manager_id ASC";
        Query query = entityManager.createNativeQuery(sql, Employee.class);
        query.setParameter("id", id);
        return query.getResultList();
    }

    @Transactional
    public List<Object> getAverageScore() {
        String sql = "SELECT AVG(score) FROM employee_score";
        Query query = entityManager.createNativeQuery(sql);
        return query.getResultList();
    }
}
