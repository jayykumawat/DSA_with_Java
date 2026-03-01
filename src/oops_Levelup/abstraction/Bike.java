package oops_Levelup.abstraction;

public class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " bike starts with self-start button.");
    }
}