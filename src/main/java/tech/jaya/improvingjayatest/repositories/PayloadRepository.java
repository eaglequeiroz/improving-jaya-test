package tech.jaya.improvingjayatest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.jaya.improvingjayatest.models.Payload;

@Repository
public interface PayloadRepository extends JpaRepository<Payload, Long> {

    Payload findByActionAndIssueId(String action, Long id);

}
