package tech.jaya.improvingjayatest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
class Issue {

    @Id
    private Long id;
}
