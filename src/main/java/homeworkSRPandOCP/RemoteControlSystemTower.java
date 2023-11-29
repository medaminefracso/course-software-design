package homeworkSRPandOCP;

public class RemoteControlSystemTower {
    public static void main(String[] args) {
        RemoteControlSystem remoteControlSystem = new RemoteControlSystem();

        ProjectorDevice projectorDevice = new ProjectorDevice();
        SurroundSystem surroundSystem = new SurroundSystem();
        TVDevice tv = new TVDevice();

        remoteControlSystem.turnOn(tv);

        remoteControlSystem.turnOn(projectorDevice);
        remoteControlSystem.performOperations(projectorDevice);

        remoteControlSystem.turnOn(surroundSystem);
        remoteControlSystem.performOperations(surroundSystem);
        remoteControlSystem.turnOff(surroundSystem);
    }
}
