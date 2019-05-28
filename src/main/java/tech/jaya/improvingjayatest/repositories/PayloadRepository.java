package tech.jaya.improvingjayatest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.jaya.improvingjayatest.models.Payload;

@Repository
public interface PayloadRepository extends CrudRepository<Payload, Long> {

}
