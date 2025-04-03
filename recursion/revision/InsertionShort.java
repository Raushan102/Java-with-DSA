package recursion.revision;

import java.util.Arrays;

public class InsertionShort {


    public static void insertionShort(int[] arr) {
        System.out.println(Arrays.toString(helper(arr, 1, 0, arr[1])));

    }

    public static int[] helper(int[] arr, int i, int previous, int current) {
        if (i == arr.length) {
            return arr;
        }


        if (previous >= 0 && arr[previous] > current) {
            arr[previous + 1] = arr[previous];
            previous--;
            return helper(arr, i, previous, current);
        }

        i++;
        if (!(i == arr.length)) {
            arr[previous + 1] = current;
            current = arr[i];
            previous = i - 1;
        }

        return helper(arr, i, previous, current);
    }


    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 2, 7, 8, 3};
        insertionShort(arr);
    }
}
