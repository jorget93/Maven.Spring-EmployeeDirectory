package io.zipcoder.persistenceapp.Controllers;

import io.zipcoder.persistenceapp.Entities.Employee;
import io.zipcoder.persistenceapp.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public ResponseEntity<Iterable<Employee>> index() {
        return new ResponseEntity<>(employeeService.index(), HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> show(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.show(id), HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> create(Employee employee) {
        return new ResponseEntity<>(employeeService.create(employee), HttpStatus.CREATED);
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> update(@PathVariable Long id, Employee employee) {
        return new ResponseEntity<>(employeeService.update(id, employee), HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.delete(id), HttpStatus.OK);
    }
}
