package tech.jaya.improvingjayatest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class RegistryPackage {

    @Id
    private Long id;

    private String name;
    private LocalDateTime created_at;
}
