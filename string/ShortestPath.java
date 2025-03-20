package string;

// question 2 
//  given a route containing 4 directions (E,W,N,N)  find the shortest path to reach destination 

//  WNEENESENNN

//  to solve the problem we use displacement formula underoot (x1 - x2 )^2+  (y2-y1)^2

public class ShortestPath {

  public static void findShortestPath(String str) {

    int x2 = 0;
    int y2 = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'W') {
        x2--;
      } else if (str.charAt(i) == 'E') {
        x2++;

      } else if (str.charAt(i) == 'N') {
        y2++;
      } else {
        y2--;
      }

    }
    System.out.println(x2 + " " + y2);

    int data = x2 * x2 + y2 * y2;
    System.out.println(data);

    System.out.println((float) Math.sqrt(data));
  }

  public static void main(String[] args) {
    String str = "WNEENESENNN";
    findShortestPath(str);
  }
}
