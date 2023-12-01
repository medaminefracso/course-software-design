package factorydp.vehicles;

public enum VehicleType {
    TRUCK {
        public Vehicle getVehicle() {
            return new Truck();
        }
    },
    CAR {
        public Vehicle getVehicle() {
            return new Car();
        }
    },
    ELECTRIC {
        public Vehicle getVehicle() {
            return new ElectricCar();
        }
    };

    public abstract Vehicle getVehicle();
}
