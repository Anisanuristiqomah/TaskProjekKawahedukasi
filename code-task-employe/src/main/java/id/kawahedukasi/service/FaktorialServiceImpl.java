package id.kawahedukasi.service;

import id.kawahedukasi.model.Faktorial;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.ws.rs.PathParam;
import java.util.List;

@ApplicationScoped
public class FaktorialServiceImpl {

    @Inject
    EntityManager entityManager;

    @Transactional
    public List<Faktorial> getById(@PathParam("id") int id) {
        String sql = "SELECT f.id, f.n, f.factorial FROM faktorial f WHERE f.n <= :id";
        Query query = entityManager.createNativeQuery(sql, Faktorial.class);
        query.setParameter("id", id);
        return query.getResultList();
    }
}
