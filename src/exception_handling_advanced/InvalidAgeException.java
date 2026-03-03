package exception_handling_advanced;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message){
        super(message);
    }
}
