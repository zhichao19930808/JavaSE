package Collection;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/7.
 */
public class _2DArray {
    public static void main(String[] args) {
        String[][] strings = {
                {"a", "b"},
                {"c"},
                {"d", "e"},
                {"f", "g", "h"},
                {""}
        };

        int[][] ints = new int[5][];
        ints[0] = new int[2];
        // ...
        ints[4] = new int[1];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(strings[strings.length - 1][strings[strings.length - 1].length - 1]);

        System.out.println(Arrays.deepToString(strings));
    }
}