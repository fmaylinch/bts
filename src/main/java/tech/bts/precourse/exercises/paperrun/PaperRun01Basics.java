package tech.bts.precourse.exercises.paperrun;

public class PaperRun01Basics {

    public static void main(String[] args) {

        int x;
        x = 5;
        int y = 7;
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x += y;
        y = x - y;
        x -= y;

        System.out.println("x = " + x + ", y = " + y);
    }
}
