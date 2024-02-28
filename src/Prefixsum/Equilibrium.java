package Prefixsum;

public class Equilibrium {
    public static void main(String[] args)
    {
        int[] arrays = {-7, 1, 5, 2, -4, 3, 0};
        int[] prefixSum = new int[7];
        for(int i=0;i<arrays.length;i++)
        {
            if(i == 0)
            {
                prefixSum[i] = arrays[i];
            }
            else
          prefixSum[i] = arrays[i] + prefixSum[i-1];
            System.out.println(prefixSum[i]);
        }

        int N = prefixSum.length;
        for(int i=0;i<N;i++)
        {
            int leftSum;
            int rightSum;
            if(i==0)
                leftSum = 0;
            else
            leftSum = prefixSum[i - 1];
            if(i==N-1)
                rightSum = 0;
            else
            rightSum = prefixSum[N - 1] - prefixSum[i];
            if(leftSum == rightSum)
            {
                 System.out.println(i);
            }
        }

    }

}
