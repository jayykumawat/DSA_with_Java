package file_handling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*Problem Understanding
The goal is to read a text file efficiently. Instead of making the CPU wait for the hard drive for every single letter, we use a "Buffer" (a temporary storage area) to grab a big chunk of data at once and then process it line by line.*/

public class BufferedReaderDemo {
    public static void main(String[] args) {
    
        try {
            BufferedReader reader=new BufferedReader(new FileReader("data/test.txt"));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Could not read the File: "+e.getMessage());
        }
    }
}
/*Time ComplexityTime: $O(n), where N is the total number of characters.Efficiency: This is much faster than FileReader alone because it reduces the number of "I/O Operations" (expensive trips to the hard drive). */
