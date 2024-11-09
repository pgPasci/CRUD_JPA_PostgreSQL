package pgpasci.backend.CRUD.JPA.PostgreSQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Model.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
