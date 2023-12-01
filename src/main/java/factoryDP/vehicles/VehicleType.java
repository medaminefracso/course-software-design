package factoryDP.vehicles;

public enum VehicleType {
    TRUCK,
    CAR,
    ELECTRIC;

    public Vehicle getVehicle() {
        switch(this) {
            case TRUCK:
                return new Truck();
            case CAR:
                return new Car();
            case ELECTRIC:
                return new ElectricCar();
        }
        return null;
    }
}
