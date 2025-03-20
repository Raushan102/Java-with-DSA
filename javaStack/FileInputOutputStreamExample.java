
package javaStack;

import java.io.*;

public class FileInputOutputStreamExample {
  public static void main(String[] args) {
    FileInputStream fis = null;
    FileOutputStream fos = null;

    try {
      // Reading from the file
      fis = new FileInputStream("./javaStack/image.png");
      int byteRead;
     
      // Writing to the file
      fos = new FileOutputStream("./javaStack/output.png");
      while ((byteRead = fis.read()) != -1) {  
        fos.write((byte) byteRead); 
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fis != null)
          fis.close();
        if (fos != null)
          fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
