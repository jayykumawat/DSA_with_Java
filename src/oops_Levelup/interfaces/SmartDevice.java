package oops_Levelup.interfaces;

/**
 * Interface representing smart capabilities.
 */
public interface SmartDevice {

    void connectToWifi();

    default void updateFirmware() {
        System.out.println("Updating firmware...");
    }

    static void deviceInfo() {
        System.out.println("SmartDevice interface - Version 1.0");
    }
}
