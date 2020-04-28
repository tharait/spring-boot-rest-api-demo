package sayuri.cicddemo.service.impl;

import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sayuri.cicddemo.domain.Employee;
import sayuri.cicddemo.repository.EmployeeRepository;
import sayuri.cicddemo.service.EmployeeService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EmployeeServiceImplTest {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void save() {
        Employee item = randomEmployee(false);
        Employee saved = employeeService.save(item);
        assertNotNull(saved.getId());
        assertEquals(saved.getVer(), 0);
    }

    private Employee randomEmployee(boolean persistent) {
        Employee item = new Employee();
        item.setName(RandomString.make(5) + " Name");
        item.setAge(30);

        if (persistent) {
            item = employeeRepository.save(item);
        }

        return item;
    }
}