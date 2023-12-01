package factoryDP;

import factoryDP.vehicles.Vehicle;

public class App {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("Car");
        vehicle.startEngine();
    }
}
