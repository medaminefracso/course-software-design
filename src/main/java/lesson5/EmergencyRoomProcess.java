package lesson5;

public class EmergencyRoomProcess {
    public static void main(String[] args) {

        HospitalManagement erDirector = new HospitalManagement();
        Employee peggy = new Nurse(1, "Peggy", "emergency", true);

        erDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        erDirector.callUpon(suzan);
    }
}
