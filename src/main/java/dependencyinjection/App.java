package dependencyinjection;

public class App {

    public static void main(String[] args) {
        Engine engine = new LargeEngine(500);
        Vehicle raceCar = new Vehicle(engine);
        raceCar.crankIgnition();
    }
}
