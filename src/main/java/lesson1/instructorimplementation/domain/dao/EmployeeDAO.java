package lesson1.instructorimplementation.domain.dao;

import lesson1.instructorimplementation.domain.Employee;

public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
        System.out.println("saved employee to the database" + employee);
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("deleted employee from the database" + employee);
    }
}
