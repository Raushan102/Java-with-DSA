package recursion.easy_question;

public class SelectionShort {
    public  static  void  printer(int arr[]){
        System.out.println("yes it called ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }


    public static  void  selectionShort(int [] arr)
    {

        helper(arr,0,1,0);
        return;
    }

    public static  void  helper(int [] arr,int i ,int j,int current){

        if(i== arr.length){
            printer(arr);
            return ;
        }

        if(j == arr.length) {

            int temp = arr[i];
            arr[i] = arr[current];
            arr[current] = temp;

            ++i;
            current = i;
            j = i+1;
            helper(arr, i, j, current);
            return;

        }
        if(arr[current] > arr[j]){
            current =j;
            helper(arr, i, ++j,current);
            return;
        }

        helper(arr,i,++j,current);
        return;

    }
    public static void main(String[] args) {
        int arr []={2,45,6,6,777};
        selectionShort(arr);

    }
}


