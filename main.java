import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumParts(new int[]{1, 2, 3})));
    }

    public static int[] sumParts(int[] ls) {
        int[] sum = new int[ls.length + 1];

        for (int i = 0; i < ls.length; i++) {
            sum[i] = Arrays.stream(ls).reduce(0, Integer::sum);
            
            ls[i] = 0;
        }
        sum[ls.length] = 0;
        
        return sum;
    }
}
