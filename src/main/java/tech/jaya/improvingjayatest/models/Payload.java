package tech.jaya.improvingjayatest.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Payload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "issue", referencedColumnName = "entity_id")
    private Issue issue;

}
