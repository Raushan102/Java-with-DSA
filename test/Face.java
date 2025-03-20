package test;

interface Animal {
  void eat();
  void run();
  
}

 class Dog implements Animal   {
 
  public  void eat(){
      System.out.println("dogs can eat bones");
  }
  public void run(){
    System.out.println("dogs can run faster ");
  }
  
  
}

public  class Face {
   public static void main(String[] args) {
    Dog lebra = new Dog();
    lebra.eat();
   }
}
