package observerpatternassignment;

import observerpatternassignment.clients.departments.IObserver;
import observerpatternassignment.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    Employee employee;

    List<IObserver> observerList = new ArrayList<>();

    public void notifyAllDepartments() {
        for(IObserver department : observerList) {
            department.callMe();
        }
    }

    public void HireNewEmployee(Employee employee) {
        System.out.println("New Hire: " + employee.getName());
    }

    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    public void modifyEmployeeName(int employeeId, String newName) {
        for(IObserver department : observerList) {
            department.notifyEmployeeChange(employeeId, newName);
        }
    }
}
