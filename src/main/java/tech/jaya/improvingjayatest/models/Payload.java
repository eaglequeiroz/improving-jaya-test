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
    @JoinColumn(name = "registry_package", referencedColumnName = "id")
    private RegistryPackage registry_package;


}
