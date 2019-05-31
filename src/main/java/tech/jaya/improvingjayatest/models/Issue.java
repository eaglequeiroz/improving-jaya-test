package tech.jaya.improvingjayatest.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entity_id;

    private Long id;
    private LocalDate created_at;

}
