package tech.bts.precourse.samples.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO", 300);
        Car audi = new Car("Audi A8", 250);

        ferrari.accelerate(100);
        ferrari.accelerate(100);
        ferrari.decelerate(50);
        audi.accelerate(500);

        // System.out.println() calls toString() method by default
        System.out.println( ferrari );
        System.out.println( audi );

        int speed1 = ferrari.getSpeed();
        int speed2 = audi.getSpeed();

        int difference = speed1 - speed2;
        System.out.println("difference = " + difference);

    }
}
