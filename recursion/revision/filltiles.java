package recursion.revision;

public class filltiles {
  
  public static int filler(int n){
    if(n==0 || n==1){
      return 1;
    }
   int vertical=filler(n-1);
   int horizonatal=filler(n-2);

   return vertical+horizonatal;
   
  }
   public static void main(String[] args) {
      System.out.println(filler(2));
   }
}