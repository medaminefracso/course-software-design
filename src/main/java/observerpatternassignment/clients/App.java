package observerpatternassignment.clients;

import observerpatternassignment.EmployeeManagementSystem;
import observerpatternassignment.clients.departments.HRDepartment;
import observerpatternassignment.clients.departments.IObserver;
import observerpatternassignment.clients.departments.PayrollDepartment;

public class App {

    public static void main(String[] args) {

        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        ems.modifyEmployeeName(5, "Imtiaz");
    }
}
