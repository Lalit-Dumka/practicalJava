package practicalJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class throwAndThrows_15 {
    public static void readFile(String filename) throws FileNotFoundException,IOException,IllegalArgumentException {
        if (filename.isEmpty()) {
            throw new IllegalArgumentException("Filename cannot be empty.");
        }

        try {
            FileReader fileReader = new FileReader(filename);
            fileReader.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        String filename = "abc.txt";

        try {
            readFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
