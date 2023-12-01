package factorydp;

import factorydp.vehicles.Vehicle;
import factorydp.vehicles.VehicleType;

public class App {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.ELECTRIC);
        vehicle.startEngine();
    }
}
