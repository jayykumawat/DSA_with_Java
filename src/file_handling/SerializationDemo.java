package file_handling;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream oob=new ObjectOutputStream(new FileOutputStream("data/Student.ser"))) {
            Student s1=new Student(101,"Jay");
            oob.writeObject(s1);
            oob.close();
            System.out.println("Object Serialized Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
