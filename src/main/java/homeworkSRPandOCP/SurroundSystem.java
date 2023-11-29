package homeworkSRPandOCP;

public class SurroundSystem extends Device {

    @Override
    public void turnOn() {
        System.out.println("Turn on Surround System Device");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Surround System Device");
    }

    @Override
    public void performOps() {
        increaseVolume();
        decreaseVolume();
    }

    private void increaseVolume() {
        System.out.println("Increasing Surround System Volume");
    }

    private void decreaseVolume() {
        System.out.println("Decreasing Surround System Volume");
    }
}
