package tech.bts.precourse.samples.classes.cars;

public class Car {

    // Fields / properties
    // (They should be private)
    private String model;
    private int speed;
    private int maxSpeed;

    // Constructor
    // (It should initialize all the fields)
    public Car (String model, int maxSpeed) {
        this.model = model;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    // Methods / functions

    public void accelerate(int amount) {

        this.speed = this.speed + amount;

        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    public void decelerate(int amount) {

        this.speed = this.speed - amount;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    // This kind of method is called "getter"
    public int getSpeed() {
        return this.speed;
    }

    // This is a special method that is called implicitly sometimes
    public String toString() {
        return this.model + " driving at " + this.speed + "km/h";
    }
}
