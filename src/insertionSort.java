import java.util.Arrays;

public class insertionSort {
    public static void insertSort(int[] a){
        /*FOR index from 1 to a.length-1
        val = a[index]
        SET j to index-1
        WHILE j >= 0  AND a[j] > val
        move a[j] right one position
        DECREMENT j
        SET a[j+1] to val */
                int val;
                int temp;
                for(int i = 1; i < a.length;++i){
                    val = a[i];
                    int j = i - 1;
                        while(j >= 0 && a[j] > val){
                            a[j+1] = a[j];
                            j--;
                        }
                        a[j+1] = val;
                    }
        System.out.print(Arrays.toString(a));
                }

    }

