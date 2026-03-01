package oops_Levelup.abstraction;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " car starts with a key ignition.");
    }
}