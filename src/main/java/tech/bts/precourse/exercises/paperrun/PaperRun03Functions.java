package tech.bts.precourse.exercises.paperrun;

public class PaperRun03Functions {

    public static void main(String[] args) {

        int x = -7;
        int y = 4;

        int ax = abs(x);
        int ay = abs(y);

        int am = max(ax, ay);
        System.out.println("am = " + am);

        int m = max( x, y );
        System.out.println("m = " + m);

        int am2 = max( abs(x), abs(y) );
        System.out.println("am2 = " + am2);

        int am3 = absMax(x, y);
        System.out.println("am3 = " + am3);
    }

    /** maximum number */
    public static int max(int a, int b) {

        int result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

    /** absolute number */
    public static int abs(int x) {

        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    /** maximum of absolute numbers */
    public static int absMax(int num1, int num2) {

        int num1a = abs(num1);
        int num2a = abs(num2);
        int result = max(num1a, num2a);
        return result;
    }
}
