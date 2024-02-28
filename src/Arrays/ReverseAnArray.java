package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
         int[] a = {2,3,5,6,8,9,1};
         int i = 0;
         int j = a.length-1;
         while(i<=j)
         {
           int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
           i++;
           j--;
         }
        System.out.println(Arrays.toString(a));
    }
}
