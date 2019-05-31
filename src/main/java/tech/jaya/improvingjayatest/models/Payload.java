package tech.jaya.improvingjayatest.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Payload {

    @Id
    private Long id;

    private String action;
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn(name = "issue", referencedColumnName = "id")
    private Issue issue;

}
