package oops;

class Hello extends Student {
  String name;

  Hello() {
    System.out.println("Hello default cosntruvtpr ");
  }

  Hello(String name) {
    super("nisha mishra", 34, 100.0f);
    this.name = name;

  }

  // public void status() {
  //   System.out.println("this is the hello method");
  // }

}

public class Student {
  String name;
  int roll_number;
  float marks;

  public void status() {
    System.out.println(name + " pass with = " + marks);
  }

  protected Student(String name, int roll_number, float marks) {
    this.name = name;
    this.roll_number = roll_number;
    this.marks = marks;
  }

  Student() {
    this("nisha mishra", 34, 100.0f);
  }

  public static void main(String[] args) {
    Student st = new Hello("Raushan");
    st.status();
  }

}

