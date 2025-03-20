package test;

import oops.Student;

public class TestPackage extends Student {

  // ✅ Constructor calling protected constructor
  TestPackage(String name, int rollNumber, float marks) {
    super(name, rollNumber, marks);
  }

 

  public static void main(String[] args) {
    TestPackage st = new TestPackage("Kavya", 34, 9.8f);
    System.out.println(st.name);
  }
}
