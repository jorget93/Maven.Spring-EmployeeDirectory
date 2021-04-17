package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.Entities.Department;
import io.zipcoder.persistenceapp.Entities.Employee;
import io.zipcoder.persistenceapp.Repositories.DepartmentRepository;
import io.zipcoder.persistenceapp.Repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository){
        this.repository = repository;
    }

    public Iterable<Employee> index() {
        return repository.findAll();
    }

    public Employee show(Long employeeNumber){
        return repository.findOne(employeeNumber);
    }


    public Employee create(Employee employee) {
        return repository.save(employee);
    }


    public Employee update( Long number, Employee newEmployee) {
        Employee employee = repository.findOne(number);
        employee.setFirstName(newEmployee.getFirstName());
        employee.setLastName(newEmployee.getLastName());
        employee.setTitle(newEmployee.getTitle());
        employee.setPhoneNumber(newEmployee.getPhoneNumber());
        employee.setEmail(newEmployee.getEmail());
        employee.setHireDate(newEmployee.getHireDate());
        employee.setManager(employee.getManager());
        return repository.save(employee);
    }

    public Boolean delete( Long id) {
        repository.delete(id);
        return true;
    }

}
