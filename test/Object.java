package test;
public class Object {
  public static void main(String[] args) {
    Student student1 = new Student("niraj", 28);
    Student student2 = new Student("raushan", 27);
    Student student3 = new Student("Aryan", 29);
    student1.printStudent();
    student2.printStudent();
    student3.printStudent();

  }
}

class Student {
  String name;
  int Roll_number;

  Student(String name, int Roll_number) {
    this.name = name;
    this.Roll_number = Roll_number;
  }

  public void printStudent() {
    System.out.println("{" + "Name : " + this.name + " , " + "Roll_number : " + this.Roll_number+"}");
  }
}