package twoD_Array;

public class Search_in_sorted_Matrix {
  public static boolean search(int arr[][], int key) {
    int startRow = 0;
    int endRow = arr.length - 1;
    int endCol = arr[0].length - 1;
    int startCol = 0;
    boolean isPresent=false;
    while (startRow <= endRow && endCol >= startCol) {
      if (arr[startRow][endCol] == key) {
          isPresent=true;
            System.out.println("index of the key is = "+"["+ startRow +"]" + "[" + endCol + "]");
            return isPresent;
      }

      if(arr[startRow][endCol] < key){
         startRow++;
      }else{
        endCol--;
      }
      
    }
    
    return isPresent;
    
  }

  public static void main(String[] args) {

    int array[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
    int key=30;
    if(!search(array, key)){
       System.out.println("key not present in the matrix");
    }

  }

}
