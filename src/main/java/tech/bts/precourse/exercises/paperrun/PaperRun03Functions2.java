package tech.bts.precourse.exercises.paperrun;

import java.util.Arrays;
import java.util.List;

public class PaperRun03Functions2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList( 9, 2, 10, 1, 8 );
        int m = maximum( numbers );
        System.out.println("m = " + m);
    }

    private static int maximum(List<Integer> nums) {

        int result = 0;

        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            result = max(result, x);
        }

        return result;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

}
