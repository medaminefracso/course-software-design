package observerpatternassignment.clients.departments;

public abstract class IObserver {

    public abstract void callMe();

    public void notifyEmployeeChange(int employeeId, String newName) {
        callMe();
        System.out.println("Employee Name Changed: " + newName);
    }
}
