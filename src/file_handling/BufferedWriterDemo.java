package file_handling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("data/test.txt",true));
            
            writer.newLine();
            writer.write("New entry: Learning Synchronization.");
            writer.newLine();
            writer.write("Buffered Writing is very fast..");
            writer.close();

        System.out.println("Data Written Successfully..");

        } catch (IOException e) {
            System.out.println("File error: "+e.getMessage());
        }
    }
}
