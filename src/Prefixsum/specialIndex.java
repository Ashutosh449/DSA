package Prefixsum;
import java.util.Arrays;

public class specialIndex {
    public static void main(String[] args) {
        int[] arrays = {2, 1, 6, 4};
        int[] arr_new = new int[arrays.length - 1];
        int N = arr_new.length;
        int count=0;
        int[] prefixSumEven = new int[N];
        int[] prefixSumOdd = new int[N];
        for (int index = 0; index < arrays.length; index++) {
            for (int i = 0, k = 0; i < arrays.length; i++) {
                if(i==index)
                    continue;
                arr_new[k] = arrays[i];
                if(k==0) {
                    prefixSumEven[k] = arr_new[k];
                    prefixSumOdd[k] = 0;
                }
                else if (k%2 == 0) {
                    prefixSumEven[k] = arr_new[k] + prefixSumEven[k - 1];
                    prefixSumOdd[k] = prefixSumOdd[k-1];
                }
                else {
                    prefixSumEven[k] = prefixSumEven[k-1];
                    prefixSumOdd[k] = arr_new[k] + prefixSumOdd[k - 1];
                }
                    k++;
            }
            System.out.println(Arrays.toString(arr_new));
            System.out.println(Arrays.toString(prefixSumEven));
            System.out.println(Arrays.toString(prefixSumOdd));
            if(prefixSumEven[N-1] == prefixSumOdd[N-1])
            {
                count++;
            }

        }
        System.out.println("count of array index:"+ count);
    }
}
