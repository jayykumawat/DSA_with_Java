package advanced_java;
import java.util.Optional;
public class OptionalDemo {
    public static void main(String[] args) {
        String name=null;
        Optional<String> optionalname= Optional.ofNullable(name);

        if(optionalname.isPresent()){
            System.out.println("Value: "+optionalname.get());
        }
        else{
            System.out.println("Value is null ");
        }

        String result=optionalname.orElse("Default name: Jayy");
        System.out.println("Default name by orElse: "+result);

        String result2=optionalname.orElseGet(()->"Generate value ");
        System.out.println("Default value by orelseget "+result2);

        try {
            String result3=optionalname.orElseThrow(()->new RuntimeException("Value not found"));
            System.out.println("try block run: "+result3);
        } catch (Exception e) {
            System.out.println("Exception "+e.getMessage());
        }
    }
}
