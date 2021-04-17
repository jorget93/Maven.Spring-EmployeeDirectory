package io.zipcoder.persistenceapp.Services;

import io.zipcoder.persistenceapp.Entities.Department;
import io.zipcoder.persistenceapp.Repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository){
        this.repository= repository;
    }

    public Iterable<Department> index() {
        return repository.findAll();
    }

    public Department show(Long departmentNumber){
        return repository.findOne(departmentNumber);
    }


    public Department create(Department department) {
        return repository.save(department);
    }


    public Department update( Long id, Department newDepartment) {
        Department department = repository.findOne(id);
        department.setName(newDepartment.getName());
        return repository.save(department);
    }

    public Boolean delete( Long id) {
        repository.delete(id);
        return true;
    }
}
