package recursion.easy_question.Sorting;

import java.util.Arrays;

public class mergeSortByIndex {

    public static void mergeShortByPlace(int [] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=(e+s)/2;
        mergeShortByPlace(arr,s,mid);
        mergeShortByPlace(arr,mid,e);
        Merge(arr,s,mid,e);

    }

    public static void Merge(int[] arr, int s, int mid, int e) {
         int [] mix= new int[e-s];
         int i=s;
         int j=mid;
         int k=0;
         while(i <mid && j<e){
             if(arr[i]<arr[j]){
               mix[k]=arr[i];
               i++;
             }else{
                 mix[k]=arr[j];
                 j++;
             }
             k++;
         }

         while(i<mid){
              mix[k]=arr[i];
              i++;
              k++;
         }
         while(j<e){
             mix[k]=arr[j];
             j++;
             k++;
         }

         for(int l=0;l<mix.length;l++){
             arr[s+l]=mix[l];
         }


    }

    public static void main(String[] args) {
        int arr []={5,4,3,2,1};
        mergeShortByPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
