package id.kawahedukasi.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.vertx.core.json.JsonObject;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;

@Entity
@Table(name = "faktorial")
public class Faktorial extends PanacheEntityBase {

    @Id
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid")
    @Column(name = "id", nullable = false, length = 36)
    private String id; //uuid

    @Column(name = "n")
    public Integer n;

    @Column(name = "factorial")
    public Integer factorial;

}




