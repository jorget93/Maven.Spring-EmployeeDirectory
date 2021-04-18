package io.zipcoder.persistenceapp.Entities;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long department_Number;
    private String name;
    @ManyToOne
    private Employee department_Manager;

    public Department() {
    }

    public Department(Long departmentNumber, String name, Employee departmentManager) {
        this.department_Number = departmentNumber;
        this.name = name;
        this.department_Manager = departmentManager;
    }

    public Long getDepartmentNumber() {
        return department_Number;
    }

    public void setDepartmentNumber(Long departmentNumber) {
        this.department_Number = departmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDepartmentManager() {
        return department_Manager;
    }

    public void setDepartmentManager(Employee departmentManager) {
        this.department_Manager = departmentManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(department_Number, that.department_Number) && Objects.equals(name, that.name) && Objects.equals(department_Manager, that.department_Manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department_Number, name, department_Manager);
    }
}
