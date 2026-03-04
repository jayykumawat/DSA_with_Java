package exception_handling_advanced;

public class ExceptionChainingDemo {

    static void databaseLayer() {
        throw new RuntimeException("Database connection failed");
    }

    static void serviceLayer() {
        try {
            databaseLayer();
        } catch (RuntimeException e) {
            throw new RuntimeException("Service layer failed", e);
        }
    }

    public static void main(String[] args) {
        try {
            serviceLayer();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}