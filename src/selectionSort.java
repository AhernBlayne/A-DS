import java.util.Arrays;

public class selectionSort {
    public static void selectSort(int[] a){
        // sorting in ascending order
        int index = 0;
        int min;
        int temp;
        for(int i =0; i <= a.length-1;i++){
            // find index such that a[index] is the smallest of a[i] ..... [a.length-1]
           // if index i, swap a[index] and a[i]
                min = i;
                for(int j = i+1; j < a.length ; j++){
                    if(a[j] < a[min]){
                      min = j;
                    }
                    temp = a[min];
                    a[min]  = a[i];
                    a[i] = temp;
                }
        }
        System.out.print(Arrays.toString(a));
    }
}
    