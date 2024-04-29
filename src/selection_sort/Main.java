package selection_sort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int searchForSmall(int[] arr){
        int small = arr[0];
        int small_index = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
                small_index = i;
            }
        }
        return small_index;
    }
    public static List<Integer> selectionSort(int[] arr){
        List<Integer> intList = new ArrayList<>();    
        for(int i = 0; i < arr.length; i++){
            int small_index = searchForSmall(arr);
            intList.add(arr[small_index]);

            arr[small_index] = Integer.MAX_VALUE;
            /*It effectively replaces that value with the largest possible value that an integer can hold in Java. 
            This ensures that the smallest element is no longer considered in future iterations, as it is unlikely that another element in the list would have that value.*/
        }      
        return intList;
    }
    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(selectionSort(array));
    }
}
