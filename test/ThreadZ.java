package test;
public class ThreadZ extends Thread{
  @Override
    public void run(){
      int i=0;
   while(i!=1000){
    System.out.println("niraj");
    i++;
   }
    }
}
