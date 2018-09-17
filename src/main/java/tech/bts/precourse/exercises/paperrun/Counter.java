package tech.bts.precourse.exercises.paperrun;

public class Counter {

    private int number;

    public Counter(int start) {
        this.number = start;
    }

    public void decrease() {
        this.number -= 1;
    }

    public boolean isZero() {
        return this.number == 0;
    }
}
