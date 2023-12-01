package observerpatternassignment.clients.departments;

public class PayrollDepartment extends IObserver {

    @Override
    public void callMe() {
        System.out.println("PAYROLL department notified...");
    }
}
