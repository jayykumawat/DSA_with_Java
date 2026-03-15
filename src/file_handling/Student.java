package file_handling;
import java.io.Serializable;
/**
 * Serializable Student class.
 */

public class Student implements Serializable{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
