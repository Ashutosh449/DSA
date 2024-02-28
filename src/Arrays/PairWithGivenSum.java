package Arrays;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] array = {2,4,6,3,9,1,5};
        int sum = 6;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
               if (array[i]+array[j] == sum)
               {
                   System.out.println(i + "" + j);
                   break;
               }
            }
        }
    }
}
