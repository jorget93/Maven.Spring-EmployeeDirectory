package io.zipcoder.persistenceapp.Entities;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentNumber;
    private String name;
    @ManyToOne
    private Employee departmentManager;

    public Department() {
    }

    public Department(Long departmentNumber, String name, Employee departmentManager) {
        this.departmentNumber = departmentNumber;
        this.name = name;
        this.departmentManager = departmentManager;
    }

    public Long getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Long departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Employee departmentManager) {
        this.departmentManager = departmentManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentNumber, that.departmentNumber) && Objects.equals(name, that.name) && Objects.equals(departmentManager, that.departmentManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentNumber, name, departmentManager);
    }
}
