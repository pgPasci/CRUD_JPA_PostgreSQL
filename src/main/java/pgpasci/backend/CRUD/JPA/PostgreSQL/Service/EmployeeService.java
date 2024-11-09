package pgpasci.backend.CRUD.JPA.PostgreSQL.Service;


import pgpasci.backend.CRUD.JPA.PostgreSQL.Model.Dto.EmployeeDto;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Repository.EmployeeRepository;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> findAllEmployees();
}
