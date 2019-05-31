package tech.jaya.improvingjayatest.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Payload {

    @Id
    private Long id;

    private String action;

    @ManyToOne
    @JoinColumn(name = "issue", referencedColumnName = "id")
    private Issue issue;

    @ManyToOne
    @JoinColumn(name = "milestone", referencedColumnName = "id")
    private Milestone milestone;


}
