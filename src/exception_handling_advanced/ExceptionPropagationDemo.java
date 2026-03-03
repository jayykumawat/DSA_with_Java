package exception_handling_advanced;

public class ExceptionPropagationDemo {
    static void method3(){
        int result =10/0; // Exception occurs here
    }
    static void method2(){
        method3();        // No Handling Here
    }
    static void method1(){
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception Handling in method 1");
        }
    }
    public static void main(String[] args) {
        method1();
        System.out.println("Program continues...");
    }
}
