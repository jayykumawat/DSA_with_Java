package file_handling;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Demonstrates writing data to a file using FileWriter.
 */

public class FileWriterDemo {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("data/test.txt");

            writer.write("Hello from Java FileWriter\n");
            writer.write("This line is written by the program.");

            writer.close();

            System.out.println("File written successfully");

        } catch (IOException e) {

            System.out.println("Error writing file");

        }
    }
}