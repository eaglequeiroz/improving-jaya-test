package tech.jaya.improvingjayatest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
class Milestone {

    @Id
    private Long id;

    private LocalDateTime created_at;
}
