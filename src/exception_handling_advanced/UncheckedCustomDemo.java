package exception_handling_advanced;

public class UncheckedCustomDemo {
     static void validateAge(int age) {
        if(age<18){
            throw new InvalidAgeException("Age must be 18+");
        }
     }
     public static void main(String[] args) {
        validateAge(16);     // No compile-time warning
     }
}
