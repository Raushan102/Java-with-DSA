package javaStack;

import java.io.*;

public class BufferedReaderWriterExample {
  public static void main(String[] args) {
    BufferedReader br = null;
    BufferedWriter bw = null;

    try {
      // Reading from the file
      br = new BufferedReader(new FileReader("./javaStack/input.txt"));
      String line;

      // Writing to the file
      bw = new BufferedWriter(new FileWriter("./javaStack/output.txt"));

      while ((line = br.readLine()) != null) {
        System.out.println(line);
        bw.write(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null)
          br.close();
        if (bw != null)
          bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
