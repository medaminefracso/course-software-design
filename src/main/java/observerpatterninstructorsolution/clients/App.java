package observerpatterninstructorsolution.clients;

import observerpatterninstructorsolution.EmployeeManagementSystem;
import observerpatterninstructorsolution.domain.Employee;
import observerpatterninstructorsolution.observers.HRDepartment;
import observerpatterninstructorsolution.observers.IObserver;
import observerpatterninstructorsolution.observers.PayrollDepartment;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(6, "Imtiaz");
    }
}
