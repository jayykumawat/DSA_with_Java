package oops_Levelup.abstraction;

public class AbstractionTest {

    public static void main(String[] args) {

        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Yamaha");

        v1.start();
        v1.fuelType();

        v2.start();
        v2.fuelType();
    }
}