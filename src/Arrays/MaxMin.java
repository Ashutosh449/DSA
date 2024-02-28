package Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] array = {10,20,5,3,40};
        int max = array[0];
        int min = array[0];
        for(int a:array){
            if(a>max)
            {
                max = a;
            }
            if(a<min)
            {
                min = a;
            }

        }
        System.out.println(max + " "+ min);
    }
}
