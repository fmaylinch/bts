package tech.bts.precourse.exercises.paperrun;

public class PaperRun02Flow {

    public static void main(String[] args) {

        int start = 1;
        int end = 6;
        int sum = 0;

        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                int x = i / 2;
                sum += x;
            }
            i++;
        }

        System.out.println(sum * 2);
    }
}
