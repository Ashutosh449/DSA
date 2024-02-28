package Arrays;

public class ElementsGreaterThanItself {
    public static void main(String[] args)
    {
        int[] array = {2,4,8,1,8,-3,8,7,8};
        int max = array[0];
        int count = 0;
        for (int a:array) {
            if(a == max)
                count ++;
            if(a>max) {
                max = a;
                count = 1;
            }
        }
        System.out.println(max + " " + count);

    }
}
