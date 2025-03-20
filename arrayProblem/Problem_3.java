//Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
// missing number from the first N integers.There are no duplicates in the list.
package arrayProblem;

public class Problem_3 {

  static int check(int arr[]) {
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      if (count != arr[i]) {
        return count;
      }
      count++;
    }

    return -1;
  }

  public static void main(String[] args) {
        int array []={1,2,3,4,6,7,8,9};
       int result= check(array);

       if(result==-1){
        System.out.println("no number is missing");
       }else{
        System.out.println("missed number is = "+result);
       }
  }
}
