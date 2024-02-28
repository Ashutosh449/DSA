package Arrays;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int [] array = {2,4,1,6,7};
        int n = array.length;
        int numberOfRotation = 2;
        int low = 0;
        int high = n-numberOfRotation-1;
        reverse(low,high,array);
        low = high+1;
        high = n-1;
        reverse(low,high,array);
        low = 0;
        high = n-1;
        reverse(low,high,array);
        System.out.println(Arrays.toString(array));

    }
    public static void reverse(int low,int high,int[] array)
    {
        while(low<=high)
        {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }
}
