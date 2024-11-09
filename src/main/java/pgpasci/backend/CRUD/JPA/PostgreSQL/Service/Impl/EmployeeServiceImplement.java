package pgpasci.backend.CRUD.JPA.PostgreSQL.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Model.Dto.EmployeeDto;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Model.Entity.EmployeeEntity;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Repository.EmployeeRepository;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Service.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplement implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDto> findAllEmployees() {
        List<EmployeeEntity> employeeEntity = employeeRepository.findAll();
        return employeeEntity.stream()
                /*
                     !! Try This Best Practice !!
                    TODO  :
                        (this::mapToEmployeeDto)
                            NOTE : THIS FUNCTION NAMED METHOD REFERENCE
                */
                .map(employee -> EmployeeDto.toDto(employee))
                .collect(Collectors.toList());
    }

/*    private EmployeeDto mapToEmployeeDto(EmployeeEntity employeeEntity) {
        return EmployeeDto.builder()
                .id(employeeEntity.getId())
                .firstname(employeeEntity.getFirstname())
                .lastname(employeeEntity.getLastname())
                .build();
    }*/
}
