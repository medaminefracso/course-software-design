package homeworkSRPandOCP.devices;

import homeworkSRPandOCP.devices.Device;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turn on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off TV");
    }

    @Override
    public void performOps() {
        switchToFavouriteChannel();
        setAlarmBehavior();
    }

    private void switchToFavouriteChannel() {
        System.out.println("Switching to favourite channel..");
    }

    private void setAlarmBehavior() {
        System.out.println("Setting an alarm behavior..");
    }
}
