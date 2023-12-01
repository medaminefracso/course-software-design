package factoryDP;

import factoryDP.vehicles.Car;
import factoryDP.vehicles.ElectricCar;
import factoryDP.vehicles.Truck;
import factoryDP.vehicles.Vehicle;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {

        if(vehicleType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        } else if(vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if(vehicleType.equalsIgnoreCase("ELECTRIC")) {
            return new ElectricCar();
        }

        return null;
    }
}
