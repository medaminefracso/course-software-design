package homeworkSRPandOCP.client;

import homeworkSRPandOCP.RemoteControlSystem;
import homeworkSRPandOCP.devices.Projector;
import homeworkSRPandOCP.devices.SurroundSystem;
import homeworkSRPandOCP.devices.TV;

public class RemoteControlSystemTower {
    public static void main(String[] args) {
        RemoteControlSystem remoteControlSystem = RemoteControlSystem.getInstance();

        Projector projectorDevice = new Projector();
        SurroundSystem surroundSystem = new SurroundSystem();
        TV tv = new TV();

        remoteControlSystem.turnOn(tv);

        remoteControlSystem.turnOn(projectorDevice);
        remoteControlSystem.performOperations(projectorDevice);

        remoteControlSystem.turnOn(surroundSystem);
        remoteControlSystem.performOperations(surroundSystem);
        remoteControlSystem.turnOff(surroundSystem);
    }
}
