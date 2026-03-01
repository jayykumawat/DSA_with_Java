package oops_Levelup.interfaces;

public class InterfaceTest {

    public static void main(String[] args) {

        SmartDevice car = new Car();
        SmartDevice watch = new SmartWatch();

        car.connectToWifi();
        car.updateFirmware();

        watch.connectToWifi();

        SmartDevice.deviceInfo(); // static method call
    }
}
