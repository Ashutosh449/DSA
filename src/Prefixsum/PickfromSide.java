package Prefixsum;

import java.util.Scanner;

public class PickfromSide {

    public static void main(String[] args){
        int[] arrays = {5, -2, 3 , 1, 2};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of operations:");
        int Q = scan.nextInt();
        int[] prefixSum = new int[arrays.length];
        for(int i=0;i<arrays.length;i++)
        {
            if(i==0)
                prefixSum[i] = arrays[i];
            else
            prefixSum[i] = prefixSum[i-1] + arrays[i];
            System.out.println(prefixSum[i]);
        }
    }
}
