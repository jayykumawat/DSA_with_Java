package exception_handling_advanced;

public class RethrowDemo {
    static void process() throws Exception{
     try {
        int result =10/0;
     } catch (ArithmeticException e) {
        System.out.println("Logging exception...");
            throw e;  // Rethrowing
     }
    }
    public static void main(String[] args) {
        try {
            process();
        } catch (Exception e) {
           System.out.println("Handled in main.");
        }
    }
}
