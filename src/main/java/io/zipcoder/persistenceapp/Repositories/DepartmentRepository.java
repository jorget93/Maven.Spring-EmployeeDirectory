package io.zipcoder.persistenceapp.Repositories;

import io.zipcoder.persistenceapp.Entities.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {
}
