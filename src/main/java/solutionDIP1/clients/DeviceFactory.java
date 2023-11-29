package solutionDIP1.clients;

import solutionDIP1.processes.GeneralManufacturingProcess;
import solutionDIP1.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone process");
        manufacturer.launchProcess();
    }
}
