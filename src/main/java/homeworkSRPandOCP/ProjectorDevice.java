package homeworkSRPandOCP;

public class ProjectorDevice extends Device {
    @Override
    public void turnOn() {
        System.out.println("Turn on Projector Device");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Projector Device");
    }

    @Override
    public void performOps() {
        pullUp();
        pullDown();
    }

    private void pullUp() {
        System.out.println("Projector doing Pull Up action");
    }

    private void pullDown() {
        System.out.println("Projector doing Pull Down action");
    }
}
