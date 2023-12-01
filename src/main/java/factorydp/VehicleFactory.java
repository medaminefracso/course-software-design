package factorydp;

import factorydp.vehicles.Vehicle;
import factorydp.vehicles.VehicleType;

public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {

//        if(vehicleType == VehicleType.TRUCK) {
//            return new Truck();
//        } else if(vehicleType == VehicleType.CAR) {
//            return new Car();
//        } else if(vehicleType == VehicleType.ELECTRIC) {
//            return new ElectricCar();
//        }

        return vehicleType.getVehicle();
    }
}
