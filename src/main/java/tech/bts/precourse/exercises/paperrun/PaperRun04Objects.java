package tech.bts.precourse.exercises.paperrun;

public class PaperRun04Objects {

    public static void main(String[] args) {

        Counter counter;
        counter = new Counter(3 );

        counter.decrease();

        boolean finished = counter.isZero();
        System.out.println("finished = " + finished);

        counter.decrease();
        counter.decrease();

        System.out.println("reached zero? " + counter.isZero());

        int number = 2;
        Counter counter2 = new Counter(number);
        for (int i = 0; i <= number; i++) {
            counter2.decrease();
        }
        System.out.println("zero? " + counter2.isZero());
    }
}
