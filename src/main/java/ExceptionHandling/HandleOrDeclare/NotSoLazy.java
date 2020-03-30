package ExceptionHandling.HandleOrDeclare;

/**
 * @author Matthaiakis Stergios
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NotSoLazy {
    private String fileName;

    public NotSoLazy(String name) {
        fileName = name;
    }

    public byte readOneByte() throws IOException {
        FileInputStream file = null;
        byte x = -1;

        System.out.println("Opening file for reading...");
        file = new FileInputStream(fileName);
        System.out.println("Just opened file: " + fileName);
        System.out.println("Reading one byte from file...");
        x = (byte) file.read();

        System.out.println("Just read " + x);
        return x;
    }
}