package arrayProblem;

public class Problem_04 {
  public static void main(String[] args) {
    int count = 1;
    for (int i = 1; i <= 5; i++) {
      if (i % 2 == 0) {
        
        count = 0;
      } else {
        count = 1;
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(count);
        count = count == 1 ? 0 : 1;
      }

      System.out.println();
    }
  }
}

// 1 
// 01 
// 101 
// 0101 
// 10101
