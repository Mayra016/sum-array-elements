import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumParts(new int[]{1, 2, 3})));
    }

    public static int[] sumParts(int[] ls) {
        int[] sum = new int[ls.length + 1];

        for (int i = 0; i <= ls.length; i++) {
            int num = 0;

            if (i == ls.length) {
                sum[i] = 0;
            } else {

                for (int index = i; index < ls.length; index++) {
                    num = num + ls[index];
                }
                sum[i] = num;
            }
        }

        return sum;
    }
}
