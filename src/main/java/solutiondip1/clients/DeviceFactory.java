package solutiondip1.clients;

import solutiondip1.processes.GeneralManufacturingProcess;
import solutiondip1.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone process");
        manufacturer.launchProcess();
    }
}
