package homeworkSRPandOCP;

public class RemoteControlSystem {

    public void turnOn(Device device) {
        device.turnOn();
    }

    public void turnOff(Device device) {
        device.turnOff();
    }

    public void performOperations(Device device) {
        device.performOps();
    }
}
