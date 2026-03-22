package file_handling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;;
/*Problem Understanding:-
The mission of this code is to add new text to your test.txt file efficiently. It avoids writing to the hard drive every time you call write(). Instead, it collects the text in a "buffer" (memory) and writes it all at once when the buffer is full or when you close the file.
*/
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
