package oops_Levelup.abstraction;

/**
 * Abstract class representing a generic Vehicle.
 * Demonstrates abstraction.
 */
public abstract class Vehicle {

    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (must be implemented)
    public abstract void start();

    // Concrete method (common behavior)
    public void fuelType() {
        System.out.println("Vehicle uses fuel or electricity");
    }
}