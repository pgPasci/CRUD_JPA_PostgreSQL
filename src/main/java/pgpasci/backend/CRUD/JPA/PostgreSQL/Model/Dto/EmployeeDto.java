package pgpasci.backend.CRUD.JPA.PostgreSQL.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Model.Entity.EmployeeEntity;

import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {

    private Long id;
    private String firstname;
    private String lastname;

    public static EmployeeDto toDto(EmployeeEntity employeeEntity){
        return EmployeeDto.builder()
                .id(employeeEntity.getId())
                .firstname(employeeEntity.getFirstname())
                .lastname(employeeEntity.getLastname())
                .build();
    }
}
