package sayuri.cicddemo.service.impl;

import sayuri.cicddemo.domain.Employee;
import sayuri.cicddemo.repository.EmployeeRepository;
import sayuri.cicddemo.service.EmployeeService;

public class EmployeeServiceImpl extends AbstractCrudService<Employee, Integer> implements EmployeeService {

    public EmployeeServiceImpl(EmployeeRepository repository) {
        super(repository);
    }
}
