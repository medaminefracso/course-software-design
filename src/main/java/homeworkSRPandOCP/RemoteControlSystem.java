package homeworkSRPandOCP;

import homeworkSRPandOCP.devices.Device;

public class RemoteControlSystem {

    private Device device = null;
    private static final RemoteControlSystem INSTANCE = new RemoteControlSystem();

    public static RemoteControlSystem getInstance() {
        return INSTANCE;
    }

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
