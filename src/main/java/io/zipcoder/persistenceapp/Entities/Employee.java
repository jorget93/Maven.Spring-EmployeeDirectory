package io.zipcoder.persistenceapp.Entities;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employee_Number;
    private String first_Name;
    private String last_Name;
    private String title;
    private String phone_Number;
    private String email;
    private String hire_Date;
    private String manager;
    @ManyToOne
    private Department department_Number;

    public Employee() {
    }

    public Employee(Long employeeNumber, String firstName, String lastName,
                    String title, String phoneNumber, String email, String hireDate,
                    String manager, Department departmentNumber) {
        this.employee_Number = employeeNumber;
        this.first_Name = firstName;
        this.last_Name = lastName;
        this.title = title;
        this.phone_Number = phoneNumber;
        this.email = email;
        this.hire_Date = hireDate;
        this.manager = manager;
        this.department_Number = departmentNumber;
    }

    public Long getEmployeeNumber() {
        return employee_Number;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employee_Number = employeeNumber;
    }

    public String getFirstName() {
        return first_Name;
    }

    public void setFirstName(String firstName) {
        this.first_Name = firstName;
    }

    public String getLastName() {
        return last_Name;
    }

    public void setLastName(String lastName) {
        this.last_Name = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phone_Number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_Number = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireDate() {
        return hire_Date;
    }

    public void setHireDate(String hireDate) {
        this.hire_Date = hireDate;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Department getDepartmentNumber() {
        return department_Number;
    }

    public void setDepartmentNumber(Department departmentNumber) {
        this.department_Number = departmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employee_Number, employee.employee_Number) && Objects.equals(first_Name, employee.first_Name) && Objects.equals(last_Name, employee.last_Name) && Objects.equals(title, employee.title) && Objects.equals(phone_Number, employee.phone_Number) && Objects.equals(email, employee.email) && Objects.equals(hire_Date, employee.hire_Date) && Objects.equals(manager, employee.manager) && Objects.equals(department_Number, employee.department_Number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_Number, first_Name, last_Name, title, phone_Number, email, hire_Date, manager, department_Number);
    }
}
