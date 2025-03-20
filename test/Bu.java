package test;
import java.util.*;

public class Bu {

  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j]> arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = new int[10];
    System.out.println("enter the number one by one after the inter");
    int i = 0;
    while (i != array.length) {
      array[i] = sc.nextInt();
      i++;
    }
    bubbleSort(array);

    for (int number : array) {
      System.out.print(" "+number);
    }

  }
}