package lesson1.instructorimplementation.clients;

import lesson1.instructorimplementation.domain.Employee;
import lesson1.instructorimplementation.domain.dao.EmployeeDAO;
import lesson1.instructorimplementation.reporting.EmployeeReportFormatter;
import lesson1.instructorimplementation.reporting.FormatType;

public class ClientModule {

    public static void main(String[] args) {
        Employee peggy = new Employee(1, "Peggy", "Accounting" +
                "deparment", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
