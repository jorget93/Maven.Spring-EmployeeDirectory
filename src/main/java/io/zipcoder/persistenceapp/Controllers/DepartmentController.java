package io.zipcoder.persistenceapp.Controllers;

import io.zipcoder.persistenceapp.Entities.Department;
import io.zipcoder.persistenceapp.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DepartmentController {

    private DepartmentService service;

    @Autowired
    public DepartmentController(DepartmentService service){
        this.service = service;
    }

    @GetMapping("/department")
    public ResponseEntity<Iterable<Department>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/department/{id}")
    public ResponseEntity<Department> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }

    @PostMapping("/department")
    public ResponseEntity<Department> create(Department department) {
        return new ResponseEntity<>(service.create(department), HttpStatus.CREATED);
    }

    @PutMapping("/department")
    public ResponseEntity<Department> update(@PathVariable Long id, Department department) {
        return new ResponseEntity<>(service.update(id, department), HttpStatus.OK);
    }

    @DeleteMapping("/department/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
