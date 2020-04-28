package sayuri.cicddemo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sayuri.cicddemo.domain.Employee;
import sayuri.cicddemo.repository.BaseCrudRepository;

@Service
@Transactional
public interface EmployeeService extends BaseCrudRepository<Employee, Integer> {
}
