package lesson1.myimplementation;

public class EmployeeReportFormatter extends ReportFormatter {
    private Employee employee;

    public String getFormattedValue() {
        return super.getFormattedValue(this.employee);
    }
}
