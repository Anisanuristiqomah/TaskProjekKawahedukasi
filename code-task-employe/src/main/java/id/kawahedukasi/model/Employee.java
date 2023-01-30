package id.kawahedukasi.model;

import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employeeSeq")
    @SequenceGenerator(name = "employeeSeq", sequenceName = "employee_id_seq", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    public Integer id;

    @Column(name = "name")
    public String name;

    @Column(name = "manager_id")
    public Integer managerId;


}
