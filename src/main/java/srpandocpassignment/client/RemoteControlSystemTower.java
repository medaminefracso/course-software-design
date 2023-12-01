package srpandocpassignment.client;

import srpandocpassignment.RemoteControlSystem;
import srpandocpassignment.devices.Projector;
import srpandocpassignment.devices.SurroundSystem;
import srpandocpassignment.devices.TV;

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
