package javaStack;

import java.io.*;

public class Test {

  static void deleteFile(File fs) throws Exception {
    boolean b = fs.delete();
    if (b) {
      System.out.println("file deleted successfully");
    } else {
      throw new Exception("can not delete file");
    }

  }

  public static void main(String[] args) throws Exception {
    File fs = null;

    fs = new File("abc.txt");

    if (fs.createNewFile()) {
      System.err.println("file create successfully");
    }
    // read and write though FileReader and Writer

    // FileWriter fw=new FileWriter("test.txt");
    
    //    fw.write("this is a text");

    //  fw.close();

    //  FileReader fr=new FileReader("test.txt");
    //   int ch;
    //  while((ch=fr.read())!=-1){
    //      System.out.print((char)+ ch);
    //  }

    //  fr.close();


    // =============read  write through bufferedWriter and  Reader

    // BufferedWriter fw = new BufferedWriter(new FileWriter(fs));
    // fw.write("this is raushan from doranda college");
    // fw.close();

    // BufferedReader fr = new BufferedReader(new FileReader("abc.txt"));

    // String line = null;
    // while ((line = fr.readLine()) != null) {
    //   System.out.println("readed text is = "+line);
    // }

    //============================================================================
  
    // read and write operation with fileInputStream and outputStream

     FileInputStream fis=new FileInputStream("./javaStack/image.png");
     
     int inputStream;

     FileOutputStream fos=new FileOutputStream("./javaStack/output.png");
     
     while((inputStream=fis.read())!=-1){
      fos.write((byte) inputStream);
     }
     fos.close();
     fis.close();
     

  

    

    // try {
    // deleteFile(fs);
    // } catch (Exception e) {
    // System.err.println(e.getMessage());
    // }

  }
}
