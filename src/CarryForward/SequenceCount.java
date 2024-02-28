package CarryForward;

public class SequenceCount {

    public static void main(String[] args) {
        String s = "ABCGAG";
        int count = 0;
        int countOfA = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'A')
            {
                countOfA++;
            }
        }
    }
}
