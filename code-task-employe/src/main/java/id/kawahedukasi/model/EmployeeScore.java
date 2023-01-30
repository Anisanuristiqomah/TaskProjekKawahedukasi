package id.kawahedukasi.model;

import javax.persistence.*;

@Entity
@Table (name = "employee_score")
public class EmployeeScore {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_scoreSeq")
    @SequenceGenerator(name = "employee_scoreSeq", sequenceName = "employee_score_id_seq", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    public Integer id;

    @Column(name = "name")
    public String name;

    @Column(name = "score")
    public Integer score;

}
