package recursion.easy_question.Sorting;

import java.util.Arrays;

public class QuickShort {

    public static void quickShort(int[] arr) {
        helper(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void helper(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {

            if (arr[s] < pivot) {
                s++;
            }

            if (arr[e] > pivot) {
                e--;
            }

            while (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // recursion call
        helper(arr, low, e);
        helper(arr, s, high);
    }

    public static void main(String[] args) {
        int[] arr = {3, 456, 43, 32, 23, 2};
        quickShort(arr);
    }
}
