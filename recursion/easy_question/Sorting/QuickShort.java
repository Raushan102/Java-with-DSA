package recursion.easy_question.Sorting;

import java.util.Arrays;

public class QuickShort {

    public static void quickShort(int [] arr,int start,int end){
        if(start>=end){
            return;
        }

        int mid=start+(end-start)/2;
        int s=start;
        int e=end;
        int pivot=arr[mid];

        while(s<=e){

            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }

        quickShort(arr,start,e);
        quickShort(arr,s,end);

    }
    public static void main(String[] args) {
   int arr []={23,456,32,78,34,1};
   quickShort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
