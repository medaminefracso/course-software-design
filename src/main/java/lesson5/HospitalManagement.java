package lesson5;

public class HospitalManagement {

    public void callUpon(Employee employee) {
        if(employee instanceof Nurse) {
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        } else if(employee instanceof Doctor) {
            prescribeMedicine();
            diagnosePatients();
        }
    }

    // Nurses
    private void checkVitalSigns() {
        System.out.println("Checking Vitals");
    }

    private void drawBlood() {
        System.out.println("drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("Cleaning Patient Area");
    }

    // Doctors
    private void prescribeMedicine() {
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients() {
        System.out.println("Diagnosing Patient");
    }
}
