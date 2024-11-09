package pgpasci.backend.CRUD.JPA.PostgreSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Model.Dto.EmployeeDto;
import pgpasci.backend.CRUD.JPA.PostgreSQL.Service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("/company")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        List<EmployeeDto> employeeDto = employeeService.findAllEmployees();
        model.addAttribute("employees",employeeDto);
        return "employees-list";
    }
}
