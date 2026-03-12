package file_handling;

import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates reading a file using FileReader.
 */

public class FileReaderDemo {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("data/test.txt");

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}