package file_handling;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/*Problem Understanding
The goal is to persist (save) a custom Java object to a file. Standard FileWriter or FileOutputStream only understands characters or bytes. ObjectOutputStream is the special "translator" that knows how to take a complex Java object and flatten it into a stream of bytes.
*/
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
