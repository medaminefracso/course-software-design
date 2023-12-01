package observerpatternmysolution.clients;

import observerpatternmysolution.EmployeeManagementSystem;
import observerpatternmysolution.clients.departments.HRDepartment;
import observerpatternmysolution.clients.departments.IObserver;
import observerpatternmysolution.clients.departments.PayrollDepartment;

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
