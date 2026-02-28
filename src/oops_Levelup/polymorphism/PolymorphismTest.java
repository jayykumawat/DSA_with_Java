package oops_Levelup.polymorphism;

public class PolymorphismTest {

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}