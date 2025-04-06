package recursion.easy_question.Sorting;

import java.util.Arrays;

public class InsertionShort {

    public static void insertionShort(int[] arr) {

        int[] arr2 = helper(arr, 1, 0, arr[1]);
        System.out.println(Arrays.toString(arr2));
    }

    // helper function to perform the insertion short

    public static int[] helper(int[] arr, int i, int previous, int current) {
        if (i == arr.length) {
            return arr;
        }


        if (previous >= 0 && arr[previous] > current) {          // check weather element is greater the previous or not
            arr[previous + 1] = arr[previous];                  // swapping element of array
            previous--;
            return helper(arr, i, previous, current);           // make a call to check previous one
        }

        i++;
        arr[previous + 1] = current;                           // set the element in the correct position

        if (i < arr.length) {
            current = arr[i];
            previous = i - 1;
        }


        return helper(arr, i, previous, current);


    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1, 2, 7, 84, 0};
        insertionShort(arr);
    }
}
