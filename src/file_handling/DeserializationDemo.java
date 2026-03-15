package file_handling;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
public static void main(String[] args) {
   try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("data/Student.ser"))) {
    Student s1=(Student)os.readObject();
    os.close();

    System.out.println("Student ID: "+s1.id);
    System.out.println("Student Name: "+s1.name);

   } catch (FileNotFoundException e) {
    System.out.println("Error the save file is not found!");
   }
   catch(IOException|ClassNotFoundException e){
    e.printStackTrace();
   }
}    
}
