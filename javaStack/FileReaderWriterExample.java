package javaStack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
  public static void main(String[] args) {
    FileReader fr = null;
    FileWriter fw = null;

    try {
      // Reading from the file
      fr = new FileReader("./javaStack/input.txt");
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }

      // Writing to the file
      fw = new FileWriter("./javaStack/output.txt");
      fw.write("Hello, this is a test write.");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fr != null)
          fr.close();
        if (fw != null)
          fw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
