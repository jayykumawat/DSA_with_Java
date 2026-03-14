package file_handling;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Demonstrates writing data using FileOutputStream.
 */

public class FileOutputStreamDemo {

    public static void main(String[] args) {

        try {

            FileOutputStream fos =
                    new FileOutputStream("data/test.txt",true);

            String message = "Hello from FileOutputStream";

            byte[] data = message.getBytes();

            fos.write(data);

            fos.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}