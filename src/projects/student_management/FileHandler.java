package projects.student_management;
import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static String FILE_NAME="students.dat";

    public static void saveStudents(ArrayList<Student>students){
       
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(students);
            System.out.println("Student saved to file..");
        } catch (Exception e) {
            System.out.println("Error ! Saving data");
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Student> loadStudent(){
        try(ObjectInputStream oos=new ObjectInputStream(new FileInputStream(FILE_NAME))){
            return (ArrayList<Student>) oos.readObject();
        } catch (Exception e) {
            System.out.println("No Previous data found.Start Fresh..!");
            return new ArrayList<>();
        }
    }
    
}
