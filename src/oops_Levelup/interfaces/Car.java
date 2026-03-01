package oops_Levelup.interfaces;

public class Car implements SmartDevice {

    @Override
    public void connectToWifi() {
        System.out.println("Car connected to WiFi");
    }
}
