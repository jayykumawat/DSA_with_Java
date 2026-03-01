package oops_Levelup.interfaces;

public class SmartWatch implements SmartDevice {

    @Override
    public void connectToWifi() {
        System.out.println("SmartWatch connected to WiFi");
    }
}