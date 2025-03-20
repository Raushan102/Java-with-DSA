package test;

public  class First {

  public static void main(String[] args) {
    Animal one =new Animal();
    Dog dog1 = new Dog(); 
    dog1.eat();
    one.eat();
  }
  
}
 class Animal {
  public static void eat() {
    System.out.println("animal is eating");
  }
}

 class Dog extends Animal {
  public static void eat() {
    System.out.println("dog can bark");
  }
}
