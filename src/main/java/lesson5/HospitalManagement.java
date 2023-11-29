package lesson5;

// This class viloates SRP + OCP - two of SOLID principles
public class HospitalManagement {

    public void callUpon(Employee employee) {
        employee.performDuties();
    }
}
