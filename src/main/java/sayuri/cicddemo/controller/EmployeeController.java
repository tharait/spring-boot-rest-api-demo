package sayuri.cicddemo.controller;

import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sayuri.cicddemo.domain.Employee;
import sayuri.cicddemo.service.EmployeeService;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public Iterable<Employee> list() {
        return employeeService.findAll();
    }

    @GetMapping("paginate")
    public Page<Employee> paginate(@QuerydslPredicate(root = Employee.class) Predicate predicate, Pageable pageable) {
        return employeeService.findAll(predicate, pageable);
    }
}
